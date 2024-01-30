import java.util.Scanner;

public class EjercicioDeComparacion {
        public static void main(String[] args) {
        System.out.println("\033[32m Ingrese el número de nota de la calificación: ");
        Scanner s = new Scanner(System.in);
        Double nota = s.nextDouble();

        if (nota > 10.5) {
        System.out.println("\033[33m La nota de "+ nota +", alcanza para aprobar cholo!!!");
        }else{
            System.out.println("\033[36m La nota de "+ nota +", no es suficiente. Desaprobado y a vender charqui!!!");
        }    
        /*
         * OPERADORES DE COMPARACION
         * == igualdad      a == b
         * != distinto      a != b
         * < menor que      a < b
         * > mayor que      a > b
         * <= menor o igal que      a <= b
         * >= mayor o igual que     a >= b
         * 
         * Programa que pida al usuario una nota, si esta nota el mayor que 10.5
         * mostrar un mensaje de ha aprobado y caso contrario que indique que
         * desaprobo el curso.
         */
    }
}
