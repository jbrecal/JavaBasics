
import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nota: ");
        float promedio = sc.nextFloat();

        if (promedio >= 7.0) {
            System.out.println("Muy bien");
        } else if (promedio >= 5.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
    }
    
}
