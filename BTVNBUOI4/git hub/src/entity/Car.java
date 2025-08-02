package entity;

public class Car {
    final static int RACE_MAX_SPEED = 90;
    private String brand;
    private int maxSpeed;

    public Car(){

    }

    public Car(String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public void run(){
        System.out.println("Xe " + brand + " đang chạy với tốc độ tối đa " + maxSpeed + " km/h");
    }
    public void checkSpeed(){
        if(this.maxSpeed > RACE_MAX_SPEED){
            System.out.println("Có vượt quá mức cho phép");
        } else{
            System.out.println("Không vượt mức cho phép");
        }
    }
}
