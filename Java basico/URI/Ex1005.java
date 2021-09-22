package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();

        double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

        System.out.printf("MÉDIA = %.5f", media);

    }
}
