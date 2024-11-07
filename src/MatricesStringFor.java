public class MatricesStringFor {
    public static void main(String[] args) {
        
        String[][] nombres = new String[3][2];
        nombres[0][0] = "Pedro"; 
        nombres[0][1] = "Maria"; 
        nombres[1][0] = "Jose"; 
        nombres[1][1] = "Juan"; 
        nombres[2][0] = "Ana"; 
        nombres[2][1] = "Luis"; 

        // Otra manera de representar la matriz

        String[][] nombres2 = {{"Pedro", "Maria"}, {"Jose", "Juan"}, {"Ana", "Luis"}};

        // Iterando con un for
        
        for (int i = 0; i < nombres.length; i++) { // primer for recorre las filas
            for (int j = 0; j < nombres[i].length; j++) { // segundo for recorre las columnas
                System.out.println("nombres[" + i + "][" + j + "] = " + nombres[i][j]);
            }
        }

        // Iterando con un for each
        for (String[] array : nombres2) {
            for (String nombre : array) {
                System.out.println("nombre = " + nombre);
            }
        }
    }
    
}
