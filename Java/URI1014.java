package uri;

import java.util.Scanner;

/**
 *
 * @author Axl Rammon
 */
public class URI1014 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int X = read.nextInt();
        double Y = read.nextFloat();
    
        double consumo = X / Y;
        
        System.out.printf("%.3f km/l\n",consumo);
        
    }
}
