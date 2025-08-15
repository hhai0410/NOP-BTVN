import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private Scanner sc = new Scanner(System.in);
    List<Book> books = new ArrayList<>();
    public void addBook(Book book){
        this.books.add(book);
    }
    public void displayAllBooks(boolean showPublisher){
        for(Book i : books) {
            i.displayInfo(showPublisher);
        }
    }
    public void searchByAuthor(String author){
        for(Book i : books){
            if(i.getAuthor().trim().toLowerCase().contains(author.toLowerCase().trim())){
                System.out.println("Bạn có muốn hiển thị publisher(có/không): ");
                boolean publisher;
                if(sc.nextLine().trim().toLowerCase().equals("có")){
                    publisher = true;
                } else {
                    publisher = false;
                }
                i.displayInfo(publisher);
            }
        }
    }
    public void removeBookById(int bookId) {
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bookId) {
                books.remove(i);
                found = true;
                System.out.println("Đã xóa sách có mã: " + bookId);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách có mã: " + bookId);
        }
    }
}
