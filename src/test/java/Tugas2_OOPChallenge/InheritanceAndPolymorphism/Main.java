package Tugas2_OOPChallenge.InheritanceAndPolymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memilih jenis mobil
        System.out.println("Pilih jenis mobil (1-Honda Jazz, 2-Toyota Fortuner, 3-Suzuki Katana): ");
        int choice = scanner.nextInt();
        Car car;

        switch (choice) {
            case 1:
                car = new HondaJazz();
                break;
            case 2:
                car = new ToyotaFortuner();
                break;
            case 3:
                car = new SuzukiKatana();
                break;
            default:
                System.out.println("Pilihan tidak valid, program akan menggunakan Honda Jazz secara default.");
                car = new HondaJazz();
        }

        // Memilih aksi untuk mobil
        System.out.println("Pilih aksi (1-Maju, 2-Belok, 3-Isi Bahan Bakar): ");
        int action = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        switch (action) {
            case 1:
                car.moveForward();
                break;
            case 2:
                System.out.println("Masukkan arah belok (kiri/kanan): ");
                String direction = scanner.nextLine();
                car.turn(direction);
                break;
            case 3:
                if (car instanceof ToyotaFortuner) {
                    ((ToyotaFortuner) car).activate4WD();
                } else {
                    car.refillTank();
                }
                break;
            default:
                System.out.println("Aksi tidak valid.");
        }

        // Menampilkan saldo bahan bakar atau keadaan setelah aksi
        System.out.println("Operasi selesai.");

        scanner.close();
    }
}

