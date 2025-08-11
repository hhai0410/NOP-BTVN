public class Car {
    public static final int maxSpeed = 70;

    private int speed;
    private String brand;

    public Car(int speed, String brand) {
        this.speed = speed;
        this.brand = brand;
    }

    public boolean checkSpeed(){
        if(this.speed > 70){
            return false;
        }
        return true;
    }

    public Car() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
