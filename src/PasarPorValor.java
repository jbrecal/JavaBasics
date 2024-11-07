public class PasarPorValor {
    public static void main(String[] args) {
        
        int i = 10;
        System.out.println("iniciamos el metodo main con i = " + i);
        cambiar(i);
        System.out.println("Finalizamos el metodo main con i = " + i);
    }
    public static void cambiar(int i) {
        System.out.println("Iniciamos el metodo cambiar con i = " + i);
        i = 20;
        System.out.println("Finalizamos el metodo cambiar con i = " + i);
    }
    
}
