package URI;

import java.util.Scanner;

public class Ex1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();

        int duracaoHoras = (horaFinal - horaInicial);
        int duracaoMinutos = (minutoFinal - minutoInicial);

        if (duracaoHoras <= 0) {
            duracaoHoras = duracaoHoras + 24;
        }

        if (duracaoMinutos < 0) {
            duracaoHoras --;
            duracaoMinutos = duracaoMinutos + 60;
        }

        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S).");

    }
}
