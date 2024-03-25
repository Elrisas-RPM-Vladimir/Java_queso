public class Seleccionselection {
    public static void main(String[] args) {
             
        int prueba[] = new int[]{8,2,3,5,0,1,9,12};

        for(int dato:prueba){
            System.out.print(dato+",");
        }
        
        for(int contadorOrdenar = 0;contadorOrdenar < prueba . length -1; contadorOrdenar++){
            int valorMinimo = contadorOrdenar;
            for(int contadorComparar = contadorOrdenar+1; contadorComparar < prueba.length; contadorComparar++){
                if(prueba[contadorComparar] < prueba[valorMinimo]){
                    valorMinimo = contadorComparar;
                }
            }
            int auxiliar = prueba[contadorOrdenar];
            prueba[contadorOrdenar] = prueba[valorMinimo];
            prueba[valorMinimo]=auxiliar;
        }

    System.out.println("");
        for(int dato:prueba){
            System.out.print(dato +",");
        }
    }
    
}