public class Car extends Vehicle {
    private Driver myDriver;

    public Car(){
        this.myDriver = new Driver();
    }

    public void setMyDriver(Driver myDriver){
        this.myDriver = myDriver;
    }
    public Driver getMyDriver(){
        return myDriver;
    }

    public String start(){
        return "The " + getColor() + " " + getName() + " is starting";
    }

    public void accelerate(){
        System.out.println("The " + getColor() + " " + getName() + " is accelerating");
    }

    public void go(){
        System.out.println("The " + getColor() + " " + getName() + " is going " + getSpeed() + " mph");
    }

    public void stop(){
        System.out.println("The " + getColor() + " " + getName() + " is stopped");
    }

    public void check(){
        System.out.println("The " + getColor() + " " + getName() + " has stopped to have its emissions checked");
    }


}
