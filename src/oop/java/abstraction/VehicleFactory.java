package oop.java.abstraction;

public class VehicleFactory {

    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.body();
        Vehicle.door();
        toyota.typeOfVehicle();
        toyota.vehicleClass();
        System.out.println(toyota.name);

        VehicleClass vehicleClass = new Car();
       //vehicleClass.body();
        vehicleClass.typeOfVehicle();
        System.out.println(vehicleClass.name);

        Vehicle vehicle = new Car();
        vehicle.wheel();
        //vehicle.typeOfVehicle();
        vehicle.vehicleClass();
        System.out.println("Check below");
        vehicle.light();

        AnotherInterface anotherInterface = new Car();
        //anotherInterface.light();
        anotherInterface.vehicleClass();

        CowCart cart = new CowCart();
        //cart.seat(); // No arguments
        cart.seat(5); // One arguments
        cart.seat(7, "Hard"); // Multiple arguments

        System.out.println("\nWatch below >>");
        CowCart cart1 = new ToyCart();
        cart1.seat(5);
        //cart1.toyCartMethod();
    }
}
