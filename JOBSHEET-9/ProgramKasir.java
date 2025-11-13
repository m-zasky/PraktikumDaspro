import java.util.Scanner;

public class ProgramKasir{
    public static void main(String[] args) {
        // Daftar menu dan harga
        String[] daftarMenu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Es Teh", "Cappuccino", "Chocolate Ice" };
        int[] daftarHarga = { 12000, 10000, 15000, 7000, 18000, 14000 };
        Scanner input = new Scanner(System.in);

        while (true) { // Perulangan utama
            System.out.print("Masukkan jumlah pesanan (0 untuk keluar): ");
            int jumlah = input.nextInt();
            input.nextLine();
            if (jumlah == 0) {
                System.out.println("============================================");
                System.out.println("Terimakasih telah menggunakan program kami");
                System.out.println("Semoga harimu menyenangkan");
                System.out.println("============================================");
                break;
            }
            int totalHarga = 0;
            System.out.println("=======================");
            System.out.println("--- Pemesanan Baru ---");
            System.out.println("=======================");
            for (int i = 0; i < jumlah; i++) {
                String menu = "";
                boolean ditemukan = false;
                // Ulangi input menu sampai nama ditemukan di daftar
                do {
                    System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                    menu = input.nextLine();
                    for (int j = 0; j < daftarMenu.length; j++) {
                        if (menu.equalsIgnoreCase(daftarMenu[j])) {
                            ditemukan = true;
                            System.out.print("Masukkan jumlah : ");
                            int banyakMenu = input.nextInt();
                            input.nextLine();
                            int subTotal = daftarHarga[j] * banyakMenu;
                            System.out.println(daftarMenu[j] + " x " + banyakMenu + " = Rp" + subTotal);
                            totalHarga += subTotal;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Menu tidak tersedia. Silakan masukkan nama menu lainnya.");
                    }
                } while (!ditemukan); // Perulangan jika menu belum ditemukan
            }
            // Tampilkan total setiap selesai input pesanan
            System.out.println("Total harga pesanan: Rp" + totalHarga);
            System.out.println();
        }
        input.close();
    }
}
