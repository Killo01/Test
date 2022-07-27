
package ukl_lelang;

import java.util.ArrayList;
public class Barang {
     private ArrayList<Integer> idMasyarakat = new ArrayList<>();
    private ArrayList<String> namaBarang = new ArrayList<>();
    private ArrayList<Integer> hargaAwal = new ArrayList<>();
    private ArrayList<Boolean> status = new ArrayList<>();

    public Barang() {
        this.idMasyarakat.add(0);
        this.namaBarang.add("Vas Antik");
        this.hargaAwal.add(4000000);
        this.status.add(true);
    }

    
    public void setIdMasyarakat(int id) {
        this.idMasyarakat.add(id);
    }

    public void addNamaBarang(String nama) {
        this.namaBarang.add(nama);
    }

    public void setHargaAwal(int harga) {
        this.hargaAwal.add(harga);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }

    
    public int getIdMasyarakat(int id) {
        return this.idMasyarakat.get(id);
    }

    public String getNamaBarang(int id) {
        return this.namaBarang.get(id);
    }

    public int getHargaAwal(int id) {
        return this.hargaAwal.get(id);
    }

    public boolean getStatus(int id) {
        return this.status.get(id);
    }

    public void rubahStatus(int id, Boolean status) {
        this.status.set(id, status);
    }
    public int getjml(){
        return this.namaBarang.size();
    }
}
    

