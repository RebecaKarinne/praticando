package URI;

import java.util.Scanner;

public class Ex1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++){
            int X = scanner.nextInt();
            if (X == 0){
                System.out.println("NULL");
            } else if (X%2 == 0){
                System.out.printf("EVEN ");
            } else if (X%2 == 1 || X%2 == -1) {
                System.out.printf("ODD ");
            }

            if (X > 0){
                System.out.println("POSITIVE");
            } else if (X < 0) {
                System.out.println("NEGATIVE");
            }
        }
    }
}
