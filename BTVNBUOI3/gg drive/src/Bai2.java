import java.util.Scanner;

public class Bai2 {
    public static Scanner sc = new Scanner(System.in);
    public static String input(){
        System.out.println("Nhập chuỗi bất kì: ");
        return sc.nextLine();
    }
    public static boolean checkDoiXung(String str){
        for(int i = 0; i < (str.length() - 1) / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = input();
        if(checkDoiXung(str)){
            System.out.println(str.toUpperCase());
            System.out.println("Chuỗi đối xứng");
        } else {
            System.out.println(str.toLowerCase());
            System.out.println("Chuỗi không đối xứng");
        }
    }
}
