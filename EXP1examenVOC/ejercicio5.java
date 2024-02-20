package EXP1examenVOC;

import java.util.Scanner;

public class ejercicio5 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        // for leera los numeros puestos en cada asignaciòn para su verificación de estas
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ":");
            int numero = s.nextInt();
            
            if (numero > 0) {
                contadorPositivos++;
            } else if (numero < 0) {
                contadorNegativos++;
            }
        }//al terminar asignara los numeros negativos y positivos a sus respectivos grupos
        System.out.println("El número de números positivos es: "+ contadorPositivos);
        System.out.println("El número de números negativos es: "+ contadorNegativos);
    }//mostrara por pantalla la cantidad de negativos y positivos en cada grupo
}
