import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Float number,resultado;

        System.out.println("Digite um valor para fazermos um calculo >");
        number = input.nextFloat();

        if(number>0){
            resultado = number * 2;
            System.out.println("Como o seu valor é um numero positivo, calculamos o seu dobro, que é "+ resultado);
        }
        else{
            resultado = number * 3;
            System.out.println("Como o seu valor é um numero negativo, calculamos o seu triplo, que é " + resultado);
        }
        input.close();
    }
}
