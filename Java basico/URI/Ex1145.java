package URI;

import java.util.Scanner;

public class Ex1145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int sequencia = 0;

        for (int i = 1; i <= Y; i++) {
            System.out.print(i);
            if (i % X == 0) {
                System.out.println("");
            } else {
                System.out.print(" ");
            }
        }
    }
}
