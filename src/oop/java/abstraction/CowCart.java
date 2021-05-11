package oop.java.abstraction;

public class CowCart extends VehicleAction implements Vehicle { //Class is a blueprint of an Object
    @Override
    public void wheel() {
        System.out.println("This is a Cow Cart wheel");
    }

    @Override
    public void body() {
        System.out.println("This is a Cow Cart body");
    }

    @Override
    public void seat() {
        System.out.println("This is a Cow Cart seat");
        throw new NullPointerException();
    }

    public void seat(int seatNo){
        System.out.printf("This cow cart have %d seat", seatNo);
    }

    public void seat(int seatNo, String seatType){
        System.out.printf("This cow cart have %d seat and seat type is %s", seatNo, seatType);
    }

    @Override
    public void run() {
        System.out.println("This cow cart is running");
    }

    @Override
    public void stop() {
        System.out.println("This cow cart is stopped");
    }

    @Override
    public void vehicleClass() {
        System.out.println("This is cow cart class");
    }
}
