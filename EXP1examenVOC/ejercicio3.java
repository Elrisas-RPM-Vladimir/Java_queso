package EXP1examenVOC;

import java.util.Scanner;

public class ejercicio3 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double gravedad = 9.81;

        System.out.println("Introduce la altura desde la que caerá el objeto (en metros): ");
        double altura = s.nextDouble();
        double tiempo = Math.sqrt((2 * altura) / gravedad);
        System.out.println("El objeto tardará aproximadamente "+ tiempo +" segundos en caer desde una altura de "+ altura +" metros.");
    }
}
