package URI;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();


        int duracao1 = 24 - horaInicial;
        int duracaoTotal = duracao1 + horaFinal;

        if (duracaoTotal > 24){
            duracaoTotal = horaFinal - horaInicial;
        }

        System.out.println("O JOGO DUROU " + duracaoTotal + " HORA(S).");

    }
}
