
import java.util.Scanner;

public class ArraysBuscarElemento {

    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Introduce un numero a buscar: ");
        int num = sc.nextInt();

        int i = 0;

        while (i < a.length && a[i] != num) { 
            i++;
        }

        if (i == a.length) {
            System.out.println("No se ha encontrado el elemento");
        } else if (a[i] == num) {
            System.out.println("Se ha encontrado el elemento en la posicion " + i);
        }
    }

}
