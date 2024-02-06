public class SentenciaSwitch {
    public static void main(String[] args) {
        /*
         * Sentencia Switch
         * 
         * A veces es necesario comparar el valor de una variable
         * con un conjunto de valores.
         *  
         *  Si variable vale valor1 entonces entra por case valor1:
         *  Si variable vale valor1 entonces entra por case valor2:
         *  ...
         *  default.
         * 
         *  switch (variable){
         *      case valor1:
         *          instruciones valor1;
         *          break;
         *      case valor2:
         *          instruciones valor2;
         *          break;
         *      .
         *      .
         *      .
         *      default:
         *          instrucciones default;
         *  }
         * 
         */
        int dia;
        String nombreDia;
        System.out.println("por favor, introduzca un numero de día entre 1 al 7: ");
        dia = Integer.parseInt(System.console().readLine());

        switch (dia) {
            case 1:
                nombreDia = "DOMINGO";
                break;

            case 2:
                nombreDia = "LUNES";
                break;

            case 3:
                nombreDia = "MARTES";
                break;

            case 4:
                nombreDia = "MIÉRCOLES";
                break;

            case 5:
                nombreDia = "JUEVES";
                break;

            case 6:
                nombreDia = "VIERNES";
                break;

            case 7:
                nombreDia = "SÁBADO";
                break;
        
            default:
                nombreDia = "no exíste ese día";
                break;
        }
        System.out.println("Día "+nombreDia);
    }
}
