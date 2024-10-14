package tugas6pbo;

public class CekPrimaBukan {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (isPrima(i)) System.out.print(i + " ");
        }
        System.out.println("\nBukan prima:");
        for (int i = 0; i <= 20; i++) {
            if (!isPrima(i)) System.out.print(i + " ");
        }
    }

    public static boolean isPrima(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
