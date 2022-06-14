package uri;

import java.util.Scanner;

public class URI1074 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int q = read.nextInt();
        int n[] = new int[q];
        
        
        for (int i = 0; i < q; i++) {
            n[i] = read.nextInt();
            
            if (n[i]%2 == 0 && n[i] > 0) {
                System.out.println("EVEN POSITIVE");
            } else if (n[i]%2 == 0 && n[i] < 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (n[i]%2 != 0 && n[i] > 0) {
                System.out.println("ODD POSITIVE");
            } else if (n[i]%2 != 0 && n[i] < 0) {
                System.out.println("ODD NEGATIVE");
            } else {
                System.out.println("NULL");
            }    
        }
        
        
    }
}
