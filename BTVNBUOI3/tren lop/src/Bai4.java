import java.util.Scanner;

public class Bai4 {
    public static Scanner sc = new Scanner(System.in);
    public static int fibonacci(int n){
        if(n <= 2){
            return 1;
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int i = 1;
        System.out.print("Dãy fibonacci đến n là: ");
        while(i <= n){
            System.out.print(fibonacci(i) + " ");
            i++;
        }
    }
}
