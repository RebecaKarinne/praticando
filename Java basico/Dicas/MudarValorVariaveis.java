package Dicas;

public class MudarValorVariaveis {
    public static void main(String[] args) {
        // Como trocar o valor entre duas variáveis
        // 1. Sem variável auxiliar:

        int A = 10;
        int B = 5;

        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println(A);
        System.out.println(B);

        // 2. Com variável auxiliar

        int C = 10;
        int D = 5;
        int AUX;

        AUX = D;
        D = C;
        C = AUX;

        System.out.println(C);
        System.out.println(D);

    }
}
