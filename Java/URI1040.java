package uri;

import java.util.Scanner;

public class URI1040 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float N1 = read.nextFloat();
        float N2 = read.nextFloat();
        float N3 = read.nextFloat();
        float N4 = read.nextFloat();
    
        float media = ((N1*2)+(N2*3)+(N3*4)+(N4*1))/10;
        
        if (media >= 7) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        } else if (media >= 5 && media < 7) {
            float exame = read.nextFloat();
            float mf = (exame + media)/2;
            if (mf >=5) {
                System.out.printf("Media: %.1f\n", media);
                System.out.println("Aluno em exame.");
                System.out.printf("Nota do exame: %.1f\n", exame);
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", mf);
            } else {
                System.out.printf("Media: %.1f\n", media);
                System.out.println("Aluno em exame.");
                System.out.printf("Nota do exame: %.1f\n", exame);
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", mf);                
            }
            
        }
    }
}
