import java.util.Scanner;
class Student{
    String name;
    int age;
    double gpa;
}
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sinh viên cần lưu trữ: ");
        int n = sc.nextInt();
        Student[] StudentList = new Student[n];
        // nhập DS SV
        for(int i = 0; i < n; i++){
            sc.nextLine();
            StudentList[i] = new Student();
            System.out.print("Nhập tên sinh viên thứ " + (i+1) + ": " );
            StudentList[i].name = sc.nextLine();
            System.out.print("Nhập tuổi sinh viên thứ " + (i+1) + ": ");
            StudentList[i].age = sc.nextInt();
            System.out.print("Nhập GPA sinh viên thứ " + (i+1) + ": ");
            StudentList[i].gpa = sc.nextDouble();
        }
        // in DS SV
        double avgScore = 0, highestScore = StudentList[0].gpa ;
        System.out.println("DANH SÁCH SINH VIÊN: ");
        for(int i = 0; i < n; i++){
            System.out.println(StudentList[i].name + " " + StudentList[i].age + " tuổi, GPA: " + StudentList[i].gpa);
            avgScore += StudentList[i].gpa / n;
            if(StudentList[i].gpa > highestScore) {
                highestScore = StudentList[i].gpa;
            }
        }
        System.out.println("Điểm trung bình của cả lớp là: " + avgScore);
        System.out.print("Sinh viên có điểm GPA cao nhất lớp là: ");
        for(int i = 0; i < n; i++){
            if(StudentList[i].gpa == highestScore){
                System.out.println(StudentList[i].name + " " + StudentList[i].age + " tuổi, với GPA = " + StudentList[i].gpa);
            }
        }
    }
}
