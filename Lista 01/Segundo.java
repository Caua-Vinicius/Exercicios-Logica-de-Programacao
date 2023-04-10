import java.util.Scanner;

public class Segundo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float n1;
        float n2;
        float soma;

        System.out.println("Digite um número para realizarmos uma soma > ");
        n1 = input.nextFloat();
        System.out.println("Digite o segundo número > ");
        n2 = input.nextFloat();

        
        soma = n1 + n2;

        System.out.println("O resultado da soma foi: " + soma);

        input.close();
    }
}