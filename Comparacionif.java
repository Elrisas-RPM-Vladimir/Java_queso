public class Comparacionif {
    public static void main(String[] args) {
        /*
         * sentencia condicional, permitir al programa bifurcar
         * el flujo de la ejecución del programa pendiente
         * de una condicion (verdad o falso)
         * 
         * Sentencia if
         * 
         * if(condicion){
         *    instrucciones a ejecutar si la condicion es verdadera
         * }else{
         *    instrucciones a ejecutar si la condicion es falso
         * }
         * 
         */

         String miFruta = "naranja";

         if (miFruta == "naranja") {
            System.out.println("Que rica fruta, me la como!!!");
        }else{
                System.out.println(" No puedo comer esa fruta!!!");
         }

         //Programa que indique cual es la capital de Perú

         String capital = "Lima";
         if (capital == "Lima") {
            System.out.println("Es correcto, "+ capital +" es capital de Perú!!!");
         }else{
                System.out.println("No!!!, "+ capital +" no es capital del Perú!!!");
         }
    }
}
