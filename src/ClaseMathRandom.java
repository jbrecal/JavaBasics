public class ClaseMathRandom {
    public static void main(String[] args) {
        
        String[] colores = {"rojo", "azul", "verde", "amarillo", "morado", "lila", "negro", "rosa", "blanco", "naranja"};

        double random = Math.random();
        random = random * colores.length;  // entre 0 y 9
        System.out.println(random);
        System.out.println(colores[(int)random]);  // hay que castearlo
    }
    
}
