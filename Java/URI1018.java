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
public class URI1018 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        
        int cem = N / 100;
        int r100 = N%100;
        
        int onca = r100 / 50;
        int r50 = r100 % 50;  
        
        int vinte = r50 / 20;
        int r20 = r50 % 20;
        
        int dez = r20 / 10;
        int r10 = r20 % 10;
        
        int cinco = r10 / 5;
        int r5 = r10 % 5;
        
        int dois = r5 / 2;
        int r2 = r5 % 2;
        
        int um = r2 / 1;
        int r1 = r2 % 1;
        
        System.out.println(N);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(onca + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
    }
}
