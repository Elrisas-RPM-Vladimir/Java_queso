import java.util.Random;

public class EjercicioAleatorio5 {
    public static void main(String[] args) {
              Random r = new Random();
        int i = 0;

        while (true) {
            int numeroAleatorio = r.nextInt(51) * 2;
            System.out.print(numeroAleatorio + " ");
            i++;
            if (numeroAleatorio == 24) {
                break;
            }
        }
        System.out.println("Números generados: " + i);
    }
}
