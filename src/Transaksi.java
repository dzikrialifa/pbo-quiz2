/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
import java.util.*;
public class Transaksi {
    private final String kode;
    private ArrayList<Item> items = new ArrayList<>();
    private float total;

    
    // ---- konstruktor dari class Transaksi
    public Transaksi(String kode, ArrayList<Item> items ) {
        this.kode = kode;
        this.items = items;
    }
    
    // ---- setter untuk nilai Total
    public void setTotal() {
        float total = 0;
        for (Item item : this.items) {
            total += item.getTotal();
        }
        this.total = total;
    }
    
    // ---- output
    public String Pembayaran(){
        setTotal();
        String objek = "";
        objek += "Kode\t\t : "+this.kode+"\n";
        objek += "Daftar Belanja :\n";
        for (Item item : this.items) {
            objek += "\t"+item.getNama()+"(x "+item.getJumlah()+" : "+item.getTotal();
        }
        objek += "Total Harga : "+this.total;
        return objek;
    } 
}