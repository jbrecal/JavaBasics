import java.util.Scanner;

public class ArraysDesplazarUnElemento2 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int elemento, posicion;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length -1; i++) {
            System.out.println("Introduce un numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Introduce un elemento a desplazar: ");
        elemento = sc.nextInt();

        System.out.println("Introduce una posicion de 0 a 9: ");
        posicion = sc.nextInt();

        for (int i = numeros.length - 2; i >= posicion; i--) {
            numeros[i + 1] = numeros[i];
        }
        numeros[posicion] = elemento;

        System.out.println("El array: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }


    }
    
}
