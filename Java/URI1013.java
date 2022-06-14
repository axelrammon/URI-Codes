package uri;

import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int maior = 0;
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        
        
        if (a > b && a > c) {
            maior = a;
        } 
        
        else if (b > a && b > c) {
            maior = b;
        }
        
        else {
            maior = c;
        }
        
        System.out.println(maior + " eh o maior");
        
    }
}
