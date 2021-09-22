package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();

        double areaTriangRet = (A*C)/2;
        double areaCirc = 3.14159 * (C*C);
        double areaTrap = ((A+B)*C)/2;
        double areaQuad = B*B;
        double areaRet = A*B;

        System.out.printf("TRIÂNGULO: %.3f %n", areaTriangRet);
        System.out.printf("CÍRCULO: %.3f %n", areaCirc);
        System.out.printf("TRAPÉZIO: %.3f %n", areaTrap);
        System.out.printf("QUADRADO: %.3f %n", areaQuad);
        System.out.printf("RETÂNGULO: %.3f", areaRet);

    }
}
