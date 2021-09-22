package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio.");
        float raio = scanner.nextFloat();

        double area = 3.14159 * (raio * raio);

        System.out.printf("A = %.4f ", area);

    }
}
