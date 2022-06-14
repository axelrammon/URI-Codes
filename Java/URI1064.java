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
public class URI1064 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double n[] = new double[6];
        double y = 0;
        int popo = 0;
        
        for (int i = 0; i < 6; i++) {
            n[i] = read.nextDouble();
            
            if (n[i] > 0) {   
                y += n[i];
                popo += 1;
            }
        }
        
        double media = y / popo;

        System.out.println(popo + " valores positivos");
        System.out.printf("%.1f\n",media);
    }
}
