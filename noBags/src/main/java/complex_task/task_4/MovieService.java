package complex_task.task_4;

import javax.net.ssl.SSLContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class MovieService {

    // Потокобезопасная коллекция хранящая фильмы и их рейтинги
    // Ключ - экземпляр Movie, значение - список рейтингов
    Map<Movie, List<Rating<? extends Number>>> ratingMovies = new ConcurrentHashMap<>();


    /**
     * Добавить новый фильм
     *
     * @param movie
     * @param rating
     */
    public synchronized void addMovie(Movie movie, Rating<? extends Number> rating) {

        // Проверим входящий рейтинг нпо условию, предварительно приведя к типу double
        double value = rating.getValue().doubleValue();
        if (value < 1 || value > 10) {
            throw new IllegalArgumentException("Значение оценки должно быть в диапазоне от 1 до 10");
        }

        // Если нет рейтинга, создадим новый список для данного фильма - movie
        List<Rating<? extends Number>> ratings = ratingMovies.computeIfAbsent(
                movie, s -> new CopyOnWriteArrayList<>());

        // Добавим в список новый рейтинг
        ratings.add(rating);
    }


    /**
     * Метод для добавления оценки к фильму
     * @param movie
     * @return
     */
    public double calculateAvgRatingMovie(Movie movie) {

        // Рейтинги данного фильма запишем в коллекцию
        List<Rating<? extends Number>> ratings = ratingMovies.get(movie);

        if (ratings == null || ratings.isEmpty()) {
            return 0.0;
        }

        // Если есть рейтинги - считаем путем перебора коллекции
       return ratings.stream() // запускаем поток

                // Записываем каждый элемент в переменную r
                // Предварительно сделав значение double
                .mapToDouble(r -> r.getValue().doubleValue())
                .average()
                .orElse(0.0);
    }


    /**
     * Получить топ фильмов
     */
    public void sortedMovieByRating () {

        // Создаем список фильмов, в него запишем все ключи ratingMovies
        List<Movie> sortedMovies = new ArrayList<>(ratingMovies.keySet())
                .stream()
                .sorted((v1, v2) -> Double.compare(calculateAvgRatingMovie(v2), calculateAvgRatingMovie(v1)))
                .collect(Collectors.toList());

        System.out.println("Топ фильмов: ");
        for (int i = 0; i < sortedMovies.size(); i++) {
            Movie movie1 = sortedMovies.get(i);
            System.out.println(movie1.getTitle());
        }
    }
}




