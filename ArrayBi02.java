public class ArrayBi02 {
    public static void main(String[] args) {
        int filas, columnas; //i , j
        int [][] n = {{20,4}, {67,33}, {0,7}};

        for (filas = 0; filas < 3; filas++) {
            System.out.println("fila: "+ filas);
            for (columnas = 0; columnas < 2; columnas++) {
                System.out.printf("%10d ", n[filas][columnas]);
            }
            System.out.println();
        }
    }
}
