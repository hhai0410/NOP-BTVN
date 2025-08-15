public class Publisher {
    private String name;
    private String address;

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Publisher() {
        this.name = "Unknown";
        this.address = "Unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void print(){
        System.out.println("Name: " + this.name + ", address: " + this.address);
    }
}
