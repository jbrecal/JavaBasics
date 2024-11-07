
import java.util.Scanner;

public class ArrayAñadirElementos {
    public static void main(String[] args) {
        
        int[] numeros =  new int[10];

        for(int i = 0; numeros.length > i; i++) {
            numeros[i] = i * 5;
        }

        for(int j = 0; j < numeros.length; j++) {
            System.out.println("numeros[" + j + "] = " + numeros[j]);
        }

        
        // Añadir elementos mediante el teclado con el metodo Scanner
        Scanner sc = new Scanner(System.in);

        int[] numeros2 = new int[10];

        for(int i = 0; i < numeros2.length; i++) {
            System.out.println("Introduce un numero: ");
            int num = sc.nextInt();
            numeros2[i] = num;
        }

        for(int j = 0; j < numeros2.length; j++) {
            System.out.println("numeros2[" + j + "] = " + numeros2[j]);
        }
    }
    
}
