public class MatricesColumnasVariable {
    public static void main(String[] args) {

        int[][] matriz = new int[3][];  // 3 filas y columnas variable

        matriz[0] = new int[2]; // 2 columnas en la primera fila
        matriz[1] = new int[3]; // 3 columnas en la segunda fila
        matriz[2] = new int[4]; // 4 columnas en la tercera fila

        System.out.println("matriz length = " + matriz.length);
        System.out.println("matriz[0] length = " + matriz[0].length);
        System.out.println("matriz[1] length = " + matriz[1].length);
        System.out.println("matriz[2] length = " + matriz[2].length);

        // Llenando la matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j;
            }
        }
        // Imprimiendo la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = " + matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
