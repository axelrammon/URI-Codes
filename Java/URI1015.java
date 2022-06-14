package uri;

import java.util.Scanner;

/**
 *
 * @author Axl Rammon
 */
public class URI1015 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double x1 = read.nextDouble();
        double y1 = read.nextDouble();
        double x2 = read.nextDouble();
        double y2 = read.nextDouble();
        
        double c = (((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
        
        c = Math.sqrt(c);
        
        System.out.printf("%.4f\n", c);
    }
}
