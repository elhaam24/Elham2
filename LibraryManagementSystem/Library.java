import java.util.ArrayList;
import java.util.List;
public class Library {
    private  List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void registerMember(Member member){
        members.add(member);
    }
    public void lendBook(String isbn, String memberId){
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);
    }
    private Book findBookByIsbn(String isbn){

        Book BookByIsbn = null;
        return BookByIsbn;
    }
    private Member findMemberById(String memberId){

        Member MemberById = null;
        return MemberById;
    }

    public static void main(String[] args){
        Library library = new Library();
        Book book1 = new Book("happy girl", "Lee", "5636", 3);
        Book book2 = new Book("why?", "Han", "64653", 2);
        library.addBook(book1);
        library.addBook(book2);
        Member member1 = new Member("farih", "100");
        Member member2 = new Member("halima", "101");
        library.registerMember(member1);
        library.registerMember(member2);
        library.lendBook("5636", "100");
        library.lendBook("64653", "101");
    }

}