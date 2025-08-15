import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("BẢNG CỬU CHƯƠNG CỦA SỐ 5");
        for(int i = 1; i <= 10; i++){
            System.out.println(" 5 x " + i + " = " + (5 * i));
        }
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn từ 1 đến 100 là: " + sum);
//        int i = 1;
//        while(i <= 10)
//        {
//            System.out.println(" 5 x " + i + " = " + (5 * i));
//            i++;
//        }
//        int a = 1;
//        while(a <= 100){
//            if(i % 2 == 0){
//                sum += i;
//            }
//            a++;
//        }
//        System.out.println("Tổng các số chẵn từ 1 đến 100 là: " + sum);
//
    }
}
