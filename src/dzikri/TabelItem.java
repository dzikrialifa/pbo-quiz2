package dzikri;

/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
import javax.swing.table.*;
public class TabelItem extends DefaultTableModel {
    
    // -- menyimpan nama kolom dalam bentuk array
    private String[] namaKolom;

    // -- default konstruktor untuk class TabelItem
    // -- setting nama kolom tabel
    public TabelItem() {
        this.namaKolom = new String[]{
            "Nama","Harga","Jumlah"
        };
    }
    
    // -- getter untuk namaKolom
    public String[] getNamaKolom() {
        return this.namaKolom;
    }
    
    
}
