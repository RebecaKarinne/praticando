package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double delta, R1, R2;

        delta = (B*B) - 4*A*C;
        if (delta <= 0){
            System.out.println("Impossível calcular.");
        } else if (A == 0) {
            System.out.println("Impossível calcular.");
        } else {
            R1 = (-B + Math.sqrt(delta)) / (2 * A);
            R2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f %n", R1);
            System.out.printf("R2 = %.5f", R2);
        }

    }
}
