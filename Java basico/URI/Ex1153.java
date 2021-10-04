package URI;

import java.util.Scanner;

public class Ex1153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = N - 1; i > 0; i--) {
            N = N * i;
        }
        System.out.println(N);

        scanner.close();
    }
}
