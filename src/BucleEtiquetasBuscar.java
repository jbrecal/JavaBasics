public class BucleEtiquetasBuscar {
    public static void main(String[] args) {
        
        String frase = "tres tristes tigres comen trigo en un trigal";
        int count = frase.length();
        int cantidad = 0;

        for (int i=0; i < count; i++) { 
            if (frase.charAt(i) != 't') { // si la letra no es 't'
                continue;
            }
            cantidad += 1;
        
            
        }
        System.out.println();
        System.out.println("cantidad = " + cantidad);
        
    }
    
}
