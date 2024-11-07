
import java.util.Scanner;

public class ArraysEliminarElemento {
    public static void main(String[] args) {
        
        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduce un numero: ");
            a[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Introduce una posicion a eliminar entre 0 y 9: ");
        int pos = sc.nextInt();

        for (int i = pos; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        
       

        int[] b = new int[a.length - 1];
        System.arraycopy(a, 0, b, 0, b.length);  // copiamos el array a en el array b

        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
        
    }
    
}
