package URI;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        double mediaPonderada = 0;

        for (int i = 0; i < N; i++){
            double A = scanner.nextDouble();
            double B = scanner.nextDouble();
            double C = scanner.nextDouble();
            mediaPonderada = (A*2 + B*3 + C*5)/(2+3+5);
            System.out.printf("%.1f", mediaPonderada);
        }
    }
}
