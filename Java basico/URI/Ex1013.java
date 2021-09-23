package URI;

import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAB = (a+b+(a+b) * (a-b)) / 2;

        System.out.println(maiorAB + " é o maior.");

    }
}
