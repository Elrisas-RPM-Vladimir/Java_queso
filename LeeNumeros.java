public  class LeeNumeros{
    public static void main(String[] args) {
        String linea;

        System.out.println("Ingresa un número: ");
        linea = System.console().readLine();
        // (double) linea;
        int primerNumero = Integer.parseInt(linea);
        //double numeroDecimal = Double.parseDouble(linea);

        System.out.println("Ingresa un número: ");
        linea = System.console().readLine();
        int segundoNumero = Integer.parseInt(linea);

        int suma = primerNumero + segundoNumero;
        System.out.println("La suma es: "+ suma);
    }
}
