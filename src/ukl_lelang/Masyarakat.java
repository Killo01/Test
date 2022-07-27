
package ukl_lelang;
import java.util.ArrayList;
public class Masyarakat implements User {
     private ArrayList<String> namaMasyarakat = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();

    public Masyarakat() {
        this.namaMasyarakat.add("Adn");
        this.alamat.add("Kepanjen");
        this.telepon.add("08992551783");

        this.namaMasyarakat.add("Rendy");
        this.alamat.add("Penarukan");
        this.telepon.add("0987654321");

        this.namaMasyarakat.add("Faiz");
        this.alamat.add("Cepokomulyo");
        this.telepon.add("0123456789");
        
        this.namaMasyarakat.add("budi");
        this.alamat.add("lampung");
        this.telepon.add("0123456789");
    }

    
    public void setNama(String namaMasyarakat) {
        this.namaMasyarakat.add(namaMasyarakat);
    }

    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    public String getNama(int idMasyarakat) {
        return this.namaMasyarakat.get(idMasyarakat);
    }

    public String getAlamat(int idMasyarakat) {
        return this.alamat.get(idMasyarakat);
    }

    public String getTelepon(int idMasyarakat) {
        return this.telepon.get(idMasyarakat);
    }

    public int getjml() {
        return this.telepon.size();
    }
}
    

