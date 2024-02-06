public class MenuSwitch {
    public static void main(String[] args) {
        /*
         * Programa que muestra el menu de calculo de switch
         * 
         */
        System.out.println("Cálculo de área");
        System.out.println("_________________________");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Rectángulo");
        System.out.println("3.- Triángulo");
        System.out.print("\nElija una opción (1-3): ");

        int opcion = Integer.parseInt(System.console().readLine());

        Double lado, base, altura;

        switch (opcion) {
            case 1:
            System.out.println("\nIntroduzca el lado del cuadrado: ");
            lado = Double.parseDouble(System.console().readLine());
            System.out.println("\nEl área del cuadrado es "+(lado*lado)+" u2");
                break;

            case 2:
                System.out.println("\nIntrodusca el lado del rectángulo: ");
                base = Double.parseDouble(System.console().readLine());
                System.out.println("\nIntrudusca la altura del rectángulo: ");
                altura = Double.parseDouble(System.console().readLine());
                System.out.println("\nEl área del rectángulo es "+ (base*altura) +" u2");
                break;

            case 3:
                System.out.println("\nIntrudusca la base del triángulo: ");
                base = Double.parseDouble(System.console().readLine());
                System.out.println("\nIntrodusca la altura del triángulo: ");
                altura = Double.parseDouble(System.console().readLine());
                System.out.println("\nEl área del triángulo es "+ (base*altura)/2 +" u2");

            default:
                System.out.println("\nLa opciòn no es correcta: ");
                break;
        }
    }
}
