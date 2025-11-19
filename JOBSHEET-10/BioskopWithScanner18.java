import java.util.Scanner;

public class BioskopWithScanner18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int baris, kolom;
        // String nama, next;

        String[][] penonton = new String[4][2];
        int menu;

        // while (true) {
        // System.out.print("Masukkan nama: ");
        // nama = sc.nextLine();
        // System.out.print("Masukkan baris: ");
        // baris = sc.nextInt();
        // System.out.print("Masukkan kolom: ");
        // kolom = sc.nextInt();
        // sc.nextLine();

        // penonton[baris-1][kolom-1] = nama;

        // System.out.print("Input penonton lainnya? (y/n): ");
        // next = sc.nextLine();

        // if (next.equalsIgnoreCase("n")) {
        // break;
        // }
        // }

        // modifikasi pilihan 3 menu
        while (true) {
            // TAMPILKAN MENU
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (menu == 1) {
                // INPUT PENONTON
                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine();

                System.out.print("Masukkan baris (1-4): ");
                int baris = sc.nextInt();
                System.out.print("Masukkan kolom (1-2): ");
                int kolom = sc.nextInt();
                sc.nextLine();

                // Validasi kursi
                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Posisi kursi tidak tersedia harap memasukan pilihan lain!");
                    continue;
                }

                // Cek apakah kursi kosong
                if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi sudah terisi oleh: " + penonton[baris - 1][kolom - 1]);
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil disimpan!");
                }

            } else if (menu == 2) {
                // TAMPILKAN DATA PENONTON
                System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.printf("Kursi [%d,%d]: %s\n", i + 1, j + 1, isi);
                    }
                }

            } else if (menu == 3) {
                // EXIT
                System.out.println("================================");
                System.out.println("Program selesai. Terima kasih!");
                System.out.println("================================");
                break;

            } else {
                System.out.println("=====================================");
                System.out.println("Menu tidak valid! Masukan angka 1-3 ");
                System.out.println("=====================================");
            }
        }

        sc.close();
    }
}
