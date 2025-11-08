import java.util.Scanner;

public class JumlahKuadrat18 {
    public static void main(String[] args) {

        // untuk mendeklarasikan sc sebagai scanner
        Scanner sc = new Scanner(System.in);

        // agar user bisa menginputkan nilai n
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        // Outter loop untuk setiap nilai dari 1 sampai n
        for (int i = 1; i <= n; i++) {
            int jumlahKuadrat = 0;

            System.out.print("n = " + i + " => jumlah kuadrat = ");

            // Inner loop untuk menghitung jumlah kuadrat dari 1^2 sampai i^2
            for (int j = 1; j <= i; j++) {
                jumlahKuadrat += j * j;
                System.out.print(j * j);
                if (j < i)
                    System.out.print(" + ");
            }

            // Menampilkan hasil jumlah kuadrat
            if (i > 1) {
                System.out.println(" = " + jumlahKuadrat);
            } else {
                System.out.println();
            }
        }
        sc.close();
    }
}
