import java.util.Scanner;

public class Star18 {

    public static void main(String[] args) {

        // Untuk Mendeklrasikan sc Sebagai Sfanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Masukan Nilai N
        System.out.print("Masukan Nilai n = ");
        int n = sc.nextInt();

        // perulangan menggunakan for
        for (int i = 1; i <= n; i += 2) {
            System.out.print("*");
        }

    }

}