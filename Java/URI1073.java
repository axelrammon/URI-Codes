package uri;

import java.util.Scanner;

public class URI1073 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();

        if (N > 5 && N < 2000) {
            for (int i = N; i > 1; i--) {
                N -= 1;
                if (N%2 == 0) {
                    System.out.println(N);
                }
            }
        }

        
        
    }
}
