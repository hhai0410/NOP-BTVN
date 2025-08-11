package data;

import java.util.Scanner;

public class School {
    private String Name;
    private String Date;

    public School() {
    }

    public School(String name, String date) {
        Name = name;
        Date = date;
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
    public void input(Scanner sc){
        System.out.print("Nhập tên trường: ");
        this.Name = sc.nextLine();
        System.out.print("Nhập ngày vào trường(dd/mm/yyyy): ");
        this.Date = sc.nextLine();
    }
    public void output(){
        System.out.println("Tên trường của bạn là: " + this.Name);
        System.out.println("Ngày vào trường: " + this.Date);
    }
}
