public class Array4 {
    public static void main(String[] args) {
        /*Vamos a crear un programa que genere 100 numeros aleatorios del 0 al 20, los
        mostraremos en pantalla separados por espacios, el programa pedirá que ingrese dos valores
        por teclado y a continuacion el programa cambiara el primer por el segundo.
         * 
         */
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 21);
            System.out.print(numeros[i]+ "-");
        }

        System.out.print("\nIngrese un número de los que se han mostrado: ");
        int valor1 = Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese un valor para reemplazarlo: ");
        int valor2 = Integer.parseInt(System.console().readLine());

        String verde = "\033[32m";
        String blanco = "\033[37m";

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor1) {
                numeros[i] = valor2;
                System.out.print(
                     + numeros[i]+"-");
            }
            else{
                System.out.print(blanco + numeros[i]+"-");
            }
        }
        //REALICE UN PROGRAMA QUE GENERE 8 NUMEROS ENTEROS ALEATORIOS Y QUE LUEGO MUESTRE ESOS NUMEROS JUNTO
        //A LA PALABRA PAR O IMPAR SEGUN CORRESPONDA.
    }
}
