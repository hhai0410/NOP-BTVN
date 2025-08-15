import haha.Person;
import haha.SinhVien;
import haha.Staff;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person personA = new Person();
        SinhVien svA = new SinhVien("nam", 21, 123, "haui");
        Staff staffA = new Staff("hai", 21, 5000);
        Person personB = new Staff("a", 2, 3);
        svA.eat();
        personB.eat();
    }
}