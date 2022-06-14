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
public class URI1010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int cod1 = read.nextInt();
        int totP1 = read.nextInt();
        double preco1 = read.nextDouble();
        int cod2 = read.nextInt();
        int totP2 = read.nextInt();
        double preco2 = read.nextDouble();
        
        double total1 = totP1 * preco1;
        double total2 = totP2 * preco2;
        double total = total1 + total2; 
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }
    
}
