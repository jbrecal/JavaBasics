public class AutoBoxingInteger {
    public static void main(String[] args) {
        
        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int suma = 0;

        for (Integer i : enteros) {
            if(i.intValue() % 2 == 0) { // intValue() convierte un Integer a un int, si es par
                suma += i.intValue(); // se suma
            }
        }
        System.out.println("Suma = " + suma);
    }
}
