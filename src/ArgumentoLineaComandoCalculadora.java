public class ArgumentoLineaComandoCalculadora {

    public static void main(String[] args) {

// primero tenemos que compilar con javac desde nuestra terminal javac .\ArgumentoLineaComandoCalculadora.java 
// y luego con java desde nuestra terminal java ArgumentoLineaComandoCalculadora <operacion> <a> <b>

        if (args.length != 3) {
            System.out.println("Uso: java ArgumentoLineaComandoCalculadora <operacion> <a> <b>");
            return;
        }
        
        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double res = 0;

        switch (operacion) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            default:
                System.out.println("Operacion no valida");
                return;
        }
        System.out.println(a + " " + operacion + " " + b + " = " + res);
    }
    
}
