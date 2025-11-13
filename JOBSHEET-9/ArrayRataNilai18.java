import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0, rata2;
        int max, min;

        // Input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Inisialisasi nilai maksimum dan minimum
        max = nilaiMhs[0];
        min = nilaiMhs[0];

        // Hitung total, nilai tertinggi, dan nilai terendah
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];

            if (nilaiMhs[i] > max) {
                max = nilaiMhs[i];
            }

            if (nilaiMhs[i] < min) {
                min = nilaiMhs[i];
            }
        }

        // Hitung rata-rata
        rata2 = total / nilaiMhs.length;

        // Tampilkan hasil
        System.out.println("Rata-rata nilai mahasiswa = " + rata2);
        System.out.println("Nilai tertinggi = " + max);
        System.out.println("Nilai terendah = " + min);

        sc.close();
    }
}
