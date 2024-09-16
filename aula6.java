/* Jogo*/
import java.util.Scanner;
import java.util.Random;

public class aula6 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        Random aleatorio = new Random ();
        final int sorteio = aleatorio.nextInt (1,6);
        System.out.println ("""
                Bem vindo (a)
                Esse Jogo é exclusivo para usuários prêmios
                Você tem 3 tentativas
                """);


        /* Introduzir Dados */

        System.out.println ("Digite um numero:");
        int numero = leitura.nextInt();
        int pontuacao= 30;

        /*Condição de Se */

        if(sorteio < numero) {
            pontuacao -=10;
            System.out.println ("Numero digitado é maior que o numero sorteado e você está com " + pontuacao + "pontos");


        }else if (sorteio > numero){
            pontuacao -= 10;
            System.out.println ("Numero digitado é menor que o numero sorteado e voce está com " + pontuacao + "pontos");


        } else {
            System.out.println ("Você acertou com 30 pontos");
            leitura.close();
            return;
        }
leitura.close();




    }
    
}
