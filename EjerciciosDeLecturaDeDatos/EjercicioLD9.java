package EjerciciosDeLecturaDeDatos;

import java.util.Scanner;

public class EjercicioLD9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[36m Introduce la nota del primer examen: ");
        double notaPrimerExamen = scanner.nextDouble();

        System.out.print("\033[35m ¿Qué nota quieres sacar en el trimestre? ");
        double notaDeseada = scanner.nextDouble();

        double notaSegundoExamen = (notaDeseada + notaPrimerExamen)/2;

        System.out.println("\033[32m Para tener un " + notaDeseada + " en el trimestre necesitas sacar un " + notaSegundoExamen + " en el segundo examen.");
    }
}
