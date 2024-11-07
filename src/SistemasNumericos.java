
import javax.swing.JOptionPane;

public class SistemasNumericos {
    public static void main(String[] args) {
        
        String numeroString = JOptionPane.showInputDialog("Dame un numero entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No es un numero entero");
            main(args);
            System.exit(0);
        }
        

        System.out.println("numeroDecimal = " + numeroDecimal);

    
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);  // lo convierte en un binario


        int numeroBinario = 0b111110100;  //hay que anteponer 0b para indicar que es binario
        System.out.println("numeroBinario = " + numeroBinario);  // mostrará el valor 500

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal); // lo convierte en un octal

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex); // lo convierte en un hexadecimal
   
        String mensaje = resultadoBinario + "\n" + resultadoOctal + "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);
   
    }
    
}
