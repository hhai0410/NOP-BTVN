import java.util.Scanner;
class phepToan{
    int a;
    int b;
    int c;
}
public class Bai3 {
    public static Scanner sc = new Scanner(System.in);
    public static void random(phepToan nums){
        double check = (Math.random());
        if(check < 0.5){
            nums.a = (int)(Math.random() * 100) + 1;
            nums.b = (int)(Math.random() * 100) + 1;
            nums.c = (int)(Math.random() * 200) + 1;
        }
        else{
            nums.a = (int)(Math.random() * 100) + 1;
            nums.b = (int)(Math.random() * 100) + 1;
            nums.c = nums.a + nums.b;
        }
        System.out.println("Phép toán của bạn là: " + nums.a + " + " + nums.b + " = " + nums.c);
    }
    public static void check(String input, phepToan nums){
        if(((input.equals("dung") && nums.a + nums.b == nums.c) ) || (input.equals("sai") && nums.a + nums.b != nums.c)){
            System.out.println("Bạn đã dự đoán đúng!");
        }else{
            System.out.println("Sai rồi!");
        }
    }
    public static void main(String[] args) {
        phepToan numbers = new phepToan();
        random(numbers);
        System.out.println("Đưa ra lựa chọn của bạn (dung/sai): ");
        String choice = sc.nextLine().trim().toLowerCase();
        check(choice, numbers);
    }
}
