package uri;

import java.util.Arrays;
import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) {
        int numbers[] = new int[2];
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        int m = 0;
        
        Arrays.sort(numbers, 0, 2);
        
        System.out.println("Sub Array Classificado em Java: ");
        
        for (int num : numbers) {
            System.out.println(num);
        }
        
        
    }
}
