package lacoDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, totalNumeros = 0, cont = 0;
        double media = 0;
        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            if (num % 3 == 0 && num != 0) {
                totalNumeros += num;
                cont++;
            }

        } while (num != 0);

        media = (double) totalNumeros / cont;
        System.out.println("A média de todos os números de 3 é: " + String.format("%.1f", media));


        sc.close();
    }

    public static void somadeNumerosPositivos(Scanner sc) {
        int num, totNumPosi = 0;

        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            if (num >= 0) totNumPosi += num;

        } while (num != 0);

        System.out.println("Soma dos números positivos é: " + totNumPosi);
    }


}
