import java.util.Random;
import java.util.Scanner;

public class EjercicioAleatorio4 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
        Random r = new Random();
        int numeroSecreto = r.nextInt(101);
        int intentos = 5;
        System.out.println("¡Bienvenido al juego de adivinar el número!");

        while (intentos > 0) {
            System.out.print("\033[36m Introduce un número entre 0 y 100: ");
            int numeroUsuario = s.nextInt();
            if (numeroUsuario == numeroSecreto) {
                System.out.println("\033[32m ¡Felicidades! Has adivinado el número secreto: " + numeroSecreto);
                break;
            } else {
                System.out.println("\033[35m Lo siento, número incorrecto.");
                if (numeroUsuario < numeroSecreto) {
                    System.out.println("\033[36m El número secreto es mayor.");
                } else {
                    System.out.println("\033[33m El número secreto es menor.");
                }

                intentos--;
                System.out.println("\033[35m Te quedan " + intentos + " intentos.");
            }
        }
        if (intentos == 0) {
            System.out.println("\033[31m Lo siento, has agotado tus intentos. El número secreto era: " + numeroSecreto);
        } 
    }
}
