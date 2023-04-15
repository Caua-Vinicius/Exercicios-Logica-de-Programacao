import java.util.Scanner;

public class Setimo {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        Float nota1, nota2, nota3, media;

        System.out.println("Vamos calcular a sua media nesse sementre\nDigite a sua NOTA 1 >");
        nota1 = input.nextFloat();

        System.out.println("NOTA 2 >");
        nota2 = input.nextFloat();

        System.out.println("NOTA 3 >");
        nota3 = input.nextFloat();

        media = (nota1 + nota2*2 +nota3*3)/6;

        if(media >= 90){
            System.out.println("APROVADO MEDIA "+ media);
        }
        if(media >= 75 && media<90){
            System.out.println("APROVADO MEDIA "+ media);
        }
        if(media>= 60 && media < 75){
            System.out.println("APROVADO MEDIA "+ media);
        }
        if(media >= 40 && media<60){
            System.out.println("REPROVADO MEDIA "+ media);
        }
        if(media < 40){
            System.out.println("REPROVADO MEDIA "+ media);
        }

        input.close();
}   
}
