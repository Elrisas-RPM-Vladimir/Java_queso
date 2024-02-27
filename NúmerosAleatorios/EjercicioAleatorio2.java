import java.util.Random;

public class EjercicioAleatorio2 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("20 Números aleatorios enteros entre 0 y 10(estos mismos incluidos)");
        int contador = 0;
        while (contador < 21) {
            int i = r.nextInt(11);
            System.out.print(i +" ");
            contador++;
        }
    }
}
