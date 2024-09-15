package movie;
public class MovieItem {
        private String title;
        private String author;

        public MovieItem(String t, String a) {
            title = t;
            author = a;
        }
        public String getTitle() {
            return title;
        }
        public String getAuthor() {
            return author;
        }
        void printDetails(){
            System.out.println("The title of the movie: " + title + " " + "The Author of the movie: " + author);
        }
    }


