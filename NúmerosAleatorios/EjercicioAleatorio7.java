import java.util.Random;

public class EjercicioAleatorio7 {
    public static void main(String[] args) {
                Random r = new Random();
        while (true) {
            int dado1 = r.nextInt(6) + 1;
            int dado2 = r.nextInt(6) + 1;

            System.out.println("Tirada de los dados: Dado 1: " + dado1 + ", Dado 2: " + dado2);

            if (dado1 == dado2) {
                System.out.println("¡Ambos dados tienen el mismo valor! Tirada exitosa.");
                break;
            }
        }
    }
}
