package lacosWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WhileExercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        int ttMaiorQ50 = 0, ttMenorQ21 = 0;

        while (idade >= 0) {
            System.out.print("Digite uma idade: ");
            idade = sc.nextInt();
            if (idade >= 1 && idade < 21) {
                ttMenorQ21++;
            } else if (idade > 50) {
                ttMaiorQ50++;
            }
        }
        System.out.println("Total de pessoas menores de 21 anos: " + ttMenorQ21 + "\nTotal de pessoas maiores de 50 anos: " + ttMaiorQ50);




        sc.close();
    }

    public static void pesquisaConhecerColaboradores(Scanner sc) {
        char cont = 's';
        int idade, sex, categ, ttMulFront = 0, ttPessBack = 0, mobiMaiorQ40 = 0, ttMulDevFullMenD30 = 0;
        System.out.println("""
                Menu para pesquisa 
                Selecione as seguintes opções de sexo:
                1- Masculino
                2- Feminino
                3- Outros 
                Selecione as seguintes opções de categoria:
                1- Backend
                2- Frontend
                3- Mobile
                4- FullStack
                """);

        while (cont != 'n' && cont != 'N') {
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();
            System.out.print("Digite o Sexo: ");
            sex = sc.nextInt();
            System.out.print("Digite a Categoria: ");
            categ = sc.nextInt();

            if (categ == 1) ttPessBack++;
            else if (sex == 2 && categ == 2) ttMulFront++;
            else if (categ == 3 && sex == 1 && idade > 40) mobiMaiorQ40++;
            else if (sex == 2 && categ == 4 && idade < 30) ttMulDevFullMenD30++;

            System.out.print("Deseja continuar (S/N): ");
            cont = sc.next().charAt(0);
            sc.nextLine();

        }

        System.out.printf("""
                Total de pessoas desenvolvedores Backend: %d
                Total de mulheres desenvolvedoras Frontend: %d
                Total de homens desenvolvedores Mobile maiores de 40 anos: %d
                Totsl de mulheres desenvolvedoras FullStack menores de 30 anos: %d
                """,ttPessBack,ttMulFront,mobiMaiorQ40,ttMulDevFullMenD30);

    }
}
