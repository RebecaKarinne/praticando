package URI;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int soma = 0;

        if (X - Y > 0) {
            for (int i = Y; i <= X; i++) {
                if (i % 13 != 0) {
                    soma = soma + i;
                }
            }
        } else if (Y - X > 0) {
            for (int i = X; i <= Y; i++) {
                if (i % 13 != 0) {
                    soma = soma + i;
                }
            }
        }
        System.out.println(soma);
    }
}
