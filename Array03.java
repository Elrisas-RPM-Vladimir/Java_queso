public class Array03 {
    public static void main(String[] args) {
        // Arreglo de notas
        double[] nota = new double[5];
        double suma = 0;
        System.out.println("Ingrese la nota de la 1er parcial");

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Nota del estudiante nº "+ (i + 1) +": ");
            nota[i] = Double.parseDouble(System.console().readLine());
            suma += nota[i];
        }
        Double media = (double) suma / 5;
        System.out.println("La media es igual a: "+ media);
    }
}
