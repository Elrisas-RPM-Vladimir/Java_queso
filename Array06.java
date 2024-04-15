import java.util.Arrays;
public class Array06 {
    /*Realizar un programa que sea capaz de ordenar un array de una 
    dimención, que contenga 20 numeros enteros aleatorios entre 0 y 200 
    */
    public static void main(String[] args) {
        int[] numeros = new int[20];
        //llenamos el arreglo
        {System.out.println("20 números aleatorios entre 0 y 200");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*201);
        }
        }
        //Mostrar los valores del arreglo
        System.out.println("\nArray no ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] +"\t");
        }
        //Ordenamiento
        System.out.println("\nArray ordenado:");
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] +"\t");
        }
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
            } else {
                if (numeros[i] > menor) {
                    menor = menor;
                }
            }
        }

    }
}

