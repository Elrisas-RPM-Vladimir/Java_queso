import java.util.Scanner;

public class Sentenciaif1 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número entero: ");
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();

        if (numero > 0) {
            System.out.println("El número "+ numero +" es positivo");
        }else{
            System.out.println("El número "+ numero +" es negativo");
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
