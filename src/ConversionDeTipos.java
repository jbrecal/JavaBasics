public class ConversionDeTipos {
    public static void main(String[] args) {
        
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr); // lo convierte en un entero
        System.out.println("numeroInt = " + numeroInt);

        Short numeroShort = Short.parseShort(numeroStr); // lo convierte en un Short
        System.out.println("numeroShort = " + numeroShort);

        long numeroLong = Long.parseLong(numeroStr); // lo convierte en un Long
        System.out.println("numeroLong = " + numeroLong);

        float numeroFloat = Float.parseFloat(numeroStr); // lo convierte en un Float
        System.out.println("numeroFloat = " + numeroFloat);

        double numeroDouble = Double.parseDouble(numeroStr); // lo convierte en un Double
        System.out.println("numeroDouble = " + numeroDouble);

        String logico = "true";
        boolean logicoBool = Boolean.parseBoolean(logico); // lo convierte en un boolean
        System.out.println("logicoBool = " + logicoBool);


        int otroNumeroInt = 5;
        String otroNumeroStr = Integer.toString(otroNumeroInt); // lo convierte en un String
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10); // lo convierte en un String
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        
        double otroRealDouble = 5.5;
        String otroRealStr = Double.toString(otroRealDouble); // lo convierte en un String
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.2354f); // lo convierte en un String
        System.out.println("otroRealStr = " + otroRealStr);


    }
    
}

