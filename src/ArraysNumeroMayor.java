
import java.util.Scanner;

public class ArraysNumeroMayor {
    public static void main(String[] args) {
        
        int[] a  = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 5 numeros: ");
        for (int i = 0; i < a.length; i++) {
            
            a[i] = sc.nextInt();
        }

        int mayor = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > mayor) {  //si el valor de a[i] es mayor que el mayor
                mayor = a[i];  //el mayor pasa a ser el valor de a[i]
            }
        }

        System.out.println("El numero mayor es: " + mayor);
    }
    
}
