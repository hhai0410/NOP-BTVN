import java.util.Scanner;

public class Main {
    public static int tinhTong(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Tong = " + tinhTong(a,b));
//        System.out.print("Nhap ten cua ban: ");
//        String yourName = sc.nextLine();
//        System.out.println("Hello " + yourName);
//        System.out.print("Ban bao nhieu tuoi: ");
//        int age = sc.nextInt();
//        if (age < 18){
//            System.out.println("Tre con!");
//        } else {
//            System.out.println("Nguoi lon!");
//        }
//        System.out.println(("---------"));
//        boolean trueOrFalse = sc.nextBoolean();
//        System.out.println((trueOrFalse));
//        System.out.println(("---------"));
//        char oneCharacter = sc.next().charAt(0);
//        System.out.println(("---------"));
//        System.out.println(oneCharacter);
//        System.out.println(("---------"));
//        System.out.println((age));
        // truoc khi nhap string neu da nhap double or int .. phai dung sc.nextLine();
//        int[] arr = new int[5];
//        String[] names = {"Hai", "Duc", "Tien"};
        // so sanh chuoi
//        String a = "Hello";
//        String b = new String("Hello");
//
//        System.out.println(a == b);        // false (so sánh địa chỉ)
//        System.out.println(a.equals(b));   // true (so sánh nội dung)

    }
}