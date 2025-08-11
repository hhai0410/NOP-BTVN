import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pet pet1 = new Pet("bull", 8.5, "Dog");
        Pet pet2 = new Pet("bully", 8.5, "Dog");
        Pet pet3 = new Pet("bullaa", 8.5, "Dog");
        Pet pet4 = new Pet("bulldogg", 8.5, "Dog");
        Cage cageA = new Cage();
        Cage cageB = new Cage();
        ArrayList<Pet> petArraylist = new ArrayList<>();
        petArraylist.add(pet1);
        petArraylist.add(pet2);
        System.out.println("Số lồng đã tạo: " + pet2.getTotalCages());
        ArrayList<Pet> petArraylist = new ArrayList<>();
    }
}