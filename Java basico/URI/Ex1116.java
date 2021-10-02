package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            if (Y != 0) {
                double divisao = ((double) X / Y);
                System.out.printf("%.1f %n", divisao);
            } else {
                System.out.println("Divisão impossível.");
            }
        }

    }
}
