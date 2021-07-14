public class Vehicle {
    private String color;
    private String name;
    private int speed;

    public Vehicle(){

    }
    public Vehicle(String color, String name, int speed){
        this.color = color;
        this.name = name;
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public void vehicleDescription(){
        System.out.printf("Color: %s\nBrand Name: %s\nSpeed: %d",color, name, speed);
    }
}
