import data.PhongMay;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("-----NHẬP THÔNG TIN PHÒNG MÁY-----");
        PhongMay phongMay = new PhongMay();
        phongMay.input(sc);
        System.out.println("-----THÔNG TIN CỦA PHÒNG MÁY-----");
        phongMay.output();

    }
}