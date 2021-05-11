package oop.java.encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {
        Product product = new Product("Macbook", 1500);
        System.out.println(product.getProductName());
        System.out.println(product.getPrice());
    }
}
