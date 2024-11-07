public class SentenciaIfElseNumDiaMes {
    public static void main(String[] args) {
        
       
        System.out.println("Introduce el año: ");
        int anio = Integer.parseInt(System.console().readLine());
        int mes = 0;
        int numeroDias = 0;
        

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numeroDias = 31;
        } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            numeroDias = 30;
        } else if(mes == 2){
        
        }  if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
            System.out.println("Si es un año bisiesto");
            numeroDias = 29;
        } else {
            System.out.println("No es un año bisiesto");
            numeroDias = 28;
        }

        System.out.println("El mes de febrero tiene " + numeroDias + " dias");
    }
    
}
