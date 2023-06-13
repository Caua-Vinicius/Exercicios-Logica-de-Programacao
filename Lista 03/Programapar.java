import java.util.ArrayList;
import java.util.Scanner;
public class Programapar {
    public static ArrayList<Integer> numeros = new ArrayList<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int c=0; c<10; c++){
            System.out.println("Digite um numero para adicionarmos em nosso sistema:");
            int escolha = input.nextInt();
            numeros.add(escolha);
        }
        System.out.println("=============================================");
        System.out.println("Os numeros pares que você digitou foram:");
        numeros.sort(null);
        for(int i = 0; i<numeros.size(); i++){
           int numero = numeros.get(i);
           if(numero % 2==0){
                System.out.println(numero);
           }
        }
        System.out.println("=============================================");

        input.close();
    }
}



