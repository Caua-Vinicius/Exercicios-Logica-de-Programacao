import java.util.Scanner;

public class Quarto {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int A,B,C;

        System.out.println("Digite um Valor inteiro >");
        A = input.nextInt();

        System.out.println("Digite outro valor inteiro >");
        B = input.nextInt();

        if(A>B){
            C = A +B;
            System.out.println("O resultado do nosso calculo é igual a " + C + ", pois o primeiro valor é o maior que o segundo portanto a soma foi usada para ter o resultado.");

        }
        else{
            C = A * B;
            System.out.println("O resultado do nosso calculo é igual a " + C + ", pois o Segundo valor é maior que o Primeiro, portando a multiplicação foi usada para ter o resultado.");
        }
        
        input.close();
    }
}
