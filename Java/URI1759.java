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
public class URI1759 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double n = read.nextDouble();
        
        for (int i = 2; i <= n; i++) {
            System.out.print("Ho ");
            if (i == n) {
                System.out.println("Ho!");
            }
        }
        
    }
}
