import java.util.Scanner;

public class Square18 {
    public static void main(String[] args) {

        // untuk mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // user menginputkan nilai N
        System.out.print("Masukan Nilai N = ");
        int N = sc.nextInt();

        // perulangan
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
