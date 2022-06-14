package uri;

import java.util.Scanner;

public class URI1005 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float A;
        float B;
        
        A = read.nextFloat();
        B = read.nextFloat();
        
        System.out.printf("MEDIA = %.5f\n", ((A*3.5)+(B*7.5))/11);
        
        
        
    }
    
}
