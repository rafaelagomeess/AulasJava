
/*
*Calcule a soma das médias dos 5 estudantes e, ao final, retorne essa soma e os nomes dos estudantes
*/

import java.util.Scanner;

public class Aula4E {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        double media1, media2, media3, media4, media5, soma=0.0;
        String nome1, nome2, nome3, nome4, nome5;
        System.out.println("Digite seu nome:");
        nome1= leitura.nextLine();
        System.out.println("Digite seu media:");
        media1= leitura.nextDouble();
        soma= soma+media1;
        System.out.println(soma);

    }
}
