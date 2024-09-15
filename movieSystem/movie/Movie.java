package movie;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private List<MovieItem> movieItems;
    public Movie() {
        movieItems = new ArrayList<>();
    }
    public void addmovieItem(MovieItem item){
        movieItems.add(item);
    }
    public void printmovieDetails(){
        for (MovieItem item : movieItems) {
            item.printDetails();
        }
    }
}
