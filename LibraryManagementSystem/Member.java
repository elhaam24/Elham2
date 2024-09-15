import java.util.ArrayList;
import java.util.List;
public class Member {
    public String Name;
    private String MemberID;
    private List<Book> BorrowedBooks;
public Member(String N,String M){
    Name = N;
    MemberID = M;
    BorrowedBooks = new ArrayList<>();
}
public String GetMemberID(){
    return MemberID;
}
    public void borrowBook(Book book){
        addBookToBorrowedList(book);
    }
    private void addBookToBorrowedList(Book book){
        List<Book>  borrowedBooks = null;
        borrowedBooks.add(book);
    }


}