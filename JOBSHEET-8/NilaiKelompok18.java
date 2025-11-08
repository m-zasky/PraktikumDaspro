import java.util.Scanner;

public class NilaiKelompok18 {
    public static void main(String[] args) {

        // untuk mendeklarasikan sc sebagai scanner
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        double nilai, totalNilai, rataNilai, rataTertinggi = 0;
        int kelompokTertinggi = 0;

        // Outer Loop modifikasi menggunakan for loop
        for (int i = 1; i <= 6; i++) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            // Inner Loop
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukan Nilai ke-" + j + ":");
                nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            // rumus rata-rata nilai
            rataNilai = totalNilai / 5;
            System.out.println("Rata-Rata : " + rataNilai);

            // untuk menampilkan rata-rata tertinggi
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

        }

        System.out.println("\n==================================================");
        System.out.println("Kelompok Dengan Rata-Rata Tertinggi Adalah Kelompok : " + kelompokTertinggi);
        System.out.println("Dengan Rata-Rata Nilai : " + rataTertinggi);
        System.out.println("====================================================");
        sc.close();
    }
}
