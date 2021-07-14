public class Main {
    public static void main(String[] args){
        Car car = new Car();
        //System.out.println(car.getMyDriver().getRole());

        // Add a print statement that
        // says the red porsche is being driven by Bob.


        car.setColor("red");
        car.setName("porsche");
        car.getMyDriver().setName("Bob");


        System.out.println("The " + car.getColor()+ " " + car.getName() + " is being driven by " + car.getMyDriver().getName());












    }

}
