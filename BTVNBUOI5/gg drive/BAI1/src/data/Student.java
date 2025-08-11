package data;

import java.util.Scanner;

public class Student {
    private String Name;
    private String className;
    private Double Score;
    private Faculty y;

    public Student() {
    }
    public Student(String name, String className, Double score, Faculty y) {
        Name = name;
        className = className;
        Score = score;
        this.y = y;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClass(String className) {
        this.className = className;
    }

    public Double getScore() {
        return Score;
    }

    public void setScore(Double score) {
        this.Score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }
    public void input(Scanner sc){
        System.out.print("Nhập tên của sinh viên: " );
        this.Name = sc.nextLine();
        System.out.print("Nhập lớp của sinh viên: ");
        this.className = sc.nextLine();
        System.out.print("Nhập điểm số của sinh viên: ");
        this.Score = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập khoa của sinh viên: ");
        y = new Faculty();
        y.input(sc);
    }
    public void output(){
        System.out.println("Tên sinh viên: " + Name);
        System.out.println("Lớp: " + className);
        System.out.println("Điểm số: " + Score);
        System.out.println("Thông tin khoa:");
        y.output();
    }
}
