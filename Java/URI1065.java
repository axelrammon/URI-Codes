package uri;

import java.util.Scanner;

public class URI1065 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n[] = new int[5];
        int par = 0;
        
        for (int i = 0; i < 5; i++) {
            n[i] = read.nextInt();
            if (n[i]%2 == 0) {
                par += 1;
            }
        }
        
        System.out.println(par + " valores pares");
        
    }
}
