package data;

import java.util.Scanner;

public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;

    public May() {
    }
    public May(String maMay, String tenMay, String tinhTrang) {
        MaMay = maMay;
        TenMay = tenMay;
        TinhTrang = tinhTrang;
    }

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String maMay) {
        MaMay = maMay;
    }

    public String getTenMay() {
        return TenMay;
    }

    public void setTenMay(String tenMay) {
        TenMay = tenMay;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }
    public void input(Scanner sc){
        System.out.print("Nhập mã máy: ");
        this.MaMay = sc.nextLine();
        System.out.print("Nhập tên máy: ");
        this.TenMay = sc.nextLine();
        System.out.print("Nhập tình trạng của máy: ");
        this.TinhTrang = sc.nextLine();
    }
    public void output(){
        System.out.println("Mã máy: " + this.MaMay);
        System.out.println("Tên máy: " + this.TenMay);
        System.out.println("Tình trạng máy: " + this.TinhTrang);
    }

}
