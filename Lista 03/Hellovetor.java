import java.util.ArrayList;
import java.util.Scanner;

public class Hellovetor {
    public static ArrayList<Integer> numeros = new ArrayList<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int c=0; c<5; c++){
            System.out.println("Digite um numero para adicionarmos em nosso sistema:");
            int escolha = input.nextInt();
            numeros.add(escolha);
        }
        System.out.println("=============================================");
        System.out.println("Os numeros que você digitou foram:");
        for(int i = 0; i<numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        System.out.println("=============================================");

        input.close();
    }
}
