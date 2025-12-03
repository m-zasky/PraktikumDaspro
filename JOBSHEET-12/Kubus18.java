public class Kubus18 {
    static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    static int hitungLuasPermukaan(int sisi) {
       return 8 * sisi * sisi;
    }

    public static void main(String[] args) {
        int sisi = 6;
        int volume = hitungVolume(sisi);
        int luas = hitungLuasPermukaan(sisi);

        System.out.println("Volume kubus adalah: " + volume);
        System.out.println("Luas permukaan kubus adalah: " + luas);
    }
}
