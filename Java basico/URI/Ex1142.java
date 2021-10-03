package URI;

import java.util.Scanner;

public class Ex1142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = 1;
        int b = 2;
        int c = 3;

        for (int i = 0; i < N; i++) {
            System.out.println(a + " " + b + " " + c + " PUM");
            a = a + 4;
            b = b + 4;
            c = c + 4;
        }

        scanner.close();
    }
}
