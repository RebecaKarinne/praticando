package URI;

import java.util.Scanner;

public class Ex1144 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = 1;
        int a1 = 1;
        int b, c, b1, c1;

        for (int i = 0; i < N; i++){
            b = a*a;
            c = a*b;
            b1 = b+1;
            c1 = c+1;
            System.out.println(a + " " + b + " " + c);
            System.out.println(a1 + " " + b1 + " " + c1);
            a++;
            a1++;
        }

    }
}
