/* Crie um programa em Java que leia o nome do aluno e suas 5 notas, e ao final, retorne sua nota média. */

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        String nome;
        double nota1, nota2, nota3, nota4, nota5;
       
        System.out.println("Digite seu nome:");
        nome= leitura.nextLine();

        System.out.println("Digite sua 1° nota:\n");
        nota1= leitura.nextDouble();

        System.out.println("Digite sua 1° nota:\n");
        nota2= leitura.nextDouble();

        System.out.println("Digite sua 1° nota:\n");
        nota3= leitura.nextDouble();

        System.out.println("Digite sua 1° nota:\n");
        nota4= leitura.nextDouble();

        System.out.println("Digite sua 1° nota:\n");
        nota5= leitura.nextDouble();

        double media = (nota1+nota2+nota3+nota4+nota5)/5;


        System.out.println("Sua média é:\n" + media);

        leitura.close();
    }
}
