import java.util.Scanner;

public class siakad {
    private static final String nama = null;
    public static mahasiswa[] mahasiswa = new mahasiswa();
    static int jumlahData = 0;

    public static void tambahdata() {
        Scanner scan = new Scanner(System.in);
        System.out.println("silahkan tambah data");
        System.out.print("Masukan NIM = ");
        String nim = scan.nextLine();
        mahasiswa[jumlahData] = new mahasiswa();
        mahasiswa[jumlahData].setNim(nim);
        mahasiswa[jumlahData].setNama(nama);
        jumlahData = jumlahData + 1;
    }

    public static void tampilData() {
        System.out.println("Berikut data Anda");
        int i = 0;
        while (i < jumlahData) {
            System.out.println(mahasiswa[i].getNim() + " " + mahasiswa[i].getNama());
            i = i + 1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int menu;

        do {
            System.out.println("Menu Siakad");
            System.out.println("1 Tambah Data");
            System.out.println("2 Lihat Data");
            System.out.println("3 Keluar");
            System.out.println("Pilih Menu = ");
            menu = input.nextInt();

            if (menu == 1) {
                System.out.println("Tambah Data");
            } else if (menu == 2) {
                System.out.println("Lihat Data");
            }
        } while (menu != 3);
        input.close();
    }
}
