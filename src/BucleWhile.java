public class BucleWhile {
    public static void main(String[] args) {
        
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while(prueba) {
            if(i == 50){
                prueba = false;
            } else {
                System.out.println(i);
                i++;
            }
        }
    }
    
}
