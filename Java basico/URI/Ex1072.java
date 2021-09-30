package URI;

import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int qtd = 0;

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            if (X >= 10 && X <= 20){
                qtd++;
            }
        }

        System.out.println(qtd + " in");

        int qtdOut = N - qtd;
        System.out.println(qtdOut + " out");

    }
}
