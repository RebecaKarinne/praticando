package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        float R = scanner.nextFloat();
        double volume = (4/3.0) * pi * (R*R*R);

        System.out.printf("VOLUME = %.3f", volume);

    }
}
