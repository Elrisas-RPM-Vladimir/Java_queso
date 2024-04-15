package ExamenFinal;

import java.util.Scanner;

public class FinalSpace5 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numero = s.nextLong();
    numero = Math.abs(numero);

    System.out.print("Dígitos pares: ");
    int sumadigitospares = 0;
    boolean primerpar = true;
    while (numero > 0) {
        long digito = numero % 10;
        if (digito % 2 == 0) {
            if (!primerpar) {
                System.out.print(" ");
            }
            System.out.print(digito);
            sumadigitospares += digito;
            primerpar = false;
        }
        numero /= 10;
        }
    System.out.println();
    System.out.println("Suma de los dígitos pares: " + sumadigitospares);
    }    
}
