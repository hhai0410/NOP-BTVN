package data;

import java.util.Scanner;

public class PhongMay {
    private String MaPhong;
    private String TenPhong;
    private Double DienTich;
    private QuanLy x;
    private May[] y;
    private int n;

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, Double dienTich, QuanLy x, May[] y, int n) {
        MaPhong = maPhong;
        TenPhong = tenPhong;
        DienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String maPhong) {
        MaPhong = maPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String tenPhong) {
        TenPhong = tenPhong;
    }

    public Double getDienTich() {
        return DienTich;
    }

    public void setDienTich(Double dienTich) {
        DienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void input(Scanner sc){
        System.out.print("Nhập mã phòng máy: ");
        this.MaPhong = sc.nextLine();
        System.out.print("Nhập tên phòng: ");
        this.TenPhong = sc.nextLine();
        System.out.print("Nhập diện tích phòng: ");
        this.DienTich = sc.nextDouble();
        System.out.print("Nhập số máy của phòng: ");
        this.n = sc.nextInt();
        sc.nextLine();
        this.x = new QuanLy();
        this.x.input(sc);
        this.y = new May[this.n];
        for(int i = 0; i < n; i++){
            System.out.println("NHẬP THÔNG TIN MÁY THỨ " + (i+1));
            this.y[i] = new May();
            this.y[i].input(sc   );
        }
    }
    public void output(){
        System.out.println("Mã phòng: " + this.MaPhong);
        System.out.println("Tên phòng: " + this.TenPhong);
        System.out.println("Diện tích: " + this.DienTich + " m2");
        System.out.println("-----THÔNG TIN NGƯỜI QUẢN LÝ-----");
        x.output();
        for(int i = 0; i < n; i++){
            System.out.println("-----THÔNG TIN MÁY THỨ " + (i+1) + "-----");
            y[i].output();
        }
    }
}
