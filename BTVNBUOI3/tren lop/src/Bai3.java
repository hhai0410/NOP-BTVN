import java.util.Scanner;

public class Bai3 {
    public static Scanner sc = new Scanner(System.in);
    public static String  input(){
        System.out.print("Nhập 1 chuỗi từ bàn phím: ");
        String a = sc.nextLine();
        return a;
    }
    public static String xoaKhoangTrang(String a){
        return a.trim();
    }
    public static boolean checkDoiXung(String a){
        String check = a.replaceAll("\\s+", "");
        check = check.toLowerCase();
        for(int i = 0; i < check.length(); i++) {
            if (check.charAt(i) != check.charAt(check.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String text = input();
        text = xoaKhoangTrang(text);
        System.out.println("Chuỗi sau khi xóa khoảng trắng là: " + text);
        if (checkDoiXung(text)){
            System.out.println("Chuỗi đối xứng");
        } else {
            System.out.println("Chuỗi không đối xứng");
        }
    }
}
