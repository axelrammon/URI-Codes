package uri;

import java.util.Scanner;

public class URI1151 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int n1 = 0;
        int n2 = 1;
            
        
        for (int i = 0; i < N; i++) {
            n1 += i;
            n2 = n1;
            System.out.println(n1);
        
}        
        
    }
}
