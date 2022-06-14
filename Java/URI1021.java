package uri;

import java.util.Scanner;

public class URI1021 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float N = read.nextFloat();
        
        // ############### NOTAS ############### //
        
        int cem = (int) (N / 100);
        int r100 = (int) (N % 100);
        
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
        
        // ############### MOEDAS ############### //
        
        float um = r2 / 1;
        float r1 = r2 % 1;
        
        
        
        System.out.println((float) cem + " nota(s) de R$ 100.00");
        System.out.println((float) onca + " nota(s) de R$ 50.00");
        System.out.println((float) vinte + " nota(s) de R$ 20.00");
        System.out.println((float) dez + " nota(s) de R$ 10.00");
        System.out.println((float) cinco + " nota(s) de R$ 5.00");
        System.out.println((float) dois + " nota(s) de R$ 2.00");
        System.out.println((float) um + " moeda(s) de R$ 1.00");
        //System.out.println(c50 + " moeda(s) de R$ 0.50");
        //System.out.println( + " moeda(s) de R$ 0.25");
        System.out.println(r1);
    
    }
}
