package EjerciciosDeSCondi;

import java.util.Scanner;

public class EjercicioSC06 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;

        System.out.println("Responde las siguientes preguntas:");
        System.out.println("1. ¿Cuál es la capital de Francia?");
        System.out.println("a) Londres  b) París  c) Roma  d) Madrid");
        System.out.print("Tu respuesta: ");
        char respuesta1 = scanner.next().charAt(0);

        System.out.println("2. ¿Cuál es el resultado de 2 + 2?");
        System.out.println("a) 3  b) 4  c) 5  d) 6");
        System.out.print("Tu respuesta: ");
        char respuesta2 = scanner.next().charAt(0);

        System.out.println("3. ¿Quién escribió 'Don Quijote de la Mancha'?");
        System.out.println("a) Miguel de Cervantes  b) Gabriel García Márquez  c) Julio Cortázar  d) Pablo Neruda");
        System.out.print("Tu respuesta: ");
        char respuesta3 = scanner.next().charAt(0);
        if (respuesta1 == 'b') {
            puntos++;
        }
        if (respuesta2 == 'b') {
            puntos++;
        }
        if (respuesta3 == 'a') {
            puntos++;
        }
        switch (puntos) {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Tu calificación es: Insuficiente");
                break;
            case 4:
            case 5:
                System.out.println("Tu calificación es: Suficiente");
                break;
            case 6:
            case 7:
                System.out.println("Tu calificación es: Bien");
                break;
            case 8:
            case 9:
                System.out.println("Tu calificación es: Notable");
                break;
            case 10:
                System.out.println("¡Felicidades! Tu calificación es: Sobresaliente");
                break;
            default:
                System.out.println("Calificación no válida");
                break;
        }
        scanner.close();
    }
}
