import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Library library = new Library();
        boolean run = true;
        while (run) {
            System.out.println("======CÁC CHỨC NĂNG CỦA THƯ VIỆN======");
            System.out.println("1. Thêm sách vào thư viện");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm sách theo tác giả");
            System.out.println("4. Xóa sách theo mã sách");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("THÊM SÁCH VÀO THƯ VIỆN");
                    System.out.print("Nhập số sách bạn muốn thêm: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập title của sách: ");
                        String title = sc.nextLine();
                        System.out.print("Nhập tác giả: ");
                        String author = sc.nextLine();
                        System.out.print("Nhập giá tiền: ");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Bạn có muốn nhập nhà xuất bản không (y/n)? ");
                        String pubChoice = sc.nextLine();
                        if (pubChoice.trim().equalsIgnoreCase("y")) {
                            System.out.print("Nhập tên nhà xuất bản: ");
                            String publisherName = sc.nextLine();
                            System.out.print("Nhập địa chỉ nhà xuất bản: ");
                            String publisherAddress = sc.nextLine();
                            library.addBook(new Book(title, author, price, new Publisher(publisherName, publisherAddress)));
                        } else {
                            library.addBook(new Book(title, author, price));
                        }
                    }
                    break;

                case 2:
                    System.out.print("Bạn có muốn in nhà xuất bản không (y/n)? ");
                    String showChoice = sc.nextLine();
                    library.displayAllBooks(showChoice.trim().equalsIgnoreCase("y"));
                    break;

                case 3:
                    System.out.print("Nhập tên tác giả cần tìm: ");
                    String name = sc.nextLine();
                    library.searchByAuthor(name);
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    library.removeBookById(deleteId);
                    System.out.print("Bạn có muốn in nhà xuất bản không (y/n)? ");
                    String showAfterDelete = sc.nextLine();
                    library.displayAllBooks(showAfterDelete.trim().equalsIgnoreCase("y"));
                    break;

                case 5:
                    System.out.println("-----KẾT THÚC CHƯƠNG TRÌNH-----");
                    run = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
