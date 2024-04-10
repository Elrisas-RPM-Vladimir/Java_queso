package FuncionesQueFuncionan;

public class Función1 {
    public static boolean esCapicua(int numero) {
        return numero == voltea(numero);
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int siguientePrimo(int numero) {
        int siguiente = numero + 1;
        while (!esPrimo(siguiente)) {
            siguiente++;
        }
        return siguiente;
    }
    public static int potencia(int base, int exponente) {
        return (int) Math.pow(base, exponente);
    }
    public static int digitos(int numero) {
        return String.valueOf(numero).length();
    }
    public static int voltea(int numero) {
        int resultado = 0;
        while (numero > 0) {
            resultado = resultado * 10 + (numero % 10);
            numero /= 10;
        }
        return resultado;
    }
    

    public static int digitoN(int numero, int posicion) {
        return Integer.parseInt(String.valueOf(numero).substring(posicion, posicion + 1));
    }
    public static int posicionDeDigito(int numero, int digito) {
        return String.valueOf(numero).indexOf(String.valueOf(digito));
    }
    public static int quitaPorDetras(int numero, int n) {
        return numero / (int) Math.pow(10, n);
    }
    public static int quitaPorDelante(int numero, int n) {
        return Integer.parseInt(String.valueOf(numero).substring(n));
    }
    public static int pegaPorDetras(int numero, int digito) {
        return numero * 10 + digito;
    }
    public static int pegaPorDelante(int numero, int digito) {
        return Integer.parseInt(digito + String.valueOf(numero));
    }
    public static int trozoDeNumero(int numero, int inicio, int fin) {
        String subcadena = String.valueOf(numero).substring(inicio, fin + 1);
        return Integer.parseInt(subcadena);
    }
    public static int juntaNumeros(int numero1, int numero2) {
        return Integer.parseInt(String.valueOf(numero1) + String.valueOf(numero2));
    }

    public static void main(String[] args) {

        int numero = 12321;
        System.out.println("¿Es capicúa? " + esCapicua(numero));

        int primo = 17;
        System.out.println("¿Es primo? " + esPrimo(primo));

        int siguiente = 20;
        System.out.println("Siguiente primo mayor que " + siguiente + ": " + siguientePrimo(siguiente));

        int base = 2;
        int exponente = 3;
        System.out.println("Potencia: " + potencia(base, exponente));

        int numdigitos = 12345;
        System.out.println("Número de dígitos: " + digitos(numdigitos));

        int volteado = 54321;
        System.out.println("Número volteado: " + voltea(volteado));

        int digito = 12345;
        int posicion = 2;
        System.out.println("Dígito en posición " + posicion + ": " + digitoN(digito, posicion));

        int numposicion = 12345;
        int dig = 3;
        System.out.println("Posición del dígito " + dig + ": " + posicionDeDigito(numposicion, dig));

        int quitadetras = 123456;
        int n = 2;
        System.out.println("Quita por detrás: " + quitaPorDetras(quitadetras, n));

        int quitadelante = 123456;
        int m = 2;
        System.out.println("Quita por delante: " + quitaPorDelante(quitadelante, m));

        int pegadetras = 123;
        int digitodetras = 4;
        System.out.println("Pega por detrás: " + pegaPorDetras(pegadetras, digitodetras));

        int pegadelante = 456;
        int digitodelante = 1;
        System.out.println("Pega por delante: " + pegaPorDelante(pegadelante, digitodelante));

        int trozo = 123456;
        int ini = 1;
        int fin = 4;
        System.out.println("Trozo de número: " + trozoDeNumero(trozo, ini, fin));

        int numero1 = 123;
        int numero2 = 456;
        System.out.println("Número combinado: " + juntaNumeros(numero1, numero2));
    }
}
