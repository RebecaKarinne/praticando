package URI;

import java.util.Scanner;

public class Ex1113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        while (X != Y) {
            if (X > Y){
                System.out.println("Decrescente");
            } else if (X < Y) {
                System.out.println("Crescente");
            }

            X = scanner.nextInt();
            Y = scanner.nextInt();
        }
    }
}
