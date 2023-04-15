import java.util.Scanner;

public class Sexto {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double valor, desconto, juros;
        int opcao, parcelas;

        System.out.println("Digite o valor do seu produto >");
        valor = input.nextFloat();

        System.out.println("Nosso produto tem 3 formas de pagamento, olhe a lista: \n1 - A vista, pix, débito: 10% de desconto.\n2 - Crédito a vista, preco normal\n3 - Crédito parcelado, aplicado Juros Simples com taxa de 10% ao mes.\n\nEscolha uma das opcoes acima como forma de pagamento (1, 2 ou 3) >");
        opcao = input.nextInt();

        if(opcao == 1){
            desconto = valor*0.90;
            System.out.println("Com essa opcao escolhida voce pagará o valor de: "+ desconto);
        }
        if(opcao == 3){
            System.out.println("Digite em quantas parcelas voce deseja pagar >");
            parcelas = input.nextInt();
            juros = ((valor*0.1*parcelas)+valor)/parcelas;
            System.out.println("Com essa opcao escolhida voce parará "+juros+" por mes.");
        }
        if(opcao == 2){
            System.out.println("Voce pagara o valor normal, sem desconto.");
        }
        
        input.close();
    }
}