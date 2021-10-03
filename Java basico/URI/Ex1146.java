package URI;

import java.util.Scanner;

public class Ex1146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        for (int i = 1; i <= X; i++) {
            System.out.print(i + " ");
            while (X != 0) {
                System.out.println();
                X = scanner.nextInt();
            }
        }
    }
}
