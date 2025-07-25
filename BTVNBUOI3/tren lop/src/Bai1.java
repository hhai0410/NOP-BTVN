import java.util.Scanner;

public class Bai1 {
    public static Scanner sc = new Scanner(System.in);

    public static int[] enterArray(int n) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
    public static void tongChanLe(int[] arr){
        int tongChan = 0, tongLe = 0;
        for(int i : arr){
            if(i % 2 == 0){
                tongChan += i;
            }else{
                tongLe += i;
            }
        }
        System.out.println("Tổng chẵn: " + tongChan);
        System.out.println("Tổng lẻ: " + tongLe);
    }
    public static boolean check(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) {
                return false;
            }
        }
        return num > 1;
    }
    public static int isPrime(int[] arr){
        int isPrime = 0;
        for(int i : arr ){
            if(check(i)){
                isPrime++;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = enterArray(n);
        printArray(arr);
        tongChanLe(arr);
        System.out.println("Số lượng số nguyên tố là: " + isPrime(arr));
    }
}
