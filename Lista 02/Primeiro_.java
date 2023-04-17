import java.util.Scanner;

public class Primeiro_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rodas, pessoas;
        Float peso;

        System.out.println("Para descobrir a categoria necessaria para dirigir um veiculo precisamos de algumas informacoes sobre o veiculo\nQuantidade de rodas;\nQuantidade de pessoas;\nPeso do veiculo;");
        System.out.println("Digite a quantidade de rodas>");
        rodas = input.nextInt();
        System.out.println("Digite a quantidade de pessas que cabem no veiculo>");
        pessoas = input.nextInt();
        System.out.println("Digite o peso do seu veiculo em KG>");
        peso = input.nextFloat();


        if(rodas>1 & rodas<4){
            System.out.println("A categoria do seu carro é A");
            
        }
        if(rodas == 4 & pessoas < 9 & peso <3501){
            System.out.println("A categoria do seu carro é B");
        }
        if(rodas>=4){
            if(peso>3500 & peso<6001 & pessoas<8){
                System.out.println("A categoria do seu carro é C");
            }
            if(pessoas > 8 & peso <6001 & peso>3500){
                System.out.println("A categoria do seu carro é D");
                
            }
            if(peso>6000){
                System.out.println("A categoria do seu carro é E");
            }
        };
    input.close();
    }
}
