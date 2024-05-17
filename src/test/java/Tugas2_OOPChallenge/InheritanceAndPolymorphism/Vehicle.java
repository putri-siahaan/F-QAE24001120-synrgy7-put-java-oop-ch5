package Tugas2_OOPChallenge.InheritanceAndPolymorphism;

public class Vehicle {
    private int wheels;
    private String color;

    public Vehicle(int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
    }

    public void moveForward() {
        System.out.println("Kendaraan bergerak maju");
    }

    public void turn(String direction) {
        System.out.println("Kendaraan belok ke " + direction);
    }
}
