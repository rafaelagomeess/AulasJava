import java.util.Scanner;

public class aula6B {
    public static void main(String[] args) {
        String [] resposta = {
            "Atibaia",
            "Florianopolis",
            "Maragogi",
            "Bonito",
            "Porto Seguro",
            "Angra dos Reis",
            "Porto de Galinhas",
            "Monte Verde",
            "Gramado",
            "Barra do Garças",
            "Guarapari"};

            Scanner leitura = new Scanner (System.in);
            System.out.println("Digite um Estado:");

            switch (leitura.nextLine()){
                case "São Paulo":
                System.out.println(resposta[0]);
                break;

                case "Santa Catarina":
                System.out.println(resposta[1]);
                break;

                case "Alagoas":
                System.out.println(resposta[2]);
                break;

                case "Mato Grosso do Sul":
                System.out.println(resposta[3]);
                break;

                case "Bahia":
                System.out.println(resposta[4]);
                break;

                case "Rio de Janeiro":
                System.out.println(resposta[5]);
                break;

                case "Pernambuco":
                System.out.println(resposta[6]);
                break;

                case "Rio Grande do Sul":
                System.out.println(resposta[7]);
                break;

                case "Mato Grosso":
                System.out.println(resposta[8]);
                break;

                case "Espirito Santo":
                System.out.println(resposta[9]);
                break;

                default:
                System.out.println("Estado Invalido");


        }
    }
}
