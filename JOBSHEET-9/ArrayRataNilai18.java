import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // agar user bisa menginputkan array jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double sumLulus = 0, sumTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                sumLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                sumTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        double rataLulus = (jumlahLulus > 0) ? (sumLulus / jumlahLulus) : 0;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? (sumTidakLulus / jumlahTidakLulus) : 0;

        System.out.printf("Rata-rata nilai lulus = %.1f\n", rataLulus);
        System.out.printf("Rata-rata nilai tidak lulus = %.1f\n", rataTidakLulus);

        sc.close();
    }
}
