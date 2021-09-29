package URI;

import java.util.Locale;
import java.util.Scanner;

public class Ex1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double L1 = scanner.nextFloat();
        double L2 = scanner.nextFloat();
        double L3 = scanner.nextFloat();
        double A = 0;
        double B = 0;
        double C = 0;

        // FORMA MAIS TRABALHOSA DE ORDENAR EM ORDEM DECRESCENTE
        // OU ACHAR O VALOR MAIOR ENTRE NÚMEROS

        /*
        if (L1 > L2 && L1 > L3){
            A = L1;
            if (L2 > L3){
                B = L2;
                C = L3;
            } else if (L3 > L2){
                B = L3;
                C = L2;
            }
        } else if (L2 > L1 && L2 > L3){
            A = L2;
            if (L1 > L3){
                B = L1 ;
                C = L3;
            } else if (L3 > L1){
                B = L3;
                C = L1;
            }
        } else if (L3 > L1 && L3 > L2){
            A = L3;
            if (L2 > L1){
                B = L2;
                C = L1;
            } else if (L1 > L2){
                B = L1;
                C = L2;
            }
        }
        */

        // FORMA MAIS SIMPLES DE ORDENAR EM ORDEM DECRESCENTE
        // OU ACHAR O VALOR MAIOR ENTRE NÚMEROS

        double aux = Math.max(L1, L2);
        A = Math.max(aux, L3);

        aux = Math.min(L1, L2);
        C = Math.min(aux, L3);

        if (A == L1 && C == L3){
            B = L2;
        } else if (A == L1 && C == L2){
            B = L3;
        } else if (A == L2 && C == L1){
            B = L3;
        } else if (A == L2 && C == L3){
            B = L1;
        } else if (A == L3 && C == L1){
            B = L2;
        } else if (A == L3 && C == L2){
            B = L1;
        }

        if (A >= B+C) {
            System.out.println("NÃO FORMA TRIÂNGULO.");
        } else if (A*A > B*B + C*C){
            System.out.println("TRIÂNGULO OBTUSÂNGULO.");
        } if (A*A == B*B + C*C){
            System.out.println("TRIÂNGULO RETÂNGULO.");
        } if (A*A < B*B + C*C){
            System.out.println("TRIÂNGULO ACUTÂNGULO.");
        } if (A == B && A == C && B == C){
            System.out.println("TRIÂNGULO EQUILÁTERO.");
        } if (A == B && A != C || A == C && A != B || B == C && B != A){
            System.out.println("TRIÂNGULO ISÓSCELES.");
        }

    }
}
