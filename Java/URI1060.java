package uri;

import java.util.Scanner;

/**
 *
 * @author Axl Rammon
 */
public class URI1060 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double n[] = new double[6];
        int popo = 0;
        
        for (int i = 0; i < 6; i++) {
            n[i] = read.nextDouble();
            
            if (n[i] > 0) {   
                popo += 1;
            }
        }
        
        System.out.println(popo + " valores positivos");

    }
}
