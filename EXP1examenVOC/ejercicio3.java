package EXP1examenVOC;

import java.util.Scanner;

public class ejercicio3 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double gravedad = 9.81;
//escanea el numero escrito y lo procesa para proseguir a realizar formulaciòn del problema
        System.out.println("Introduce la altura desde la que caerá el objeto (en metros): ");
        double altura = s.nextDouble(); //double permitira que el número sea decimal
        double tiempo = Math.sqrt((2 * altura) / gravedad);
        //realiza el calculo de la raíz(math.sqrt) de 2 por la altura(h) entre la gravedad(g)
        System.out.println("El objeto tardará aproximadamente "+ tiempo +" segundos en caer desde una altura de "+ altura +" metros.");
    }
}
