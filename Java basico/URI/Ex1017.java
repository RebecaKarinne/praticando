package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int horas = scanner.nextInt();
        int velMedia = scanner.nextInt();

        double dist = horas * velMedia;
        double litros = dist / 12;

        System.out.printf("%.3f", litros);

    }
}
