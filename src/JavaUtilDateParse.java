import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {
    public static void main(String[] args) {
        
        //Para convertir un string a una fecha
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una fecha con formato dd-MM-yyyy: ");
        String fecha = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;

        try {
            date = sdf.parse(fecha);
            System.out.println(date);
            System.out.println("con formato = " + sdf.format(date));
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }
    
}
