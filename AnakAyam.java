package tugas6pbo;

public class AnakAyam {
    public static void main(String[] args) {
        int n = 10;
        while (n > 1) {
            System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1));
            n--;
        }
        System.out.println("Anak ayam turun 1, mati satu tinggal induknya.");
    }
}

