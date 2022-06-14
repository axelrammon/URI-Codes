package uri;

import java.util.Scanner;

/**
 *
 * @author Axl Rammon
 */
public class URI1020 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int dias = read.nextInt();
        
        int ano = dias / 365;
        int r = dias - (365*ano);
        int mes = r / 30;
        int d = dias - ((mes*30)+(ano*365));
        
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(d + " dia(s)");
        
    }
}
