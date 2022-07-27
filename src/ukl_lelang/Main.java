package ukl_lelang;

import java.util.Scanner;
public class Main {
    

    public static Scanner myObj = new Scanner(System.in);

    public static int input(String pesan, int limit) {
        int tmp = 0;
        while (true) {
            System.out.print(pesan);
            while (!myObj.hasNextInt()) {
                System.out.println("Input Invalid : " + myObj.next());
                System.out.print(pesan);
            }
            tmp = myObj.nextInt();
            if (tmp > limit) {
                System.out.println("Input diluar limit (" + limit + ")");
            } else {
                break;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {

        Transaksi tr1 = new Transaksi();
        Barang br1 = new Barang();
        Masyarakat ms1 = new Masyarakat();
        Lelang lel1 = new Lelang();
        Laporan lap1 = new Laporan();
        int pilih;
        while (true) {
            System.out.println("\nSELAMAT DATANG DI TOKO LELANG");
            System.out.println("------------------------------------");
            System.out.println("Ketik 1 jika anda mau melelang barang");
            System.out.println("Ketik 2 jika anda mau membeli barang");
            System.out.println("Ketik 3 jika anda mau melihat daftar barang lelang");
            System.out.println("Ketik 4 jika anda mau melihat laporan transaksi");
            System.out.println("Ketik 0 untuk keluar");
            pilih = input("Masukkan pilihan anda disini : ", 4);
            
            switch (pilih) {
                case 0:
                    System.exit(1);
                case 1:
                    tr1.LelangBarang(br1, ms1);
                    break;
                case 2:
                    tr1.TawarBarang(lel1, ms1, br1, lap1);
                    break;
                case 3:
                    lap1.laporan(tr1, br1);
                    break;
                case 4:
                    lap1.laporan(tr1, br1, lel1,ms1);
                    break;
                default:
                    break;
            }
}
    }
    }

