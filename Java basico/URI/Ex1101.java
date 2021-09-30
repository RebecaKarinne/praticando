package URI;

import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        while (M > 0 && N > 0){
            int maior = Math.max(M, N);
            int menor = Math.min(M, N);
            int soma = 0;
            for (int i = menor; i <= maior; i++){
                soma = soma + i;
                System.out.print(i + " ");
            }

            System.out.println("Sum = " + soma);
            M = scanner.nextInt();
            N = scanner.nextInt();
        }
        scanner.close();
    }
}
