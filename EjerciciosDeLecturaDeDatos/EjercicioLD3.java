package EjerciciosDeLecturaDeDatos;

import java.util.Scanner;

public class EjercicioLD3 {
    public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
        
        System.out.println("\033[90m Ingresa una cantidad de Pesetas: ");
        double pesetas = s.nextDouble();
        double euros = 0.0060;

        double respuesta = (pesetas * euros);
        System.out.println("\033[36m Los euros recibidos por el cambio de moneda es: "+ respuesta);
    }
}
