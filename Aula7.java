import java.util.Random;
import java.util.Scanner;


public class Aula7 {
    public static void main(String[] args) {

        Scanner leia = new Scanner (System.in);
        Random aleatorio = new Random ();

        final int sorteio = aleatorio.nextInt(1,6);
        System.out.println("Digite um numero:");
        int pontuacao = 50;
        int numero;

        while(pontuacao>0){
            numero= leia.nextInt();


            if (sorteio< numero){
                //pontuacao = pontuacao -10;
                pontuacao -=10;
                System.out.println("Numero digitado é maior e voce está com" + pontuacao + "pontos");
            }
  
            else if (sorteio > numero){  
                pontuacao-=10;
                System.out.println("Número digitado é menor e voce esta com"+ pontuacao + "pontos");
            }

           else {
            System.out.println ("Você acertou com " + pontuacao + "pontos");
            return;
           }
        }
     System.out.println("Você perdeu:(");
     leia.close();




        
    }
}
