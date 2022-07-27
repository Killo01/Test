
package ukl_lelang;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

public class Transaksi {
    
    public Scanner scanner = new Scanner(System.in);
    
    int pilih;

    public int input(String pesan, int limit) {
        int tmp = 0;
        while (true) {
            System.out.print(pesan);
            while (!scanner.hasNextInt()) {
                System.out.println("Input Invalid : " + scanner.next());
                System.out.print(pesan);
            }
            tmp = scanner.nextInt();
            if (tmp <= 0 | tmp > limit) {
                System.out.println("Input diluar limit (" + limit + ")");
            } else {
                break;
            }
        }
        return tmp;
    }

    ArrayList<Integer> idMasyarakatPenawar = new ArrayList<>();
    ArrayList<Integer> idMasyarakatPelelang = new ArrayList<>();
    ArrayList<Integer> hargaTawar = new ArrayList<>();

    public void LelangBarang(Barang barang, Masyarakat masyarakat) {

        System.out.println("\n=== LELANG BARANG ===\nSilahkan isi data berikut ini");

        int idMas = input("Id masyarakat : ", masyarakat.getjml() + 1) - 1;
        System.out.println("Selamat datang : " + masyarakat.getNama(idMas));
        idMasyarakatPelelang.add(idMas);

        System.out.print("Nama Barang : ");
        String name = scanner.next();

        barang.addNamaBarang(name);
        System.out.println(name);

        int harga = input("Harga Awal : ", 2147483647);
        barang.setHargaAwal(harga);
        System.out.println("Pendaftaran barang berhasil");
        barang.setStatus(true);
    }

    public void TawarBarang(Lelang lelang, Masyarakat masyarakat, Barang barang, Laporan laporan) {
        if (barang.getjml() > 0) {
            System.out.println("\n=== TAWAR BARANG ===\nSilahkan isi data berikut ini");

            int idMas = input("Id masyarakat : ", masyarakat.getjml()) - 1;
            System.out.println("Selamat datang : " + masyarakat.getNama(idMas));

            idMasyarakatPenawar.add(idMas);
            
            laporan.laporan(this, barang);
            int idBrg = input("No Barang : ", barang.getjml()) - 1;

            int inputHargaTawar;
            
               
            do {
                inputHargaTawar = input("Harga Tawar : ", 2147483647);
                
                
                if (inputHargaTawar > barang.getHargaAwal(idBrg)) {
                    System.out.println("\nAnda berhasil menawar barang ini");
                    barang.rubahStatus(idBrg, false);
                    hargaTawar.add(inputHargaTawar);
                    lelang.setHargaTawar(inputHargaTawar);

                } else {
                    System.out.println("\nAnda harus menawar dengan harga yang lebih tinggi");
                }
                System.out.println(" ");
                
            System.out.println("Ketik 1 jika ingin lanjut menawar");
            System.out.println("Ketik 2 jika berhenti menawar");
            pilih = input("Masukkan pilihan anda disini : ", 2);
            
             } while (inputHargaTawar < barang.getHargaAwal(idBrg));
             
            
            System.out.println("Berikut detail penawaran barang yang anda lakukan : ");
            System.out.println("Nama \tBarang \t\tHarga Awal \tHarga Akhir \tStatus");
            System.out.println(masyarakat.getNama(idMas) + "\t"
                    + barang.getNamaBarang(idBrg) + "\t"
                    + barang.getHargaAwal(idBrg) + "\t\t"
                    + hargaTawar.get(idBrg) + "\t\t"
                    + barang.getStatus(idBrg)
            );
        }
        else{System.out.println("Toko Lelang Kosong");}
    }

    public int getHargaTawar(int id) {
        return this.hargaTawar.get(id);
    }

    
}


