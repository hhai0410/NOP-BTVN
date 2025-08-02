import test.Student;
import java.util.Scanner;

public class Main{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Student[] students = new Student[100];
        int studentCounts = 5;
        students[0] = new Student("Nguyen Hoang Hai", 2006, "Hai Duong", 8.5, 9.5, 10, 3);
        students[1] = new Student("Tran Thi Mai", 2005, "Ha Noi", 7.0, 8.0, 9.0, 1);
        students[2] = new Student("Le Van Binh", 2004, "Da Nang", 6.5, 7.5, 8.0, 0);
        students[3] = new Student("Pham Quoc Anh", 2006, "Ho Chi Minh", 9.0, 8.5, 9.5, 2);
        students[4] = new Student("Doan Minh Chau", 2005, "Can Tho", 7.5, 7.0, 8.5, 4);
        Student.printStudentMenu();
        for(int i = 0; i < studentCounts; i++){
            students[i].printStudent();
        }
        int choice = Student.menu();
        while(choice >= 1 && choice <= 6){
            switch (choice) {
                case 1:
                    if (studentCounts >= students.length){
                        System.out.println("Đã đầy danh sách");
                    } else{
                        students[studentCounts] = new Student();
                        students[studentCounts].addStudent();
                        studentCounts++;
                        choice = -1;
                        break;
                    }
                case 2:
                    System.out.println("Nhập tên sinh viên cần sửa: ");
                    String editStudent = sc.nextLine();
                    for(int i = 0; i < studentCounts; i++){
                        if(students[i].getName().equals(editStudent)){
                            students[i].editStudent();
                        }
                    }
                    choice = -1;
                    break;
                case 3:
                    System.out.println("Sắp xếp sinh viên theo tuổi ");
                    Student.arrangeStudentAge(students, studentCounts);
                    choice = -1;
                    break;
                case 4:
                    System.out.println("Sắp xếp sinh viên theo gpa");
                    Student.arrangeStudentGpa(students, studentCounts);
                    choice = -1;
                    break;
                case 5:
                    System.out.println("Sắp xếp sinh viên theo số tiết nghỉ: ");
                    Student.arrangeStudentMissedLesson(students, studentCounts);
                    choice = -1;
                    break;
                case 6:
                    System.out.print("Nhập tên sinh viên khỏi danh sách: ");
                    editStudent = sc.nextLine();
                    for(int i = 0; i < studentCounts; i++){
                        if(students[i].getName().equals(editStudent)){
                            Student.deleteStudent(students, studentCounts, editStudent);
                            studentCounts--;
                            choice = -1;
                            break;
                        } else{
                            System.out.println("Không có sinh viên nào tên: " + editStudent);
                        }
                    }

            }
        }
        Student.printStudentMenu();
        for(int i = 0; i < studentCounts; i++){
            students[i].printStudent();
        }
    }
}