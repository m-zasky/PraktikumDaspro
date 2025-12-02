import java.util.Scanner;

public class Kafe18 {
    // Original code
    // public static void menu() {
    // System.out.println("=====MENU RESTO KAFE=====");
    // System.out.println("1. Kopi Hitam - Rp 15,000");
    // System.out.println("2. Cappucino - Rp 20,000");
    // System.out.println("3. Latte - Rp 22,000");
    // System.out.println("4. Teh Tarik - Rp 12,000");
    // System.out.println("5. Roti Bakar - Rp 10,000");
    // System.out.println("6. Mie Goreng - Rp 18,000");
    // System.out.println("=========================");
    // System.out.println("Silakan pilih menu yang anda inginkan.");
    // }

    // public static void main(String[] args) {
    // menu();
    // }
    // ==================================================================

    // modif tanpa menggunakan fungsi
    // public static void main(String[] args) {

    // System.out.println("=====MENU RESTO KAFE=====");
    // System.out.println("1. Kopi Hitam - Rp 15,000");
    // System.out.println("2. Cappucino - Rp 20,000");
    // System.out.println("3. Latte - Rp 22,000");
    // System.out.println("4. Teh Tarik - Rp 12,000");
    // System.out.println("5. Roti Bakar - Rp 10,000");
    // System.out.println("6. Mie Goreng - Rp 18,000");
    // System.out.println("=========================");
    // System.out.println("Silakan pilih menu yang anda inginkan.");
    // }
    // ==================================================================

    // modif dengan parameter string dan boolean
    // public static void menu(String namaPelanggan, boolean isMember) {
    // System.out.println("Selamat datang, " + namaPelanggan + "!");
    // if (isMember) {
    // System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap
    // pembelian!");
    // }

    // System.out.println("=====MENU RESTO KAFE=====");
    // System.out.println("1. Kopi Hitam - Rp 15,000");
    // System.out.println("2. Cappucino - Rp 20,000");
    // System.out.println("3. Latte - Rp 22,000");
    // System.out.println("4. Teh Tarik - Rp 12,000");
    // System.out.println("5. Roti Bakar - Rp 10,000");
    // System.out.println("6. Mie Goreng - Rp 18,000");
    // System.out.println("=========================");
    // System.out.println("Silakan pilih menu yang anda inginkan.");
    // }

    // public static void main(String[] args) {
    // menu("Andi", true);
    // }
    // ==================================================================

    // Menambahkan Parameter Kode Promo dan hitung total harga serta inputan
    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        // cek kode promo
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid. Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid. Anda mendapatkan diskon 30%");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("=====MENU RESTO KAFE=====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=========================");
        System.out.println("Silakan pilih menu yang anda inginkan.");
    }

    // Fungsi untuk menghitung harga satuan
    public static int hitungHargaSatuan(int pilihanMenu, int banyakItem) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    // Fungsi untuk menerapkan diskon pada total
    public static double hitungTotalDenganDiskon(double totalHarga, String kodePromo, boolean isMember) {
        double hargaAkhir = totalHarga;

        // Diskon kode promo
        if (kodePromo.equals("DISKON50")) {
            double diskonPromo = totalHarga * 0.50;
            hargaAkhir -= diskonPromo;
            System.out.println("Diskon kode promo 50%: Rp" + diskonPromo);
        } else if (kodePromo.equals("DISKON30")) {
            double diskonPromo = totalHarga * 0.30;
            hargaAkhir -= diskonPromo;
            System.out.println("Diskon kode promo 30%: Rp" + diskonPromo);
        } else if (!kodePromo.equals("")) {
            System.out.println("Kode promo tidak valid.");
        }

        // Diskon member (10%)
        if (isMember) {
            double diskonMember = hargaAkhir * 0.10;
            hargaAkhir -= diskonMember;
            System.out.println("Diskon member 10%: Rp" + diskonMember);
        }

        return hargaAkhir;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String nama = sc.nextLine();

        System.out.print("Apakah member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine(); // consume newline

        System.out.print("Masukkan kode promo (kosongkan jika tidak ada): ");
        String kodePromo = sc.nextLine();

        // Tampilkan menu
        menu(nama, isMember, kodePromo);

        // Array untuk menyimpan pesanan
        double totalKeseluruhan = 0;
        boolean lanjutPesan = true;
        int nomorPesanan = 1;

        System.out.println("\n=== PESANAN ===");

        while (lanjutPesan) {
            System.out.println("\nPesanan ke-" + nomorPesanan);
            System.out.print("Masukkan nomor menu yang ingin Anda pesan (1-6): ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            // Hitung harga untuk pesanan ini
            int hargaPesanan = hitungHargaSatuan(pilihanMenu, banyakItem);
            totalKeseluruhan += hargaPesanan;

            // Tampilkan rincian pesanan
            System.out.println("Harga pesanan ini: Rp" + hargaPesanan);

            System.out.print("\nTambah pesanan lain? (y/n): ");
            char tambah = sc.next().charAt(0);

            if (tambah == 'n' || tambah == 'N') {
                lanjutPesan = false;
            }
            nomorPesanan++;
        }

        // Tampilkan total sebelum diskon
        System.out.println("\n=== RINCIAN PEMBAYARAN ===");
        System.out.println("Total harga sebelum diskon: Rp" + totalKeseluruhan);

        // Hitung total dengan diskon
        double totalAkhir = hitungTotalDenganDiskon(totalKeseluruhan, kodePromo, isMember);

        // Tampilkan total akhir
        System.out.println("Total harga yang harus dibayar: Rp" + (int)totalAkhir);
        System.out.println("Terima kasih telah berbelanja di Kafe kami!");

        sc.close();
    }
}
