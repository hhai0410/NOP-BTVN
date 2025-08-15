import java.util.Scanner;
public class BaiTap {
    public static void bai1(){
        Scanner s   c = new Scanner(System.in);
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
        String name = sc.nextLine();
        System.out.print("Nhap ten cua ban: ");
        int age = sc.nextInt();
        System.out.print("Nhap tuoi cua ban: ");
        int studentClass = sc.nextInt();
        System.out.print("Nhap lop cua ban: ");
        double gpa = sc.nextDouble();
        System.out.print("Nhap GPA cua ban: ");
        System.out.println("Ten: " + name + " - Tuoi: " + age + " - Lop: " + studentClass + " - GPA: " + gpa );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baiTap = sc.nextInt();
        System.out.println("Nhap bai tap muon xem, nhap -1 de thoat");
        while(-1 != baiTap)
        {
            switch (baiTap)
            {
                case 1:
                    bai1();
                    break;
                case 2:
                    bai2();
                    break;
            }

        }
    }
}
