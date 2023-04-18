import java.util.Scanner;

public class Terceiro_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 1, maior, menor, idade;

        System.out.println("Digite Sua idade >");
        maior = input.nextInt();
        menor = maior;

        while(contador != 12){
            System.out.println("Digite a sua idade >");
            idade = input.nextInt();
                if(idade > maior){
                    maior = idade;
                }
                else if(idade < menor){
                    menor = idade;
                }
            contador += 1;
        }
        System.out.println("A maior idade foi: "+maior+"\nA menor idade foi: "+menor);
        input.close();
    }
}
