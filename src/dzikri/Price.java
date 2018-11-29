package dzikri;


import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/

public class Price {
    
    private HashMap<String, Float> items = new HashMap<>();

    public Price() {
        this.items.put("Gula", new Float(30000));
        this.items.put("Kopi", new Float(10000));
        this.items.put("Susu", new Float(20000));
    }
    
    public ArrayList<String> getNama(){
        ArrayList<String> objek = new ArrayList<>();
        for (String item : this.items.keySet()) {
            objek.add(item);
        }
        return objek;
    }
    
    
    
    public ArrayList<Float> getHarga(){
        ArrayList<Float> objek = new ArrayList<>();
        for (Float item : this.items.values()) {
            objek.add(item);
        }
        return objek;
    }
    
    
    public void addItem(String nama,float harga){
        this.items.put(nama, harga);
    }
}
