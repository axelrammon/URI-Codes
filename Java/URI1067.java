package uri;
import java.util.Scanner;

public class URI1067 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int X = read.nextInt();
        
        for (int i = 0; i <= X; i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
        
        
    }
}
