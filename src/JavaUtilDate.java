import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {
        
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        // Para personalizar la fecha y hora es mejor ver la api desde la web de java y consultar
        //todos los formatos de fecha y hora disponibles
        //https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  

        String fechaStr = sdf.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        long j = 0;
        for (int i = 0; i < 1000000; i++) {
            j+=i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
       System.out.println("tiempo transcurrido en el bucle for = " + tiempoFinal);
    }
    
}
