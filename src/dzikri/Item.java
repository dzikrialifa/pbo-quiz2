package dzikri;

import java.util.*;

/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
public class Item extends FramePembelian{
    private String nama;
    private float harga;
    private int jumlah;
    
    public Item() {
    }

    public Item(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }
    public float getHarga() {
         return harga;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public int getJumlah() {
        return jumlah;
    }
    
    
    public float getTotal(){
        return this.harga * this.jumlah;
    }
    public String toString(){
        return this.nama;
    }
}   