import java.util.Scanner;

public class Bai2 {
    public static Scanner sc = new Scanner(System.in);
    public static final double PI = 3.14159265;

    public static double nhapBanKinh() {
        System.out.print("Nhập bán kính: ");
        return sc.nextDouble();
    }

    public static int nhapK() {
        System.out.print("Nhập số k: ");
        return sc.nextInt();
    }

    public static void tinhChuVi(double r) {
        double chuVi = 2 * PI * r;
        System.out.println("Chu vi = " + chuVi);
    }

    public static void tinhDienTich(double r) {
        double dienTich = PI * Math.pow(r, 2);
        System.out.println("Diện tích = " + dienTich);
    }

    public static void canBacHai(double r, int k) {
        double ketQua = Math.sqrt(r + k);
        System.out.println("Căn bậc 2 của (" + r + " + " + k + ") = " + ketQua);
    }

    public static void triTuyetDoi(double r, int k) {
        double ketQua = Math.abs(r - k);
        System.out.println("Giá trị tuyệt đối của (" + r + " - " + k + ") = " + ketQua);
    }

    public static void main(String[] args) {
        double r = nhapBanKinh();
        int k = nhapK();
        tinhChuVi(r);
        tinhDienTich(r);
        canBacHai(r, k);
        triTuyetDoi(r, k);
    }
}
