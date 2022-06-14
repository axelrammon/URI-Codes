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
public class URI1017 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        int v = read.nextInt();
        
        double s = v * t;
        
        double litros = s / 12;  
        
        System.out.printf("%.3f\n", litros);
    
    }
}
