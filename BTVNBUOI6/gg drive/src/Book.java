public class Book {
    private static int nextId = 1;
    private int bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(String title, String author, double price, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.bookId = nextId++;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = new Publisher();
        this.bookId = nextId++;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void displayInfo(){
        System.out.println("Book ID: " + bookId + ", Price: " + this.price);
        System.out.println("Title: " + this.title + ", Author: " + this.author);
    }
    public void displayInfo(boolean showPublisher){
        if(showPublisher) {
            System.out.println("Book ID: " + bookId + ", Price: " + this.price);
            System.out.println("Title: " + this.title + ", Author: " + this.author);
            System.out.println("Publiser name: " + publisher.getName() + ", address: " + publisher.getAddress());
        } else{
            System.out.println("Book ID: " + bookId + ", Price: " + this.price);
            System.out.println("Title: " + this.title + ", Author: " + this.author);
            System.out.println("Publisher: Unknown");
        }
    }

}
