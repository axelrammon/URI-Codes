package uri;

import java.util.Scanner;

public class URI1079 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        float n[] = new float[3];
        float m[] = new float[3];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                n[i] = read.nextFloat();
            }
        }
        
    }
}
