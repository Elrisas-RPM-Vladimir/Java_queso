public class Array02 {
    public static void main(String[] args) {
        // Declaramos e indicamos los espacios que tendran
        // el arreglo
        int[] numeros = new int[15];
        // Llenamos el arreglo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*10);
        }
        // Mostramos los valores del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
