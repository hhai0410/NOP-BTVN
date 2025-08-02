import entity.Car;
import entity.Student;
import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        Student A = new Student("Hải", 18);
//        System.out.println("Tên : " + A.getName());
//        System.out.println("Tuổi : " + A.getAge());
//        System.out.print("Cập nhật tên mới: ");
//        A.setName(sc.nextLine());
//        System.out.print("Cập nhật tuổi mới: ");
//        A.setAge(sc.nextInt());
//        System.out.println("Tên mới: " + A.getName());
//        System.out.println("Tuổi mới: " + A.getAge());
        Car firstCar = new Car("Lamborghini", 300);
        firstCar.run();
        firstCar.checkSpeed();
    }
}