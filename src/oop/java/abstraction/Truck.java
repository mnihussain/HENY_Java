package oop.java.abstraction;

public class Truck extends VehicleAction implements Vehicle, AnotherInterface{
    @Override
    public void wheel() {
        System.out.println("This is a Truck wheel");
    }

    @Override
    public void body() {
        System.out.println("This is a Truck body");
    }

    @Override
    public void seat() {
        System.out.println("This is a Truck seat");
    }

    @Override
    public void light(){
        System.out.println("This is a overridden Truck light");
    }

    @Override
    public void run() {
        System.out.println("This truck is running");
    }

    @Override
    public void stop() {
        System.out.println("This truck is stopped");
    }

    @Override
    public void vehicleClass() {

    }

    //How can you achieve multiple inheritance?
    //By implementing multiple interfaces, multi-level inheritance
}
