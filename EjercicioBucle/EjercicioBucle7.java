package EjercicioBucle;

import java.util.Scanner;

public class EjercicioBucle7 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int combinacion = 202213870;

        for (int intento = 1; intento <= 4; intento++) {
            System.out.print("\033[32m Introduce la combinación de la caja fuerte (4 cifras): ");
            int intentoUsuario = s.nextInt();

            if (intentoUsuario == combinacion) {
                System.out.println("\033[32m La caja fuerte se ha abierto satisfactoriamente.");
                break;
            } else {
                System.out.println("\033[31m Lo siento, esa no es la combinación.");
            }
        }
        s.close();
    }
}
