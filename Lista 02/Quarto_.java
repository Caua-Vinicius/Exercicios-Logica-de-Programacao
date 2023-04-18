import java.util.Scanner;

public class Quarto_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, contador, resultado;
        
        System.out.println("Vamos calcular uma tabuada de 0 a 10, digite um numero>");
        number = input.nextInt();
        System.out.println("TABUADA DO "+ number);
        for (contador =1;contador<11;contador++){
            resultado = number * contador;
            System.out.println(number + " * "+ contador + " = "+ resultado);
        }
        input.close();
    }
}
