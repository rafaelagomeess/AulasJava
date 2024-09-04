import java.util.Scanner;
public class Aula3 {
    public static void main (String[] args){
        // Estou escrevendo o meu codigo Java
        Scanner leitorTxt= new Scanner (System.in);
        System.out.println("Digite nome do funcionário 1:\n");
        String nome1 = leitorTxt.nextLine();
        System.out.println("Digite nome do funcionário 2:\n");
        String nome2 = leitorTxt.nextLine();
        System.out.println("Digite nome do funcionário 3:\n");
        String nome3 = leitorTxt.nextLine();
        System.out.println("Digite nome do funcionário 4:\n");
        String nome4 = leitorTxt.nextLine();
        System.out.println("Digite nome do funcionário 5:\n");
        String nome5 = leitorTxt.nextLine();

        System.out.println ("Os nomes dos funcionarios são:" + nome1 + " " + nome2 + " " + nome3 + " " + nome4 +  " " +nome5);
        leitorTxt.close();
     }
 }

    