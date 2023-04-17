import java.util.Scanner;

public class Nono {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float number1, number2,resultado;
        int operacao;
    
        System.out.println("Calculadora Super Hiper Mega Ultra Legal\n\nDigite dois numeros para realizar uma operacao>\nPrimeiro numero>");
        number1 = input.nextFloat();
        System.out.println("Segundo numero>");
        number2 = input.nextFloat();
        System.out.println("Escolha uma operação para realizar\n\n1 - Soma\n2 - Subtracao\n3 - Divisão\n4 - Multiplicacao");
        operacao = input.nextInt();

        if(operacao == 1){
            resultado = number1 + number2;
            System.out.println("O Resultado da operacao é "+resultado);
        }
        if(operacao == 2){
            resultado = number1 - number2;
            System.out.println("O Resultado da operacao é "+resultado);
        }
        if(operacao == 3){
            resultado = number1 / number2;
            System.out.println("O Resultado da operacao é "+resultado);
        }
        if(operacao == 4){
            resultado = number1 * number2;
            System.out.println("O Resultado da operacao é "+resultado);
        }


        input.close();
    }
}
