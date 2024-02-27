import java.util.Random;

public class JuegoDeDados {
    public static void main(String[] args) {
        System.out.println("La suma de tres dados determinaran si serás pobre o no");
                Random rand = new Random();

        int suma = 0;

        for (int i = 0; i < 3; i++) {

            int dado = rand.nextInt(6) + 1;
            System.out.println("Dado " + (i + 1) + ": " + dado);

            suma += dado;
        }

        if (suma >= 10) {
            System.out.println("¡Has ganado, que suerte que pasaras!");
        } else {
            System.out.println("Lo siento, seras condenado a vivir en lima.");
        }
    }
}
