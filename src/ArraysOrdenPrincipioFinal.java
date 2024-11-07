public class ArraysOrdenPrincipioFinal {
    public static void main(String[] args) {
        
        int[] numero = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = i + 1;  // para que parta desde 1 y no 0
        }

        int aux = 0;

        for (int i = 0; i < numero.length / 2; i++) {  // dividimos entre 2 para obtener la mitad del arreglo
            a[aux++] = numero[i];
            a[aux++] = numero[numero.length - 1 - i];
            //System.out.println("numero[" + i + "] = " + numero[i]);
            //System.out.println("numero[" + i + "] = " + numero[numero.length - 1 - i]);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
    
}
