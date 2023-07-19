package Domain;

import java.util.Scanner;

public class MovieService {

    private Movie[] movies;

    public Scanner sc = new Scanner(System.in);

    public MovieService(Movie[] movies) {
        this.movies = movies;
    }

    public void start() {

        w:
        while(true) {

            System.out.println("1. Show all movie title");
            System.out.println("2. Search by movie id");
            System.out.println("3. Goodbye");

            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    queryMovieInfoByTitle();
                    break;
                case 2:
                    queryMovieInfoByID();
                    break;
                case 3:
                    System.out.println("Goodbye");
                    break w;
                default:
                    System.out.println("error");
                    break;
            }
        }
    }

    private void queryMovieInfoByTitle() {

        for(int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            System.out.println(movie.getTitle() + "---" + movie.getScore());

        }
    }

    private void queryMovieInfoByID() {

        System.out.println("Type movie id:");

        int id = sc.nextInt();

        for (int i = 0; i < movies.length; i++) {    // for (Movie m : movies)
            Movie movie = movies[i];

            if (movie.getId() == id) {
                System.out.println(movie.getTitle() + "--" + movie.getId());
                return;
            }
        }
        System.out.println("Can't find the selected movie");
    }
}
