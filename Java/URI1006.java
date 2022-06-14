/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;

/**
 *
 * @author Axl Rammon
 */
public class URI1006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float A;
        float B;
        float C;
        
        A = read.nextFloat();
        B = read.nextFloat();
        C = read.nextFloat();
        
        System.out.printf("MEDIA = %.1f\n", ((A*2)+(B*3)+(C*5))/10);
        
        
    }
    
}
