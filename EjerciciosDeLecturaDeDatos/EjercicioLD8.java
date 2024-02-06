package EjerciciosDeLecturaDeDatos;

import java.util.Scanner;

public class EjercicioLD8 {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
        
        System.out.println("\033[34m Ingresa una cantidad de megabytes: ");
        double MB = s.nextDouble();
        double KB = 1024;

        double respuesta = (MB * KB);
        System.out.println("\033[35m la cantidad de Kilobytes seria: "+ respuesta);
    }
}