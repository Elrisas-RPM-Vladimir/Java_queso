package EXP1examenVOC;

import java.util.Scanner;

public class ejercicio2 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int mayorNumeroRepeticiones = 0;
        int NumeroRepetido = 0;
        int repeticionesConsecutivas = 0;

        System.out.println("Introduce un número (0 para salir):");
        int numero = s.nextInt();
        int introducciones = 0;

        while (numero != 0) {
            introducciones++;

            if (introducciones == 1) {
                NumeroRepetido = numero;
            }

            if (numero == NumeroRepetido) {
                repeticionesConsecutivas++;
                if (repeticionesConsecutivas > mayorNumeroRepeticiones) {
                    mayorNumeroRepeticiones = repeticionesConsecutivas;
                }
            } else {
                repeticionesConsecutivas = 1;
                NumeroRepetido = numero;
            }

            System.out.println("Introduce otro número (0 para salir):");
            numero = s.nextInt();
        }
        System.out.println("El número más repetido es el "+ NumeroRepetido +" y se ha escrito "+ mayorNumeroRepeticiones +" veces.");
        System.out.println("Se han introducido un total de "+ introducciones +" números.");
    }
}
