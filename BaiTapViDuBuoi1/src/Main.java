import java.util.Scanner;
public class Main {
    public static void bai1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cua ban: ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi cua ban: ");
        int age = sc.nextInt();
        System.out.print("Nhap chieu cao cua ban: ");
        double height = sc.nextDouble();
        System.out.println("Hello " + name + ", ban " + age + " tuoi va cao " + height + " met");
    }
    public static void bai2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cua ban: ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi cua ban: ");
        int age = sc.nextInt();
        System.out.print("Nhap lop cua ban: ");
        sc.nextLine();
        String studentClass = sc.nextLine();
        System.out.print("Nhap GPA cua ban: ");
        double gpa = sc.nextDouble();
        System.out.println("Ten: " + name + " - Tuoi: " + age + " - Lop: " + studentClass + " - GPA: " + gpa );
    }
    public static void bai3(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen thu nhat: ");
        int b = sc.nextInt();
        System.out.println("Nhap so nguyen thu hai: ");
        System.out.println("Tong cua 2 so nguyen la: " + (a+ b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baiTap;
        System.out.println("Nhap bai tap muon xem, nhap -1 de thoat");
        while(true)
        {
            System.out.print(">> Nhap bai tap: ");
            baiTap = sc.nextInt();
            switch (baiTap)
            {
                case 1:
                    bai1();
                    break;
                case 2:
                    bai2();
                    break;
                default:
                    System.out.println("Khong co bai tap nay!");
            }

        }
    }
}
