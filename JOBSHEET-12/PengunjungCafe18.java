public class PengunjungCafe18 {
    // public static void daftarPengunjung(String...namaPengunjung) {
    //     System.out.println("DAFTAR NAMA PENGUNJUNG");
    //     for (int i = 0; i < namaPengunjung.length; i++) {
    //         System.out.println("- " + namaPengunjung[i]);
    //     }
    // }

    // public static void main(String[] args) {
    //     daftarPengunjung("Andi", "Budi", "Citra");
    //     daftarPengunjung("Andi");
    //     daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    // }
    //============================================================================


    // MODIFIKASI MENGGUNAKAN FOR-EACH LOOP
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("DAFTAR NAMA PENGUNJUNG");
        // Menggunakan for-each loop
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Andi", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
        daftarPengunjung();
        
    }
    // ===========================================================================

}
