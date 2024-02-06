package EjerciciosDeLecturaDeDatos;

import java.util.Scanner;

public class EjercicioLD5 {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
        
        System.out.println("\033[33m Ingresa el ancho y largo del rectángulo a calcular: ");
        double b = s.nextDouble();
        double h = s.nextDouble();
        System.out.println("\033[32m valor de la base: "+ b);
        System.out.println("\033[34m valor de la altura: "+ h);

        double respuesta = (b * h);
        System.out.println("\033[35m el área del rectángulo es: "+ respuesta);
    }
}
