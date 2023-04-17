import java.util.Scanner;

public class Oitavo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int tempchoice, tempchoice2;
        float temp;  

        System.out.println("Digite apenas o valor da temperatura > ");
        temp = input.nextFloat();

        System.out.println("Vamos fazer uma conversao de temperaturas, portanto digite qual sera a temperatura de origem usando os numeros da tabela abaixo\n1 - Celsius\n2 - Fahrenheit\n3 - Kelvin\nDigite a sua escolha > ");
        tempchoice = input.nextInt();

        System.out.println("Agora escolha a temperatura final de acordo com a tabela anterior, obviamente diferente da temperatura de origem \nDigite sua escolha >");
        tempchoice2 = input.nextInt();
        
        if(tempchoice == 1){
            if(tempchoice2 == 2){
                temp = temp *(18/10) + 32;
                System.out.println("A conversão deu "+temp+" Graus Fahrenheit.");
            }
            if(tempchoice == 3){
                temp = temp + 273;
                System.out.println("A conversão deu "+temp+" Graus Kelvin.");
            }
        }
        if(tempchoice == 2){
            if(tempchoice2 == 1){
                temp=temp/(18/10)-32;
                System.out.println("A conversão deu "+temp+" Graus Celsius.");
            }
            if(tempchoice == 3){
                temp= temp/(18/10)+305;
                System.out.println("A conversão deu "+temp+ " Graus kelvin.");
            }
        }    
        if(tempchoice == 3){
            if(tempchoice2 == 1){
                temp = temp -273;
                System.out.println("A conversão deu "+temp+" Graus Celcius.");
            }
            if(tempchoice == 2){
                temp= (18/10)*(temp-273)+32;
                System.out.println("A conversão deu "+temp+" Graus Fahrenheit.");
            }
        }
        
        input.close();

    }
}
