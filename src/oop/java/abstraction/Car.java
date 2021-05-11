package oop.java.abstraction;

public class Car extends VehicleAction implements Vehicle { //Concrete class
    @Override
    public void wheel() {
        System.out.println("This is a car wheel");
    }

    @Override
    public void body() {
        System.out.println("This is a car body");
        return;
    }

    @Override
    public void seat() {
        System.out.println("This is a car seat");
    }

    @Override
    public void light(){
        System.out.println("This is a overridden car light");
    }

    @Override
    public void run() {
        System.out.println("This car is running");
    }

    @Override
    public void stop() {
        System.out.println("This car is stopped");
    }

    @Override
    public void vehicleClass() {
        System.out.println("This is car class");
    }
}
