import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi của bạn: ");
        int age = sc.nextInt();
        System.out.print("Nhập lớp của bạn: ");
        sc.nextLine();
        String studentClass = sc.nextLine();
        System.out.print("Nhập GPA của bạn: ");
        double gpa = sc.nextDouble();
        System.out.println("Tên: " + name + " - Tuổi: " + age + " - Lớp: " + studentClass + " - GPA: " + gpa );

    }
}
