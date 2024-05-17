package Tugas1_BasicSyntaxChallenge;
import java.util.Scanner;

public class Parkir_Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {

            // Meminta user memasukkan jumlah jam parkir
            System.out.print("Masukkan jumlah jam parkir: ");
            int hours = scanner.nextInt();

            // Memeriksa apakah pengguna ingin keluar
            if (hours < 0 ) {
                System.out.println("Program selesai.");
                break;
            }

            // Menghitung dan menampilkan biaya parkir
            double fee = calculateParkingFee(hours);
            System.out.println("Biaya parkir untuk " + hours + " jam adalah: $" + fee);
            System.out.println(" ");
        }
        scanner.close();
    }

    public static double calculateParkingFee(int hours) {
        if (hours <= 5) {
            return 1.0;
        } else if (hours < 24) {
            return 1.0 + 0.5 * (hours - 5);
        } else {
            // Menghitung jam tambahan di atas 24 jam
            return 15.0 + 0.5 * (hours - 24);
        }
    }
}
