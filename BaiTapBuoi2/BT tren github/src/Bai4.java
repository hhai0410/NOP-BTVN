import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mảng gồm 5 phần tử: ");
        int[] arr = new int[5];
        // nhập mảng
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        // in mảng
        int sum = 0;
        int max = arr[0];
        System.out.print("Mảng của bạn vừa nhập là: ");
        for(int i : arr){
            System.out.print(i + " ");
            sum += i;
            if(max < i){
                max = i;
            }
        }
        System.out.println();
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
