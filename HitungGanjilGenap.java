package tugas6pbo;

public class HitungGanjilGenap {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println("\nGanjil:");
        for (int i = 1; i <= 20; i += 2) System.out.print(i + " ");
    }
}
