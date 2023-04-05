import java.util.Scanner;

public class Primeiro {
        public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String nome;
    int idade;

        System.out.println("Digite o seu nome: ");   
        nome = input.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = input.nextInt();

        System.out.printf("Olá "+ nome + " você tem " + idade + " anos");

        input.close();
    }
}