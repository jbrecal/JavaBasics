
import java.util.List;


public class Arrays {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = Integer.valueOf(2);
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];
        int m = numeros[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);

        //obetener el ultimo elemento del arreglo
        System.out.println("numeros[numeros.length - 1] = " + numeros[numeros.length - 1]);
        System.out.println("");

        String[] productos = new String[3];
        productos[0] = "Iphone 15";
        productos[1] = "PC HP Victus 15";
        productos[2] = "Macbook M3";

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);

        System.out.println("");

        for (int indice = 0; indice < productos.length; indice++) {
            System.out.println("productos[" + indice + "] = " + productos[indice]);

        }
        System.out.println("");
        System.out.println("Ordenador con el método sort");

        //Ordenar el array
        java.util.Arrays.sort(productos);

        for (int indice = 0; indice < productos.length; indice++) {
            System.out.println("productos[" + indice + "] = " + productos[indice]);
        }
        System.out.println("");

        //Usando for each
        for (String prod : productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("");

        //Usando while
        int indice = 0;
        while (indice < productos.length) {
            System.out.println("productos[" + indice + "] = " + productos[indice]);
            indice++;
        }

       

    }

    static List<?> asList(String[] productos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
