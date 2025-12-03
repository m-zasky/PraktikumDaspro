import java.util.Scanner;

public class NilaiMahasiswa18 {
    static void isianArray(int[] arr, Scanner input) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
    }

    static void tampilArray(int[] arr) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + arr[i]);
        }
    }

    static int hitungTotal(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jumlah mahasiswa: ");
        int nilai = input.nextInt();

        int[] NilaiMahasiswa = new int[nilai];

        isianArray(NilaiMahasiswa, input);
        tampilArray(NilaiMahasiswa);

        int total = hitungTotal(NilaiMahasiswa);
        System.out.println("\nTotal nilai seluruh mahasiswa adalah: " + total);

        input.close();
    }
}
