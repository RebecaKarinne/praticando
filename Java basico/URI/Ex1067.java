package URI;

import java.util.Scanner;

public class Ex1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        if (X % 2 == 0) {
            for (int i = 1; i < X; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }

        if (X % 2 == 1) {
            for (int i = 1; i <= X; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
    }
}
