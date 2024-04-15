package FuncionesQueFuncionan;

import java.util.Arrays;
import java.util.Random;

public class Función4 {
    
    public static int[] generaArrayInt(int n, int min, int max) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static int minimoArrayInt(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int maximoArrayInt(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double mediaArrayInt(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static boolean estaEnArrayInt(int[] array, int numero) {
        for (int num : array) {
            if (num == numero) {
                return true;
            }
        }
        return false;
    }

    public static int posicionEnArray(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    public static void volteaArrayInt(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotaDerechaArrayInt(int[] array, int n) {
        n = n % array.length;
        if (n < 0) {
            n += array.length;
        }
        int[] temp = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            int newIndex = (i + n) % array.length;
            array[newIndex] = temp[i];
        }
    }

    public static void rotaIzquierdaArrayInt(int[] array, int n) {
        rotaDerechaArrayInt(array, -n);
    }

    public static void main(String[] args) {
        int[] array = generaArrayInt(10, 1, 100);
        System.out.println("Array generado: " + Arrays.toString(array));
        System.out.println("Mínimo: " + minimoArrayInt(array));
        System.out.println("Máximo: " + maximoArrayInt(array));
        System.out.println("Media: " + mediaArrayInt(array));
        int numBuscar = 50;
        System.out.println("¿El número " + numBuscar + " está en el array? " + estaEnArrayInt(array, numBuscar));
        int pos = 3;
        System.out.println("El número " + array[pos] + " está en la posición " + posicionEnArray(array, array[pos]));
        volteaArrayInt(array);
        System.out.println("Array volteado: " + Arrays.toString(array));
        rotaDerechaArrayInt(array, 2);
        System.out.println("Array rotado a la derecha: " + Arrays.toString(array));
        rotaIzquierdaArrayInt(array, 2);
        System.out.println("Array rotado a la izquierda: " + Arrays.toString(array));
    }
}

