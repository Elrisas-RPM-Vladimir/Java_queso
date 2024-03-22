import java.util.Random;

public class ArrayMaxMin2 {
    public static void main(String[] args) {
        int[][] array = new int[6][10];
        llenarArray(array);
        int[] posicionMaximo = encontrarMaximo(array);
        int[] posicionMinimo = encontrarMinimo(array);
        mostrarArray(array);

        System.out.println("Posición del máximo: Fila " + posicionMaximo[0] + ", Columna " + posicionMaximo[1]);
        System.out.println("Posición del mínimo: Fila " + posicionMinimo[0] + ", Columna " + posicionMinimo[1]);
    }
    public static void llenarArray(int[][] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(1001);
            }
        }
    }
    public static int[] encontrarMaximo(int[][] array) {
        int maximo = array[0][0];
        int[] posicionMaximo = {0, 0};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maximo) {
                    maximo = array[i][j];
                    posicionMaximo[0] = i;
                    posicionMaximo[1] = j;
                }
            }
        }
        return posicionMaximo;
    }
    public static int[] encontrarMinimo(int[][] array) {
        int minimo = array[0][0];
        int[] posicionMinimo = {0, 0};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < minimo) {
                    minimo = array[i][j];
                    posicionMinimo[0] = i;
                    posicionMinimo[1] = j;
                }
            }
        }
        return posicionMinimo;
    }
    public static void mostrarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
