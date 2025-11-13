import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0, rata2;
        int jumlahLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke- " + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];

            // untuk mengetahui jumlah mahasiswa yang lulus
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai mahasiswa = " + rata2);
        System.out.println("Banyak mahasiswa yang lulus = " + jumlahLulus);

        sc.close();
    }
}
