package dzikri;

/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Transaksi {
    
    private final String kode; // variable untuk menampilkan kode pembayaran
    private ArrayList<Item> items = new ArrayList<>(); // menampilkan list item didalam ArrayList
    private float total; // untuk menyimpan nilai float dari variable harga

    
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