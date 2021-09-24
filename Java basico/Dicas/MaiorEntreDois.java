package Dicas;

public class MaiorEntreDois {
    public static void main(String[] args) {
        // Fóruma para ver maior entre 2 números

        int a = 3;
        int b = 9;
        int c = 6;

        // A fórmula Math.abs calula o maior entre dois números

        int maiorAB = (a + b + Math.abs(a-b)) / 2;

        // Repete a fórmula, caso tenha um terceiro número ou mais
        maiorAB = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorAB + " é o maior.");

    }
}
