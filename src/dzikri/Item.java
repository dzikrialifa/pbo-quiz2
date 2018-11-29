package dzikri;

import java.util.*;

/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
public class Item extends FramePembelian{
    
    private String nama; // untuk menyimpan nilai String dari variable nama
    private float harga; // untuk menyimpan nilai float dari variable harga
    private int jumlah; // untuk menyimpan nilai int dari vaiable jumlah
    
    public Item() { // default konstruktor
    }

    public Item(String nama, int jumlah, float harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void setNama(String nama) { // SETTER NAMA
        this.nama = nama;
    }
    public String getNama() { // GETTER NAMA
        return nama;
    }
    
    public void setHarga(float harga) { // SETTER HARGA
        this.harga = harga;
    }
    public float getHarga() { // GETTER HARGA
         return harga;
    }
    
    public void setJumlah(int jumlah) { // SETTER JUMLAH
        this.jumlah = jumlah;
    }
    public int getJumlah() { // GETTER JUMLAH
        return jumlah;
    }
    
    // -------------------------------------------
    public float getTotal(){
        return this.harga * this.jumlah;
        // MERETURNKAN NILAI HARGA * JUMLAH 
    }
    public String toString(){
        return this.nama;
        
    }
}   