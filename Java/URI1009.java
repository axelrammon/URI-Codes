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
public class URI1009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner read = new Scanner(System.in);
        String name = read.next();
        double sf = read.nextDouble();
        double ve = read.nextDouble();
        
        ve *= 0.15; 
        
        
        double total = sf + ve;
        
        System.out.printf("TOTAL = R$ %.2f\n",total);
        
        
        
    }
    
}
