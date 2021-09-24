package URI;

import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // A fórmula Math.abs calula o maior entre dois números

        int maiorAB = (a + b + Math.abs(a-b)) / 2;
        maiorAB = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorAB + " é o maior.");

    }
}
