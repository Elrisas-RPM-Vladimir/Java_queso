public class NumerosAleatorios {
    public static void main(String[] args) {
        /* Números aleatorios me sirve para anular el comportamiento
         * de un fenomeno, el resultado juegos de azar o cualquier valor
         * 
         * Generación de un numero aleatorio:
         * con decimales: son numeros de tipo double
         * sin decimales: sin numeros de tipo int
         * 
         */
        {System.out.println("10 Números aleatorios con decimales");
        for (int i = 1; i < 11 ; i++) {
            System.out.println(Math.random()*11 + 1);
        }
    }
        {System.out.println("10 Números aleatorios enteros");
        for (int i = 10; i < 20; i++) {
            System.out.println((int)(Math.random()*(20 - 14)) + 15);
        }
    }
        //queso
    }
}
