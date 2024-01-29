package EjerciciosDeLecturaDeDatos;
import java.util.Scanner;


public class EjercicioLD1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingresa dos numeros, separados por espacios: ");
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();


        double respuesta = (x1 * x2);
        System.out.println("La multiplicación es: "+ respuesta);
    }
}
