package dzikri;

/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
import java.util.*;
import javax.swing.table.*;
public class TabelItem extends DefaultTableModel {
    
    // -- menyimpan nama kolom dalam bentuk array
    private String[] namaKolom;

    // -- konstruktor untuk class TabelItem
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
