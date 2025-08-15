import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính r của hình tròn: ");
        double r = sc.nextDouble();
        System.out.println((2*3.14*r) + " " + 3.14*r*r );
    }
}
