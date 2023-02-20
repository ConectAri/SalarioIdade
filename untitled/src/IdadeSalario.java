/*...

Faça um programa que peça para o usuário digitar a idade,

o salário e o sexo de uma pessoa até que as entradas digitadas sejam válidas.

Idade: entre 0 e 150; Salário: maior que 0; Gênero: M, F ou Outro.

Por último imprima os dados recebidos do usuário.

..*/

import java.util.Scanner;

public class IdadeSalario {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade = 0;
        double salario = 0.0;
        String genero = "";

        do{
            System.out.println(" Informe sua idade:");
            idade = ler.nextInt();
            }while (idade < 0 || idade > 150);

        do{
            System.out.println(" Informe o salário:");
            salario = ler.nextInt();
        }while (salario <=0);


        do{
            System.out.println("Informe o gênero (M/F/Outro):");
            genero = ler.next();
        }while (!genero.equalsIgnoreCase("M")&&
                !genero.equalsIgnoreCase("F")&&
        !genero.equalsIgnoreCase("Outro"));

        System.out.println(" =================================");
        System.out.println(" ======Impressão de dados: ========");
        System.out.println(" Idade:" + idade);
        System.out.println(" Salário:" + salario);
        System.out.println(" Gênero:" + genero);
        System.out.println(" =================================");

    }

}

