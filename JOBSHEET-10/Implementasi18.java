import java.util.Scanner;

public class Implementasi18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        int[][] survey = new int[jumlahResponden][jumlahPertanyaan];

        System.out.println("=== Input Data Survei Kepuasan Pelanggan ===");

        // MenyimpanHasilSurvei
        for (int i = 0; i < jumlahResponden; i++) {
  
            System.out.println("\nResponden ke- " + (i + 1));
            for (int j = 0; j < jumlahPertanyaan; j++) {
                while (true) {
                    System.out.print("Nilai pertanyaan " + (j+1) + " (1-5): ");
                    int nilai = sc.nextInt();

                    if (nilai >= 1 && nilai <=5) {
                        survey[i][j] = nilai;
                        break;
                    } else {
                        System.out.println("Input harus 1 sampai 5");
                    }
                }
            }
        }

        System.out.println("\nHASIL ANALISIS SURVEI");
        // Menghitung rata-rata setiap responden
        System.out.println("\nRata-rata setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            int total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += survey[i][j];
            }
            double rata = (double) total / jumlahPertanyaan;
            System.out.printf("Responden %d: %.2f%n", (i + 1), rata);
        }

        // c. Menghitung rata-rata setiap pertanyaan
        System.out.println("\nRata-rata setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += survey[i][j];
            }
            double rata = (double) total / jumlahResponden;
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), rata);
        }

        // d. Menghitung rata-rata keseluruhan
        int totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }

        double rataKeseluruhan = (double) totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.printf("\nRata-rata keseluruhan: %.2f%n", rataKeseluruhan);
        sc.close();
    }
}
