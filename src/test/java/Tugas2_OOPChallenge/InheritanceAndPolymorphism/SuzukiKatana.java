package Tugas2_OOPChallenge.InheritanceAndPolymorphism;

public class SuzukiKatana extends Car {
    public SuzukiKatana() {
        super(4, "putih", 35, "manual");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Suzuki Katana belok ke " + direction + " dengan tajam");
    }
}
