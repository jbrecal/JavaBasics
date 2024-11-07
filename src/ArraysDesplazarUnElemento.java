
import java.util.Scanner;

public class ArraysDesplazarUnElemento {
    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        int ultimo;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero: ");
            numeros[i] = sc.nextInt();
        }

        ultimo = numeros[numeros.length - 1];
        for(int i = numeros.length - 2; i >= 0; i--) {
            numeros[i + 1] = numeros[i];
        }
        numeros[0] = ultimo;
        System.out.println("El array: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
     
    }
    
}
