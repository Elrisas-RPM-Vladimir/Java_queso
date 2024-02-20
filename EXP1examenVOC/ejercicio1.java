package EXP1examenVOC;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Los números del 1 al 1000, contando de 20 en 20: ");
        Scanner s = new Scanner(System.in); //leera si respondo si o no al continuar el programa
        int inicio = 1;
        int fin = 1000;
        int grupo = 20;

        //los comandos for van a realizar un analisis a i sus respectivos valores
        //para verificar si cumplen los requisitos
        System.out.println("Números del 1 al 1000 de 20 en 20:");
        for (int i = inicio; i <= fin; i += grupo) {
            for (int j = i; j < i + grupo && j <= fin; j++) {
                System.out.print(j + " - ");
            }
            System.out.println();
            System.out.println("¿Quiere continuar? (S/N)"); // pregunta sobre si quiere continuar o no
            String respuesta = s.nextLine();
            if (!respuesta.equalsIgnoreCase("S")) {
                break; //el squals va a actuar como en sistema de continuación o finalización del código terminando con un break
            }
        } // si cancelo el continuar de 1 al 1000 entonces comienza un nuevo código en el cuan decidire sobre:
        System.out.println("Introduzca dos valores enteros para mostrar los números entre ellos:");
        inicio = s.nextInt();
        fin = s.nextInt();
        //su inicio donde comienza y su fin el numero final
        System.out.println("Introduzca el tamaño del grupo:");
        grupo = s.nextInt(); //asigna el grupo que se va a generar en la suceción
        System.out.println("Números entre "+ inicio +" y "+ fin +" de "+ grupo +" en "+ grupo +":");
        for (int i = inicio; i <= fin; i += grupo) {
            for (int j = i; j < i + grupo && j <= fin; j++) {
                System.out.print(j + " ");
                //los comandos for van a realizar un analisis a i sus respectivos valores
        //para verificar si cumplen los requisitos
            }
            System.out.println();
            System.out.println("¿Quiere continuar? (S/N)"); // pregunta sobre si quiere continuar o no
            String respuesta = s.nextLine();
            if (!respuesta.equalsIgnoreCase("S")) {
                break; //el squals va a actuar como en sistema de continuación o finalización del código terminando con un break
            }
        }
    }
}