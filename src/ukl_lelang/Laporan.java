
package ukl_lelang;


public class Laporan {
    
    public void laporan(Transaksi tr, Barang br) {
        int x = br.getjml();

        System.out.println("\nLaporan Barang Lelang");
        System.out.println("ID\tNama\t\tHarga\t\tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println((i + 1) + "\t" + br.getNamaBarang(i) + "\t" + br.getHargaAwal(i) + "\t\t" + br.getStatus(i));
        }
    }

    public void laporan(Transaksi tr, Barang brg, Lelang lel, Masyarakat ms) {
        int x = tr.hargaTawar.size();

        System.out.println("\nLaporan Transaksi Lelang");
        System.out.println("ID\tBarang\t\tPembeli\t\tLaba");
        for (int i = 0; i < x; i++) {
            int laba = tr.getHargaTawar(i)-brg.getHargaAwal(i);
            System.out.println((i+1)+"\t"+brg.getNamaBarang(i) + "\t" + ms.getNama(tr.idMasyarakatPenawar.get(i)) + "\t\t"
                    + laba);
        }
    }
}
