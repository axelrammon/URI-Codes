package uri;

import java.util.Scanner;

public class URI1066 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n[] = new int[5];
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        
        for (int i = 0; i < 5; i++) {
            n[i] = read.nextInt();
            
            if (n[i]%2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
            
            if (n[i] > 0) {
                positivo += 1;
            } else if (n[i] < 0) {
                negativo += 1;
            }
        }
        
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");

    }
}
