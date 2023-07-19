package Test;

import Domain.Movie;
import Domain.MovieService;

public class TestMovie {

    public static void main(String[] args) {

        Movie m1 = new Movie(1, "A", "150min", 5.6, "US", "US", "B", "C");
        Movie m2 = new Movie(2,"B", "120min", 8.9, "US", "US", "ren", "mei");

        Movie[] movies = {m1, m2};

        MovieService movieService = new MovieService(movies);

        movieService.start();
    }
}
