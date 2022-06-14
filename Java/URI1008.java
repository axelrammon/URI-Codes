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
public class URI1008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        
        int n = read.nextInt();
        int ht = read.nextInt();
        double salario = read.nextFloat();
        
        double salariofinal = (ht*salario);
                
        System.out.println("NUMBER = " + n);
        System.out.printf("SALARY = U$ %.2f\n", salariofinal);
        
    }
    
}
