public class Funciones1 {
    public static void main(String[] args) {
        /*Funciones: una porción de código que realiza una
         * tarea específica.
         */
        System.out.println("Ingrese un número positivo: ");
        int n = Integer.parseInt(System.console().readLine());
        boolean esPrimo = (n % 2 == 0);
        switch (esPrimo ? 1 : 0) {
            case 1:
            System.out.println("El "+ n +" no es primo!!"); 
                break;

            default:
            System.out.println("El "+ n +" es primo!!");
                break;
        }

        if (esCapicua(n)) {
            System.out.println(n + " es capicúa.");
        } else {
            System.out.println(n + " no es capicúa.");
        }
        }

        public static boolean esCapicua(int n) {
            int numeroReverso = 0;
            int numeroOriginal = n;
    
            while (n > 0) {
                int digito = n % 10;
                numeroReverso = numeroReverso * 10 + digito;
                n /= 10;
            }
    
            return numeroOriginal == numeroReverso;
    }
    //Funcion que devuelva el siguiente número primo, del número que pasa
}
