
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

            //condicion  ? evalua   si es verdadero : si es falso
        // variable = (condicion) ? valor1 : valor2; // operador ternario

        String variable  = 7 == 7 ? "verdadero" : "falso"; // 7
        System.out.println("variable = " + variable);

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu nota de matemáticas: ");
        double mates = sc.nextDouble();
        System.out.println("Dime tu nota de física: ");
        double fisica = sc.nextDouble();
        System.out.println("Dime tu nota de química: ");
        double quimica = sc.nextDouble();

        double promedio = (fisica + quimica + mates) / 3;

        String estado = promedio >= 5.0 ? "Aprobado" : "Suspenso";
        System.out.println("estado = " + estado);
    }
    
}
