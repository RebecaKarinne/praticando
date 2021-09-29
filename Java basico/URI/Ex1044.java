package URI;

import java.util.Scanner;

public class Ex1044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A%B == 0 || B%A == 0){
            System.out.println("São múltiplos.");
        } else if (A%B != 0 || B%A != 0){
            System.out.println("Não são múltiplos");
        }

    }
}
