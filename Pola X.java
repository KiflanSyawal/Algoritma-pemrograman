import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner DataIn = new Scanner(System.in);
        System.out.print("Masukkan Nilai n : ");
        int sisi = DataIn.nextInt();
        char cetak[][] = new char[sisi][sisi];

        for (int b = 0; b < sisi; b++) {
            for (int k = 0; k < sisi; k++) {
                if (b == k || b + k == sisi - 1) {
                    cetak[b][k] = '+';
                } else {
                    cetak[b][k] = ' ';
                }
                System.out.print(cetak[b][k]);
            }
            System.out.println();
        }
    }
}