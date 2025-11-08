import java.util.Scanner;

public class NilaiKelompok18 {
    public static void main(String[] args) {

        // untuk mendeklarasikan sc sebagai scanner
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        double nilai, totalNilai, rataNilai;

        // Outer Loop
        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            // Inner Loop
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukan Nilai ke-" + j + ":");
                nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai/5;
            System.out.println("Rata-Rata : " + rataNilai);
            i++;
        }

        sc.close();
    }
}
