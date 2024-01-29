package EjerciciosDeLecturaDeDatos;

import java.util.Scanner;

public class EjercicioLD2 {
    public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
        
        System.out.println("Ingresa una cantidad de euros: ");
        double euros = s.nextDouble();
        double soles = 4.1;

        double respuesta = (euros * soles);
        System.out.println("Los soles recibidos por el cambio de moneda es: "+ respuesta);
    }
}
