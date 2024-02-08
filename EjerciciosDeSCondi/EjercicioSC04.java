package EjerciciosDeSCondi;

import java.util.Scanner;

public class EjercicioSC04 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("La media de las tres notas es: " + media);

        int calificacionBoletin;

        if (media >= 1 && media <= 10) {
            calificacionBoletin = 1;
        } else if (media >= 11 && media <= 12) {
            calificacionBoletin = 2;
        } else if (media >= 13 && media <= 15) {
            calificacionBoletin = 3;
        } else if (media >= 16 && media <= 20) {
            calificacionBoletin = 4;
        } else {
            calificacionBoletin = 0;
        }

        switch (calificacionBoletin) {
            case 1:
                System.out.println("Calificación del boletín: Insuficiente");
                break;
            case 2:
                System.out.println("Calificación del boletín: Suficiente");
                break;
            case 3:
                System.out.println("Calificación del boletín: Bien");
                break;
            case 4:
                System.out.println("Calificación del boletín: Notable o Sobresaliente");
                break;
            default:
                System.out.println("Calificación del boletín: Nota inválida");
                break;
        }

        scanner.close();
    }
}
