package ArreglosBidimencionales;

import java.util.Random;

public class EjercicioBi1 {
    public static void main(String[] args) {
        int [][] num = new int[3][6];
        num[0][0] = 0;
        num[0][1] = 30;
        num[1][0] = 75;
        num[0][2] = 2;
        num[2][2] = -2;
        num[2][3] = 9;
        num[1][4] = 0;
        num[0][5] = 5;
        num[2][5] = 11;
        int filas, columnas;
        System.out.print("            ");
        for ( columnas = 0; columnas < 6; columnas++) {
            System.out.print(" colum("+ columnas +") ");
        }
        System.out.println();
        for (filas = 0; filas < 3; filas++){
            System.out.print("fila ("+ filas +")");
            for ( columnas = 0; columnas < 6; columnas++) {
                System.out.printf("%10d", num[filas][columnas]);
            }
            System.out.println();   
        }
        Random r = new Random();
        if (num[3][6] == 0) {
            num[3][6] = r.nextInt(121);
        }
    }
}
