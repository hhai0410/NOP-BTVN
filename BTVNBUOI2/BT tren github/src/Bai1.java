import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi của bạn: ");
        int age = sc.nextInt();
        System.out.print("Nhập chiều cao của bạn: ");
        double height = sc.nextDouble();
        System.out.println("Hello " + name + ", bạn " + age + " tuổi và cao " + height + " mét");
    }
}
