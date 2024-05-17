package Tugas2_OOPChallenge.InheritanceAndPolymorphism;

public class HondaJazz extends Car {
    public HondaJazz() {
        super(4, "merah", 40, "otomatis");
    }

    @Override
    public void moveForward() {
        System.out.println("Honda Jazz bergerak maju dengan lancar");
    }
}
