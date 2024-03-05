package ArreglosUnidimencionales;

import java.util.Random;

public class EjercicioAU03 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = r.nextInt(101);
        }
        for (int i = 0; i < numero.length; i++) {
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
        }
        System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i] + "\t" + cuadrado[i] + "\t\t" + cubo[i]);
        }
    }
}
