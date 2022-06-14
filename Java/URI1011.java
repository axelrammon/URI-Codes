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
public class URI1011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("Digite o valor do Raio");
        Scanner read = new Scanner(System.in);
        double raio = read.nextDouble();
        
        double volume = (4.0/3) * 3.14159 * (raio*raio*raio);
        
        System.out.printf("VOLUME = %.3f\n",volume);
        
        
    }
    
}
