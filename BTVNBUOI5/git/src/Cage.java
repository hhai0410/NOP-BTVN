import java.util.ArrayList;

public class Cage {
    private String cageCode;
    ArrayList<Pet> pets = new ArrayList<>();
    int currentPetCount;
    private static int totalCages = 0;
    private final int MAX_CAPACITY = 3;

    public Cage(String cageCode, ArrayList<Pet> pets, int currentPetCount) {
        this.cageCode = cageCode;
        this.pets = pets;
        this.currentPetCount = currentPetCount;
        totalCages++;
    }

    public Cage() {
        totalCages++;
    }

    public void addPet(Pet pet){
        if(pets.size() < getMAX_CAPACITY()){
            pets.add(new Pet());
        } else {
            System.out.println("Lồng đã đầy");
        }
    }

    @Override
    public String toString() {
        return "Cage{" +
                "cageCode='" + cageCode + '\'' +
                ", pets=" + pets +
                ", currentPetCount=" + currentPetCount +
                ", MAX_CAPACITY=" + MAX_CAPACITY +
                '}';
    }

    public void printAllPets(){
        for(Pet x : pets){
            System.out.println(x);
        }
    }

    public String getCageCode() {
        return cageCode;
    }

    public void setCageCode(String cageCode) {
        this.cageCode = cageCode;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public int getCurrentPetCount() {
        return currentPetCount;
    }

    public void setCurrentPetCount(int currentPetCount) {
        this.currentPetCount = currentPetCount;
    }

    public static int getTotalCages() {
        return totalCages;
    }

    public static void setTotalCages(int totalCages) {
        Cage.totalCages = totalCages;
    }

    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }
}
