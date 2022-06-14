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
public class URI1012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        double A = read.nextDouble();
        double B = read.nextDouble();
        double C = read.nextDouble();
        
        double tri = (A*C)/2; 
        double c = 3.14159 * (C * C);
        double tra = ((A+B)*C)/2;
        double q = B * B;
        double r = A * B;
        
        System.out.printf("TRIANGULO: %.3f\n",tri);
        System.out.printf("CIRCULO: %.3f\n",c);
        System.out.printf("TRAPEZIO: %.3f\n",tra);
        System.out.printf("QUADRADO: %.3f\n",q);
        System.out.printf("RETANGULO: %.3f\n",r);
    
    }
    
}
