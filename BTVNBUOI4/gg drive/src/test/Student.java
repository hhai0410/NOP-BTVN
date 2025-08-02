package test;
import java.util.Scanner;

public class Student {
    public static Scanner sc = new Scanner(System.in);
    private String name;
    private int yearOfBirth;
    private String address;
    private double score1;
    private double score2;
    private double finalScore;
    private int missedLesson;

    public Student(){}
    public Student(String name, int yearOfBirth, String address, double score1, double score2, double finalScore, int missedLesson){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.score1 = score1;
        this.score2 = score2;
        this.finalScore = finalScore;
        this.missedLesson = missedLesson;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2(){
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    public int getMissedLesson() {
        return missedLesson;
    }

    public void setMissedLesson(int missedLesson) {
        this.missedLesson = missedLesson;
    }

    public static void printStudentMenu(){
        System.out.printf("%-20s%-8s%-15s%-10s%-10s%-10s%-10s%-10s\n",
                "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ");
    }

    public int getAge(){
        return 2025 - yearOfBirth;
    }
    public double getGpa(){
            return score1*0.2 + score2*0.3 + finalScore*0.5;
    }
    public void printStudent(){
        System.out.printf("%-20s%-8d%-15s%-10.2f%-10.2f%-10.2f%-10.2f%-10d\n",
                name, getAge(), address, score1, score2, finalScore, getGpa(), missedLesson);
    }
    public static int menu(){
        System.out.println("========= MENU CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN =========");
        System.out.println("1. Thêm sinh viên mới");
        System.out.println("2. Sửa thông tin sinh viên");
        System.out.println("3. Sắp xếp sinh viên theo tuổi");
        System.out.println("4. Sắp xếp sinh viên theo GPA");
        System.out.println("5. Sắp xếp sinh viên theo số tiết nghỉ");
        System.out.println("6. Xóa sinh viên khỏi danh sách");
        System.out.println("0. Thoát chương trình");
        System.out.print("→ Mời bạn chọn chức năng (0-6): ");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    public void addStudent(){
        System.out.print("Tên: ");
        this.name = sc.nextLine();
        System.out.print("Năm sinh: ");
        this.yearOfBirth = sc.nextInt();
        sc.nextLine();
        System.out.print("Địa chỉ: ");
        this.address = sc.nextLine();
        System.out.print("Điểm TX1: ");
        this.score1 = sc.nextDouble();
        System.out.print("Điểm TX2: ");
        this.score2 = sc.nextDouble();
        System.out.print("Điểm KTHP: ");
        this.finalScore = sc.nextDouble();
        System.out.print("Số tiết vắng: ");
        this.missedLesson = sc.nextInt();
        sc.nextLine();
    }
    public void editStudent(){
        System.out.print("Nhập thông tin bạn muốn thay đổi(tên, năm sinh, địa chỉ, tx1, tx2, kthp, số tiết nghỉ): ");
        String info = sc.nextLine();
        if(info.equals("tên")){
            System.out.print("Nhập tên muốn thay đổi: ");
            name = sc.nextLine();
        }
        if(info.equals("năm sinh")){
            System.out.print("Nhập năm sinh muốn thay đổi: ");
            yearOfBirth = sc.nextInt();
            sc.nextLine();
        }
        if(info.equals("địa chỉ")) {
            System.out.print("Nhập địa chỉ muốn thay đổi: ");
            address = sc.nextLine();
        }
        if(info.equals("tx1")){
            System.out.print("Nhập điểm muốn thay đổi: ");
            score1 = sc.nextDouble();
            sc.nextLine();
        }
        if(info.equals("tx2")){
            System.out.print("Nhập điểm muốn thay đổi: ");
            score2 = sc.nextDouble();
            sc.nextLine();
        }
        if(info.equals("kthp")){
            System.out.print("Nhập điểm muốn thay đổi: ");
            finalScore = sc.nextDouble();
            sc.nextLine();
        }
        if(info.equals("số tiết nghỉ")){
            System.out.print("Nhập số tiết nghỉ muốn thay đổi: ");
            missedLesson = sc.nextInt();
            sc.nextLine();
        }
    }
    public static void arrangeStudentAge(Student[] students, int studentCounts){
        for(int i = 0; i < studentCounts; i++){
            int indexMaxAge = i;
            for(int j = i+1; j < studentCounts; j++){
                if(students[indexMaxAge].getAge() < students[j].getAge()){
                    indexMaxAge = j;
                }
            }
            if(indexMaxAge != i){
                Student temp = students[i];
                students[i] = students[indexMaxAge];
                students[indexMaxAge] = temp;
            }
        }
    }
    public static void arrangeStudentGpa(Student[] students, int studentCounts){
        for(int i = 0; i < studentCounts; i++){
            int indexMaxGpa = i;
            for(int j = i+1; j < studentCounts; j++){
                if(students[indexMaxGpa].getGpa() < students[j].getGpa()){
                    indexMaxGpa = j;
                }
            }
            if(indexMaxGpa != i){
                Student temp = students[i];
                students[i] = students[indexMaxGpa];
                students[indexMaxGpa] = temp;
            }
        }
    }
    public static void arrangeStudentMissedLesson(Student[] students, int studentCounts){
        for(int i = 0; i < studentCounts; i++){
            int indexMaxMissedLesson = i;
            for(int j = i+1; j < studentCounts; j++){
                if(students[indexMaxMissedLesson].getMissedLesson() < students[j].getMissedLesson()){
                    indexMaxMissedLesson = j;
                }
            }
            if(indexMaxMissedLesson != i){
                Student temp = students[i];
                students[i] = students[indexMaxMissedLesson];
                students[indexMaxMissedLesson] = temp;
            }
        }
    }
    public static void deleteStudent(Student[] students, int studentCounts, String editStudent){

        for(int i = 0; i < studentCounts; i++){
            if(students[i].getName().equals(editStudent)){
                for(int j = i; j < studentCounts - 1; j++){
                    students[j] = students[j+1];
                }
                students[studentCounts - 1] = null;
                break;
            }
        }
    }
}

