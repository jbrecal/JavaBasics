import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateCompare {
    public static void main(String[] args) {
        
        //Para convertir un string a una fecha
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una fecha con formato dd-MM-yyyy: ");
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        

        try {
            Date fecha = sdf.parse(sc.next());
            System.out.println(fecha);
            System.out.println("con formato = " + sdf.format(fecha));

            Date fecha2 = new Date();

            if(fecha.after(fecha2)){
                System.out.println("La fecha introducida por el usuario es posterior que la fecha actual");
            } else if(fecha.before(fecha2)){
                System.out.println("La fecha introducida es anterior que la fecha actual");
            } else if(fecha.equals(fecha2)){
                System.out.println("La fecha introducida es igual que la fecha actual                                                                                                                                                   ");
            }

            // otro método de comprar fechas con el compareTo
            if(fecha.compareTo(fecha2) > 0){  // Si es menor que 0 es anterior
                System.out.println("La fecha introducida por el usuario es posterior que la fecha actual (compareTo)");
            } else if(fecha.compareTo(fecha2) < 0){  // Si es mayor que 0 es posterior
                System.out.println("La fecha introducida es anterior que la fecha actual(compareTo)");
            } else if(fecha.compareTo(fecha2) == 0){ // Si es 0 es igual
                System.out.println("La fecha introducida es igual que la fecha actual(compareTo)");
            }

            
        } catch (ParseException e) {
            e.printStackTrace();
        }
       
    }
    
}
