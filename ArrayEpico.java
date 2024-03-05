public class ArrayEpico {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()* 9);
            System.out.print(numeros[i] +"-");
        }
        System.out.print("\033[35m Pares e impares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("\033[36m"+ numeros[i] +" par");
            } else {
                System.out.println("\033[91m"+ numeros[i] +" impar");   
            }
        }
    }
}
/*Escriba un programa que llene un array de 100 elementos con números enteros aleatorios entre 0 y 500
 * a continuación el programa mostrara el array y preguntara al usuario si quiere destacar el maximo 
 * o minimo, seguidamente se volvera a mostrar al array escribiendo el numero destacado entre dobles asteriscos
*/