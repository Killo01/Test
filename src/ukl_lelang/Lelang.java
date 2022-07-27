
package ukl_lelang;

import java.util.ArrayList;
public class Lelang {
    
     private ArrayList<Integer> idPenawar = new ArrayList<>();
    private ArrayList<Integer> idBarang = new ArrayList<>();
    private ArrayList<Integer> hargaTawar = new ArrayList<>();

    public Lelang() {
        this.idPenawar.add(1);
        this.idBarang.add(1);
        this.hargaTawar.add(1);
    }

    
    public void setIdPenawar(int idPenawar) {
        this.idPenawar.add(idPenawar);
    }

    public void setIdBarang(int idBarang) {
        this.idBarang.add(idBarang);
    }

    public void setHargaTawar(int harga) {
        this.hargaTawar.add(harga);
    }

    
    public int getIdPenawar(int id) {
        return this.idPenawar.get(id);
    }

    public int getIdBarang(int id) {
        return this.idBarang.get(id);
    }

    public int getHargaTawar(int id) {
        return this.hargaTawar.get(id);
    }

    
}
