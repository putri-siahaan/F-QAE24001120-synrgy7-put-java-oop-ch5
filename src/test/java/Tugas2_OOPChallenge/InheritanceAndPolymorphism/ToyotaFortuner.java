package Tugas2_OOPChallenge.InheritanceAndPolymorphism;

public class ToyotaFortuner extends Car {
    private boolean fourWheelDrive;

    public ToyotaFortuner() {
        super(4, "hitam", 65, "manual");
        this.fourWheelDrive = true;
    }

    @Override
    public void moveForward() {
        System.out.println("Toyota Fortuner bergerak maju dengan kuat");
    }

    public void activate4WD() {
        if (fourWheelDrive) {
            System.out.println("Penggerak empat roda diaktifkan");
        }
    }
}
