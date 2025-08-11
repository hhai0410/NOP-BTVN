package data;

import java.util.Scanner;

public class Faculty {
    private String Name;
    private String Date;
    private School x;

    public Faculty() {
    }

    public Faculty(String name, String date, School x) {
        Name = name;
        Date = date;
        this.x = x;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }
    public void input(Scanner sc){
        System.out.print("Nhập tên khoa: ");
        this.Name = sc.nextLine();
        System.out.print("Nhập ngày vào khoa(dd/mm/yyyy): ");
        this.Date = sc.nextLine();
        System.out.println("NHẬP THÔNG TIN VỀ TRƯỜNG: ");
        x = new School();
        x.input(sc);
    }
    public void output(){
        System.out.println("Tên khoa: " + Name);
        System.out.println("Ngày vào khoa: " + Date);
        System.out.println("Thông tin trường:");
        x.output();
    }
}
