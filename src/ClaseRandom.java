
import java.util.Random;

public class ClaseRandom {
    public static void main(String[] args) {
        
        Random randomObj = new Random();

        int randomInt = randomObj.nextInt(100); // cada next genera un numero aleatorio entre 0 y 99
        System.out.println("randomInt = " + randomInt);

        int randomInt2 = 15 + randomObj.nextInt(25-15); // entre 15 y 25
        System.out.println("randomInt2 = " + randomInt2);
    }
    
}
