package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();

        double media = ((A*2) + (B*3) + (C*5)) / 10;

        System.out.printf("MÉDIA = %.1f", media);

    }
}
