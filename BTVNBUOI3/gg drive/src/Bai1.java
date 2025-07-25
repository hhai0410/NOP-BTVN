import java.util.Scanner;

public class Bai1 {
    public static Scanner sc = new Scanner(System.in);
    public static final double PI = 3.14159;
    public static final int Square = 1;
    public static final int Triangle = 2;
    public static final int Circle = 3;
    public static int input(){
        System.out.println("Số 1: Hình VUÔNG");
        System.out.println("Số 2: Hình TAM GIÁC");
        System.out.println("Số 3: Hình TRÒN");
        System.out.print("Nhập lựa chọn của bạn: ");
        return sc.nextInt();
    }
    public static boolean check(int type){
        return type == Square || type == Triangle || type == Circle;
    }
    public static boolean checkTamGiac(double a, double b, double c){
        return a + b > c && b + c > a && c + a > b;
    }
    public static void main(String[] args) {
        int type = input();
        if(check(type)){
            System.out.println("Hình dạng hợp lệ!");
            switch(type){
                case 1:
                    System.out.print("Nhập cạnh của viên gạch: ");
                    System.out.println("Diện tích viên gạch là: " + Math.pow(sc.nextDouble(), 2));
                    break;
                case 2:
                    System.out.print("Nhập cạnh a: ");
                    double a = sc.nextDouble();
                    System.out.print("Nhập cạnh b: ");
                    double b = sc.nextDouble();
                    System.out.print("Nhập cạnh c: ");
                    double c = sc.nextDouble();

                    if (checkTamGiac(a, b, c)) {
                        double p = (a + b + c) / 2;
                        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                        System.out.print("Diện tích viên gạch là: " + S);
                    } else {
                        System.out.println("Ba cạnh không tạo thành tam giác hợp lệ.");
                    }
                    break;
                case 3:
                    System.out.println("Nhập bán kính viên gạch: ");
                    System.out.println("Diện tích viên gạch là: " + (PI*Math.pow(sc.nextDouble(), 2)));
                    break;
            }
        }else{
            System.out.println("Hình dạng không hợp lệ!");
        }
    }
}
