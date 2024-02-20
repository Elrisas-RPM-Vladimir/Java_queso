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

        while (numero != 0) { //while se utiliza para repetir un conjunto de sentencias 
            //siempre que se cumpla una determinada condición.
            introducciones++;

            if (introducciones == 1) { //verificara si los numeros introducidos son enteros excepto el 0
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
            } //el if y else son el si entonces si para verificar los valores numericos 

            System.out.println("Introduce otro número (0 para salir):");
            numero = s.nextInt();
        } //leera si el numero es 0 para terminar el proceso
        System.out.println("El número más repetido es el "+ NumeroRepetido +" y se ha escrito "+ mayorNumeroRepeticiones +" veces.");
        System.out.println("Se han introducido un total de "+ introducciones +" números.");
    } // termina el proceso presentando los numeros introducidos finalizando si hay un 0
}
