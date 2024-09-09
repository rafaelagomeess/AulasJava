/**
 *  Crie um jogo que o usuario digita um numero e no final ele verifica se acertou o numero aleatorio
 */
import java.util.Random;
import java.util.Scanner;
public class Aula4 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner lendoNumero = new Scanner (System.in);

        final int sorteio= aleatorio.nextInt (0,10);

        System.out.println("Digite um valor para jogar:");
        int numeroDoUsuario = lendoNumero.nextInt();

        System.out.println("Numero digitado:" +  numeroDoUsuario + "- Número aleatório" + sorteio);
        lendoNumero.close();



    }

    
}         
