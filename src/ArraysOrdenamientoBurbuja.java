public class ArraysOrdenamientoBurbuja {
    public static void main(String[] args) {
        
        String[] productos = {"Kingston", "Macbook", "Iphone 15", "Audifonos",
         "Teclado", "Celular", "Mouse", "Monitor", "Laptop", "Television "}; // 10 elementos

         int total = productos.length;

         int contandor = 0;

         for(int i = 0; i < total ; i++) {
             for(int j = 0; j < total -1 -i; j++) {
                 if(productos[i].compareTo(productos[j]) < 0) {
                     String temporal = productos[i];
                     productos[i] = productos[j];
                     productos[j] = temporal;
                 }
                 contandor++;
             }
         }

         for(int i = 0; i < total; i++) {
             System.out.println(productos[i] );

         }
         System.out.println("Total de comparaciones: " + contandor);

         //Ordenamiento Burbuja con int

         int[] numeros = {5, 8, 1, 6, 7, 4, 2, 0, 10, 3}; // 10 elementos

         int totalNumeros = numeros.length;

         for(int i = 0; i < totalNumeros -1; i++) {

             for(int j = 0; j < totalNumeros -1 -i; j++) {
                 if( ((Integer)numeros[j+1]).compareTo(numeros[j]) < 0) {  
                     int temporal = numeros[j];
                     numeros[j] = numeros[j+1];
                     numeros[j+1] = temporal;
                 }
                 contandor++;
             }
         }

         for(int i = 0; i < totalNumeros; i++) {
             System.out.println(numeros[i]);
         }
         System.out.println("Total de comparaciones: " + contandor);



    }
    
}
