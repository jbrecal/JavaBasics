public class ArraysInverso {
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 10 elementos
        
        for (int i = numeros.length - 1; i >= 0; i--) { // i = 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
    }
    
}
