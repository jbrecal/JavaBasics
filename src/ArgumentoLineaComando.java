public class ArgumentoLineaComando {
    public static void main(String[] args) {

        //primero tenemos que compilar con  javac ArgumentoLineaComando.java y luego java ArgumentoLineaComando mas argumentos

        if(args.length == 0) {
            System.out.println("No se han pasado argumentos");
            System.exit(-1);
        }
        
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
    
}
