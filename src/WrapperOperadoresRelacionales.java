public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        
        Integer num1 = Integer.valueOf(100);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto = " + (num1 == num2));

        System.out.println("¿Tienen el mismo valor? " + (num1.equals(num2)));

        num2 = 1000; // cambiamos el valor de num2

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto = " + (num1 == num2));
        // ya no son el mismo objeto porque cambiamos el valor de num2 y se instancia un nuevo objeto

        System.out.println("¿Tienen el mismo valor? " + (num1.equals(num2)));
    }
    
}
