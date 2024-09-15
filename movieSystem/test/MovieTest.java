package test;
import movie.Movie;
import movie.MovieItem;

public class MovieTest {
    public static void main(String[] args){
        Movie movie = new Movie();
        MovieItem movieItem1 = new MovieItem("Never again" , "Momo");
        MovieItem movieItem2 = new MovieItem("Me too" ,"Misheal");
        movie.addmovieItem(movieItem1);
        movie.addmovieItem(movieItem2);
        movie.printmovieDetails();

    }
}
