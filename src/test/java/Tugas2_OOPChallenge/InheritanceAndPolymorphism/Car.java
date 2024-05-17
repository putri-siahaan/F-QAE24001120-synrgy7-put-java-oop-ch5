package Tugas2_OOPChallenge.InheritanceAndPolymorphism;

public class Car extends Vehicle {
    private int tankCapacity;
    private String transmission;

    public Car(int wheels, String color, int tankCapacity, String transmission) {
        super(wheels, color);
        this.tankCapacity = tankCapacity;
        this.transmission = transmission;
    }

    public void changeGear(int gear) {
        System.out.println("Mengganti transmisi ke " + gear);
    }

    public void refillTank() {
        System.out.println("Mengisi bahan bakar sampai penuh: " + this.tankCapacity + " liter");
    }
}
