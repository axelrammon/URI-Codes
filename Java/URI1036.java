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
public class URI1036 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double A = read.nextDouble();
        double B = read.nextDouble();
        double C = read.nextDouble();
        
        double r = ((B*B)-(4*A*C));
        
        double R1 = ((-B + Math.sqrt(r))/(2*A));
        double R2 = ((-B - Math.sqrt(r))/(2*A));
        
        if (A == 0 || r < 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
        
        
    }
}
