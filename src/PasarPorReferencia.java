public class PasarPorReferencia {
    public static void main(String[] args) {
       
                
                int[]edad = {10, 11, 12};
                System.out.println("iniciamos el metodo main ");
                for(int i = 0; i < edad.length; i++) {
                    System.out.println("edad[" + i + "] = " + edad[i]);
                }
                System.out.println("Antes de llamar al metodo cambiar");
                cambiar(edad);
                System.out.println("Despues de llamar el metodo cambiar");
                for(int i = 0; i < edad.length; i++) {
                    System.out.println("edad[" + i + "] = " + edad[i]);
                }
                System.out.println("Finalizamos el metodo main con los datos del arreglo cambiados"); 
            }
            public static void cambiar(int[] edadArray) {
                System.out.println("Iniciamos el metodo cambiar");
                for(int i = 0; i < edadArray.length; i++) {  
                    edadArray[i] = edadArray[i] + 10;  // se le suman 10 a cada elemento
                }
                
            System.out.println("Finalizamos el metodo cambiar");
                
            }
            
        
        
    
    
}
