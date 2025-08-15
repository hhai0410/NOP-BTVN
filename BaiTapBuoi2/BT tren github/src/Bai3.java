import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while(check){
            System.out.print("Nhập số thứ nhất: ");
            int a = sc.nextInt();
            System.out.print("Nhập số thứ hai: ");
            int b = sc.nextInt();
            System.out.println("a + b = " + (a+b));
            System.out.println("a - b = " + (a-b));
            System.out.println("a * b = " + (a*b));
            System.out.println("a / b = " + (a/b));
            if(a==b){
                System.out.println(a + " có bằng " + b);
            } else{
                System.out.println(a + " không bằng " + b);
            }
            System.out.println("Nhập true để tiếp tục, false để kết thúc");
            check = sc.nextBoolean();
        }
    }
}
