package complex_task.task_4;

public class Main {
    public static void main(String[] args) {

        // Создаем фильмы
        Movie movie1 = new Movie("Начало","Фантастика", 2006);
        Movie movie2 = new Movie("Фокус","Фантастика", 2009);
        Movie movie3 = new Movie("Гонки","Драма", 2010);
        Movie movie4 = new Movie("Игра","Драма", 2012);

        MovieService movieService = new MovieService();

        // Установим рейтинги фильмам
        movieService.addMovie(movie1,new Rating<>(2.5));
        movieService.addMovie(movie1,new Rating<>(9.5));
        movieService.addMovie(movie3,new Rating<>(5.5));
        movieService.addMovie(movie4,new Rating<>(7.5));

        // Средний рейтинг фильма movie1
        System.out.println("Средний рейтинг фильма " + movie1 + ": " +
                movieService.calculateAvgRatingMovie(movie1));

        // Вывести топ фильмов
        movieService.sortedMovieByRating();
    }
}
