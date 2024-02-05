public class CursosDelDia01 {
    public static void main(String[] args) {
                // Establecer códigos ANSI para colores
                String reset = "\u001B[0m";
                String cyan = "\u001B[36m";
                String yellow = "\u001B[33m";
                String magenta = "\u001B[35m";
                String green = "\u001B[32m";
                String red = "\u001B[31m";
        
                System.out.println("┌──────────────────────┬─────────────────────┬──────────────────────┬──────────────────────┬──────────────────────┐");
                System.out.println("│          Lunes       │         Martes      │       Miércoles      │         Jueves       │         Viernes      │");
                System.out.println("├──────────────────────┼─────────────────────┼──────────────────────┼──────────────────────┼──────────────────────┤");
                System.out.println("│ " + cyan + "Algorit. y Program 1" + reset + " │ " + cyan + "Algorit y Program 1" + reset + " │    " + yellow + "Ing. Sistemas" + reset + "     │    " + yellow + "Ing. Sistemas" + reset + "     │     " + magenta + "Estadística" + reset + "      │");
                System.out.println("├──────────────────────┼─────────────────────┼──────────────────────┼──────────────────────┼──────────────────────┤");
                System.out.println("│       " + red + "Economía" + reset + "       │      " + green + "Cálculo 1" + reset + "      │     " + magenta + "Estadística" + reset + "      │                      │      " + red + "Cálculo 1" + reset + "       │");
                System.out.println("├──────────────────────┼─────────────────────┼──────────────────────┼──────────────────────┼──────────────────────┤");
                System.out.println("│ " + yellow + "Matemática Discreta" + reset + "  │ " + yellow + "Matemática Discreta" + reset + " │      " + red + "Economía" + reset + "        │                      │                      │");
                System.out.println("│                      │                     │                      │                      │                      │");
                System.out.println("└──────────────────────┴─────────────────────┴──────────────────────┴──────────────────────┴──────────────────────┘");
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
        String cursosDia;
        System.out.println("por favor, introduzca un número de día entre 1 al 7: ");
        dia = Integer.parseInt(System.console().readLine());

        switch (dia) {
            case 1:
                cursosDia = "Lunes";
                System.out.println("Día: "+ cursosDia);
                System.out.println("los cursos de hoy son: "+ cyan +", Algorit. y Program 1"+ red +", Economía"+ "\033[37m y"+ yellow +" Matemática Discreta");
                break;

            case 2:
                cursosDia = "Martes";
                System.out.println("Día: "+ cursosDia);
                System.out.println("los cursos de hoy son: "+ cyan +", Algorit. y Program 1"+ green +", Cálculo 1"+ "\033[37m y"+ yellow +" Matemática Discreta");
                break;

            case 3:
                cursosDia = "Miércoles";
                System.out.println("Día: "+ cursosDia);
                System.out.println("los cursos de hoy son: "+ yellow +", Ing. sistemas"+ magenta +", Estadística"+ "\033[37m y"+ red +" Economía");
                break;

            case 4:
                cursosDia = "Jueves";
                System.out.println("Día: "+ cursosDia);
                System.out.println("los cursos de hoy son: " + "\033[37m solo"+ yellow +" Ing. Sistemas");
                break;

            case 5:
                cursosDia = "Viernes";
                System.out.println("Día: "+ cursosDia);
                System.out.println("los cursos de hoy son: "+ magenta +", Estadística"+ "\033[37m y"+ red +" Cálculo 1");
                break;

            case 6:
                cursosDia = "Sábado";
                System.out.println("Día: "+ cursosDia);
                System.out.println("las actividades de hoy son: "+ cyan +", Descanzar"+ red +", hacer tarea"+ "\033[37m y"+ yellow +" terminar labores");
                break;

            case 7:
                cursosDia = "Domingo";
                System.out.println("Día: "+ cursosDia);
                System.out.println("las actividades de hoy son: "+ cyan +", Fastidiar a alguien"+ red +", Hacer tarea"+ "\033[37m y"+ yellow +" película, serie o algo.");
                break;
        
            default:
                cursosDia = "no exíste ese día";
                break;
        }
    }
}
