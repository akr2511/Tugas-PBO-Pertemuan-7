package tugas6pbo;
import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();

        // Validasi input
        if (n > 10 || n < 1) {
            System.out.println("Nilai n harus antara 1 hingga 10.");
        } else {
            // Cetak tabel perkalian
            System.out.println("Tabel Perkalian " + n + " x " + n + ":");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t"); // Menggunakan tab untuk memformat output
                }
                System.out.println(); // Pindah ke baris baru setelah setiap baris
            }
        }

        scanner.close();
    }
}

