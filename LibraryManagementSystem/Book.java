public class Book {
    public String title;
    public String author;
    private String isbn;
    int copiesAvailable;
    public Book(String t,String a,String i,int c){
        title = t;
        author = a;
        isbn = i;
        copiesAvailable = c;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setCopiesAvailable(int copies) {
        copiesAvailable = copies;
    }

    int getCopiesAvailable() {
        return copiesAvailable;
    }
}

