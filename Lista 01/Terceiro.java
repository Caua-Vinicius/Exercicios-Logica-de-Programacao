import java.util.Scanner;

public class Terceiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float number;

        System.out.println("Digite um valor para descobrir se ele é par ou impar >");
        number = input.nextFloat();

        if (number%2==0){
            System.out.println("O seu valor é um numero par");
        }
        else{
            System.out.println("O seu valor é um numero impar");
        }

        input.close();
    }
}