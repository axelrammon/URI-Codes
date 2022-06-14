package uri;

import java.util.Scanner;

public class URI1041 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double x = read.nextFloat();
        double y = read.nextFloat();
        
        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else {
            System.out.println("Origem");
        }
        
    }
}
