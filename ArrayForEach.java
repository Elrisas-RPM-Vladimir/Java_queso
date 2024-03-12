public class ArrayForEach {
    public static void main(String[] args) {
        //Para no tener errorescon el índice de un arreglo usaremos la estructura ForEach
        double[] notas = new double[4];
        System.out.println("Para calcular la nota media necesito saber\n la nota de cada examen");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Notas nº"+ (i + 1) +": ");
            notas[i] = Double.parseDouble(System.console().readLine());   
        }
        double suma = 0;

        for (double n : notas) {
            System.out.print(n +" ");
            suma = suma + n;
        }
        System.out.println("El promedio es: "+ suma/4);
    }
    //EJERCICIO 1: Realizar un programa que rellene un array de 6 filas por 10 columnas
    //con numeros enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
    //continuación, el programa deberá dar la posición tanto del maximo como del minimo.
}
