import java.util.Random;

public class NumerosAleatorios2 {
    public static void main(String[] args) {
        Random r = new Random();
        int contador = 0;
        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        {System.out.println("50 números aleatorios entre 100 y 199");
        while (contador < 50) {
            int i = r.nextInt(100) + 100;
            System.out.print(i + " ");
            contador++;
            suma += i;
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        double media = (double) suma / 50;
        System.out.println("\nMáximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + media);
        }
    }
        //queso
}