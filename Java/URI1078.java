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
public class URI1078 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        
        for (int i = 1; i < 11; i++) {
            int calculo = N * i;
            System.out.println(i + " x " + N + " = " + calculo);
        }
        
        
    }
}
