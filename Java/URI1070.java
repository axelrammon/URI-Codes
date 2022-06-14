package uri;

import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int X = read.nextInt();
        
        for (int i = 0; i < 11; i++) {
            X += 1;
            if (X%2 != 0) {
                System.out.println(X);
            }
        }
    }
}
