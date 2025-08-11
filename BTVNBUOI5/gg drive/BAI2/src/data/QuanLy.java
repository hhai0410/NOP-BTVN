package data;

import java.util.Scanner;

public class QuanLy {
    private String MaQL;
    private String HoTen;

    public QuanLy() {
    }

    public QuanLy(String maQL, String hoTen) {
        MaQL = maQL;
        HoTen = hoTen;
    }

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String maQL) {
        MaQL = maQL;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }
    public void input(Scanner sc){
        System.out.print("Nhập mã quản lý: ");
        this.MaQL = sc.nextLine();
        System.out.print("Nhập tên người quản lý: ");
        this.HoTen = sc.nextLine();
    }
    public void output(){
        System.out.println("Mã quản lý: " + this.MaQL);
        System.out.println("Tên người quản lý: " + this.HoTen);
    }
}
