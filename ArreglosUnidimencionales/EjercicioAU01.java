package ArreglosUnidimencionales;

import java.util.Random;

public class EjercicioAU01 {
    public static void main(String[] args) {
        int[] num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        Random r = new Random();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                num[i] = r.nextInt(121);
            } 
        System.out.println("\033[92m ["+ i +"]" + num[i]);
        }
        
    }    
}
