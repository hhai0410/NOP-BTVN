public class Pet {

    private final double overWeight = 10;
    private String name;
    private double weight;
    String species;

    public Pet() {
    }

    public Pet(String name, double weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public void printInfo(){
        System.out.println("Tên của pet là: " + this.name + ", cân nặng: " + this.weight + " kg");
    }
    public boolean isOverWeight(){
        return this.weight > overWeight;
    }
    public String getBasicInfo(){
        return this.name + " " + this.species;
    }
}
