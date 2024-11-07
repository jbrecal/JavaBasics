public class WrapperInteger {
    public static void main(String[] args) {
        
        
        int intPrimitivo = 10;
        Integer intObjeto = Integer.valueOf(intPrimitivo);  // convierte un primitivo a un objeto
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto.intValue();  // convierte un objeto a un primitivo
        System.out.println("num = " + num);
        
        String valorTvLcd = "67000";
        Integer tvLcd = Integer.valueOf(valorTvLcd); // convierte un String a un Integer
        System.out.println("tvLcd = " + tvLcd);

    
        Short shortObjeto = intObjeto.shortValue(); // convierte un Integer a un Short
        System.out.println("shortObjeto = " + shortObjeto); 

        Byte byteObjeto = intObjeto.byteValue(); // convierte un Integer a un Byte
        System.out.println("byteObjeto = " + byteObjeto);
    }
    
}
