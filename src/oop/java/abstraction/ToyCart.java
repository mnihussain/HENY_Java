package oop.java.abstraction;

public class ToyCart extends CowCart{

    {
        System.out.println("This is toy cart");
    }

    static {
        System.out.println("\nThis is static cow");
    }

    @Override
    public void seat(int seatNo){
        System.out.println("This is from ToyCart and seat no :" + seatNo);
    }

    public void toyCartMethod(){
        System.out.println("Toy cart");
    }
}
