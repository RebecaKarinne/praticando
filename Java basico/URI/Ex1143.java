package URI;

import java.util.Scanner;

public class Ex1143 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = 1;
        int b, c;

        for (int i = 0; i < N; i++) {
            b = a*a;
            c = b*a;
            System.out.println(a + " " + b + " " + c);
            a++;
        }

    }
}
