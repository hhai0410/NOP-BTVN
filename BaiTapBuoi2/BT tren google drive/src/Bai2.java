import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i < n; i+=2){
            if(i % 2 == 1 && i == n - 1){
                arr[i] +=  arr[i - 1];
            } else if(i % 2 == 1){
                arr[i] += Math.abs(arr[i - 1] - arr[i + 1]);
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
