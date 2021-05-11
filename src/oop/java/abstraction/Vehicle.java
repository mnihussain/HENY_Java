package oop.java.abstraction;

public interface Vehicle extends AnotherInterface{ //Interface is a blueprint of a class

    abstract void wheel();
    void body();
    void seat();

    default void light(){
        System.out.println("This is interface default light");
    }

    static void door(){
        System.out.println("This is interface static door");
    }

    private void roof(){
        System.out.println("This is interface private roof");
    }

}
