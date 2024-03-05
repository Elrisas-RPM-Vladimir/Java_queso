public class Array04 {
    public static void main(String[] args) {
        /*Vamos a crear un programa que genere 100 números aleatorios del 0 al 20, los 
        mostraremos en pantalla separados por espacios, el programa pedirá que ingrese dos 
        variables por teclado y a continuación el programa cambiara el primero por el segundo.
        *
        */
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()* 21);
            System.out.print(numeros[i]+ "-");
        }

        System.out.print("Ingrese un número de los que se a mostrado: ");
        int valor1 = Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese un valor para reemplazarlo: ");
        int valor2 = Integer.parseInt(System.console().readLine());

        String verde = "\033[32m";
        String blanco = "\033[37m";
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor1) {
                numeros[i] = valor2;
                System.out.print(verde + numeros[i]+ "-");
            } else {
                System.out.print(blanco + numeros[i]+ "-");
            }
        }
        //Realice ujn programa que genere 8 números aleatorios y que luego muestre esos números juntos
        //a la parabra par o impar segun corresponda.
    }
}
