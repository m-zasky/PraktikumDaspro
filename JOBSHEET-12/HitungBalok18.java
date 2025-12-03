import java.util.Scanner;

public class HitungBalok18 {

    // Original Code
    // public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    // int p, l, t, L, vol;

    // System.out.print("Masukan panjng ");
    // p = input.nextInt();

    // System.out.print("Masukan lebar ");
    // l = input.nextInt();

    // System.out.print("Masukan tinggi ");
    // t = input.nextInt();

    // L = p * l;
    // System.out.println("Luas persegi panjang adalah " + L);
    // vol = p * l * t;
    // System.out.println("Volume balok adalah " + vol);

    // input.close();
    // }
    // ==========================================================================

    // Modif dengan fungsi
    // fungi hitung luas
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    // fungsi hitung vokume
    static int hitungVolume(int tinggi, int a, int b) {
        int Volume = hitungLuas(a, b) * tinggi;
        return Volume;
    }

    // fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int p, l, t, L, vol;

        System.out.print("Masukan panjang :");
        p = input.nextInt();

        System.out.print("Masukan lebar :");
        l = input.nextInt();

        System.out.print("Masukan tinggi :");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);

        input.close();

    }
}
