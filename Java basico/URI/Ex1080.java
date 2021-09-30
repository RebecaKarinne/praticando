package URI;

import java.util.Scanner;

public class Ex1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;

        for (int i = 1; i < 5; i++){
            int num = scanner.nextInt();
            if (num > maior){
                maior = num;
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

    }
}
