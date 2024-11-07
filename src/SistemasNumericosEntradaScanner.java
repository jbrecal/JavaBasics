
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero entero");
        String numeroString = sc.nextLine(); //lee una cadena de caracteres
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroString);
        } catch (NumberFormatException e) {
            System.out.println("Error!!, no es un numero entero");
            main(args);
            System.exit(0);
        }
        

        System.out.println("numeroDecimal = " + (float)numeroDecimal);

    
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        
   
        String mensaje = resultadoBinario + "\n" + resultadoOctal + "\n" + resultadoHex;
        System.out.println(mensaje);
   
    }
    
}
