
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();

        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);
        
         // cambiamos la fecha
         // calendario.set(2020, 0, 1,23,59,59);
       calendario.set(Calendar.YEAR, 2020); 
       calendario.set(Calendar.MONTH, Calendar.JUNE); 
       calendario.set(Calendar.DAY_OF_MONTH, 12);
       calendario.set(Calendar.HOUR_OF_DAY, 21);
       calendario.set(Calendar.MINUTE, 20);
       calendario.set(Calendar.SECOND, 10);

       Date fecha2 = calendario.getTime();
       System.out.println("fecha sin formato = " + fecha2);

       // para formatear la fecha
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
       String fechaStr = sdf.format(fecha2);
       System.out.println("fecha con formato = " + fechaStr);
    }
    
}
