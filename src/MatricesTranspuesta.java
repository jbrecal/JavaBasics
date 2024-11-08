public class MatricesTranspuesta {
    public static void main(String[] args) {
        
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = " + matriz[i][j] + " ");
            }
            System.out.println();
        }
        // vamos a recorrer solo la diagonal principal de la matriz porque sino la matriz quedará como estaba

      
        int aux = 0;
        for(int i = 1; i < matriz.length; i++){
            for(int j = 0; j < i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
