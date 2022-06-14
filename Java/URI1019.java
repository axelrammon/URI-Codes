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
public class URI1019 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        
        int hora = N / 3600;
        int rH = N % 3600;
        
        int minutos = rH / 60;
        int rM = rH % 60;
        
        int segundos = N - (minutos*60);
        
        System.out.println(hora + ":" + minutos + ":" + rM);
    }
}
