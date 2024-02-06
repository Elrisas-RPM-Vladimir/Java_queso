package EjerciciosDeLecturaDeDatos;

import java.util.Scanner;

public class EjercicioLD6 {
           public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
        
        System.out.println("\033[31m Ingresa la altura y la base del triángulo a calcular: ");
        double b = s.nextDouble();
        double h = s.nextDouble();
        System.out.println("\033[36m valor de la base: "+ b);
        System.out.println("\033[34m valor de la altura: "+ h);

        double respuesta = (b * h)/2;
        System.out.println("\033[32m el área del triángulo es: "+ respuesta);
    }
}
