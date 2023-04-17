package lacoFor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int[] vet = new int[10];
            int ttPar = 0, ttImpar = 0;
            for (int i = 0; i < vet.length; i++) {
                System.out.print("Digite " + (i + 1) + "° número: ");
                vet[i] = sc.nextInt();
                if (vet[i] % 2 == 0) {
                    ttPar++;
                } else {
                    ttImpar++;
                }
            }
            System.out.println("\nTotal de números pares: " + ttPar + "\nTota impares: " + ttImpar);

        sc.close();
    }

    public static void intervaloEntreNumeros(Scanner sc) {
        int n1, n2;

        String result;
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        if (n1 > n2 && n2 < n1) {
            System.out.println("Intervalo Invalido");
        } else {
            System.out.println("No intervalo de " + n1 + " entre " + n2);
            for (int i = n1; i < n2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é multiplo de 3 e 5");
                }
            }
        }
    }

}