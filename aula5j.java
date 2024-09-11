import java.util.Random;
import java.util.Scanner;

public class aula5j {
    public static void main(String[] args) {
        //Atribuindo os valores iniciais
        Random aleatorio = new Random();
        Scanner leia = new Scanner (System.in);
        final int sorteio = aleatorio.nextInt(1,6);

        //Obtendo valores com o usuario

        System.out.println("Digite um numero");
        int numero= leia.nextInt(), pontuacao = 30;

        // teste de pontuacao 

        if (numero == sorteio){
            System.out.println("Você acertou com"+ pontuacao +"pontos");
            leia.close ();
            return;

        } else if {
            pontuacao = pontuacao - 10;
            System.out.println("Você perdeu"+ 10 + "pontos e está com"+ pontuacao + "pontos");
        }
        
        
        
        else {
                pontuacao = pontuacao - 10;
                System.out.println("Você perdeu" + 10 + "pontos e está com"+ pontuacao + "pontos");
            }

     //Obtendo valores com o usuario

    System.out.println("Digite um numero");
    numero= leia.nextInt();

    // teste de pontuacao 

    if (numero == sorteio){
        System.out.println("Acertou");
        leia.close ();
        
    
    }else {
        pontuacao = pontuacao - 10;
        System.out.println("Você perdeu" + 20 + "pontos e está com"+ pontuacao + "pontos");
    }

 // teste de pontuacao 

 if (numero == sorteio){
    System.out.println("Acertou");
    leia.close ();
    

}else {
    pontuacao = pontuacao - 10;
    System.out.println("Você perdeu" + 30 + "pontos e o jogo encerrou");
    
}
leia.close();
}
}

