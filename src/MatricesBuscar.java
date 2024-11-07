public class MatricesBuscar {
    public static void main(String[] args) {
        
        int[][] numeros = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        int elementoBuscar = 5; // El elemento a buscar en la matriz

        boolean encontrado = false;
        int i = 0;
        int j = 0;
    
       buscar: for (i = 0; i < numeros.length; i++) {
            for ( j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
           
        }
        if (encontrado) {
            System.out.println("El elemento " + elementoBuscar + " se encuentra en la posicion [" + i + "][" + j + "]");
        } else {
            System.out.println("El elemento " + elementoBuscar + " no se encuentra en la matriz.");
        }
    }
    
}
