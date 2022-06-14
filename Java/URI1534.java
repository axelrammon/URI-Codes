package uri;

import java.util.Scanner;

public class URI1534 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int X = read.nextInt();
        
        if (N >= 3 && N < 70) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == j) {
                        System.out.print("1 ");
                    } else if(i + j == N - 1) {
                        System.out.print("2 ");
                    } else {
                        System.out.print("3 ");
                    }
                }
                System.out.println("");
            }
        }

        if (X >= 3 && X < 70) {
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < X; j++) {
                    if (i == j) {
                        System.out.print("1 ");
                    } else if(i + j == X - 1) {
                        System.out.print("2 ");
                    } else {
                        System.out.print("3 ");
                    }
                }
                System.out.println("");
            }
        }
         
            
    }
}
