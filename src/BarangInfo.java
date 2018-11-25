
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
public class BarangInfo extends FramePembelian{
    public String pilihItem;
    public String getDate;
    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd";
    
    public BarangInfo() {
    }
    public void getDate(){
        
    }
    public String now(String dateFormat){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }

    public String getPilihItem() {
        return pilihItem;
    }

    public void setPilihItem(String pilihItem) {
        this.pilihItem = pilihItem;
    }
    
}
