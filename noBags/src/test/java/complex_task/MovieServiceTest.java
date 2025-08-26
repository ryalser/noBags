package complex_task;

import complex_task.task_4.Movie;
import complex_task.task_4.MovieService;
import complex_task.task_4.Rating;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    // Подготовка данных
    MovieService movieService = new MovieService();
    Movie movie = new Movie("Фильм_1", "Драма", 2005);
    Rating<Double> rating = new Rating<>(8.5);


    @Test
    void testAddMovie_Valid() {
        assertDoesNotThrow(() -> movieService.addMovie(movie, rating));
    }

    @Test
    void testAddMovie_InvalidRating() {

        Rating<Double> invalidRating = new Rating<>(0.5);
        assertThrows(IllegalArgumentException.class,
                () -> movieService.addMovie(movie, invalidRating));
    }

    @Test
    void testCalculateAvgRatingMovie() {
        //Передадим фильм и рейтинг методу класса
        movieService.addMovie(movie, rating);
        movieService.addMovie(movie, rating);

        double result = movieService.calculateAvgRatingMovie(movie);
        assertEquals(8.75, result);
    }
}