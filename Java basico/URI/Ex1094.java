package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int quantia = 0;
        int total = 0;
        int c = 0;
        int r = 0;
        int s = 0;

        for (int i = 0; i < N; i++){
            quantia = scanner.nextInt();
            char animal = scanner.next().charAt(0);
            total = total + quantia;
            if(animal == 'C')
                c = c + quantia;
             else if (animal == 'R')
                r += quantia;
             else if (animal == 'S')
                s = s + quantia;
        }

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);

        // Para mostrar a porcentagem correta, repeti o double
        double percentualCoelhos = ((double)c*100)/total;
        double percentualRatos = ((double)r*100)/total;
        double percentualSapos = ((double)s*100)/total;

        System.out.printf("Percentual de coelhos: %.2f%% %n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f%% %n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f%% %n", percentualSapos);
    }
}
