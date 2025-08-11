import data.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số lượng học sinh: ");
        ArrayList<Student> students = new ArrayList<>();
        int numberOfStudent = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < numberOfStudent; i++){
            System.out.println("Nhập sinh viên thứ " + (i+1) + ": ");
            Student student = new Student();
            student.input(sc);
            students.add(student);
        }
        System.out.println("Danh sách sinh viên: ");
        for(Student st : students){
            st.output();
            System.out.println("--------------------");
        }
    }
}