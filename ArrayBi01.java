public class ArrayBi01 {
    public static void main(String[] args) {
        int[][] n = new int[3][2]; //crear un array de 3 filas y 2 columnas

        n[0][0] = 20;
        n[1][0] = 5;
        n[1][1] = 33;
        n[2][1] = 50;
        n[2][0] = 4;
        n[0][1] = 43;
        //n[2][2] = 20; no existe esa posició
        //  0  1
        //0[_][_]
        //1[_][_] --> filas
        //2[_][_]
        //  ][
        //  \/  
        //columnas
        //representación de la tabla por el int[3][2] que indica la
        //cantidad de arrays de la tabla o programa.
        int filas, columnas;
        for (filas = 0; filas < 3; filas++){
            System.out.print("fila"+ filas);
            for ( columnas = 0; columnas < 2; columnas++) {
                System.out.printf("%10d", n[filas][columnas]);
            }
            System.out.println();
        }
    }
}
