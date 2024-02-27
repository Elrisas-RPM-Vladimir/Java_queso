import java.util.Random;

public class EjercicioAleatorio6 {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        int columnas = 80;
        int filas = 24;

        while (true) {
            for (int i = 0; i < columnas; i++) {
                char caracter = (char) (r.nextInt(95) + 32);
                System.out.print(caracter);
            }
            System.out.println();
            Thread.sleep(50);
        }
    }
}