

public class ArraysMutable {
    public static void main(String[] args) {
        
        String [] productos = {"Tablet", "Audifonos", "Teclado", "Celular", "Mouse", "Monitor", "Laptop", "Television", "Impresora"}; 
         
        int total = productos.length;

        for(int i =0; i < total / 2; i++) {  //al dividir entre 2 el total de elementos, se obtiene la mitad y lo ordena de forma inversa
            String actual = productos[i];  //almacena el primer elemento
            String inverso = productos[total - 1 - i];  //almacena el ultimo elemento
            productos[i] = inverso;  //reemplaza el primer elemento con el inverso
            productos[total - 1 - i] = actual;  //reemplaza el inverso con el primer elemento
        }

        for(int i =0; i < total; i++) {
            System.out.println(productos[i]);
        }

       // Collections.reverse(Arrays.asList(productos));

    }
    
}
