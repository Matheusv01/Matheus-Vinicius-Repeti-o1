import java.util.Scanner;

public class numeros5{
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("sistema de leitura e exibição\n");
        double media = 0;
        double soma = 0;
        double maior = 0;
        double menor = Double.MAX_VALUE;

        double somaPares = 0;
        double somaImpares = 0;
        int impares = 0;
        int pares = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("digite os numeros escolhidos: ");
            double numeros = teclado.nextDouble();
            soma += numeros;
            media += numeros / 10;

            if (numeros > maior){
                maior = numeros;
            }
            if (numeros < menor){
                menor = numeros;
            }
            if (numeros % 2 == 0) {
                somaPares += numeros;
                pares++;
            } else {
                somaImpares += numeros;
                impares++;
            }
        }

        System.out.println("a soma dos numeros é: "+soma);
        System.out.println("a média dos numeros é: "+media);
        System.out.println("o maior numero é: "+maior);
        System.out.println("o menor numero é: "+menor);

        System.out.println("a soma de todos os números pares lidos: "+somaPares);
        System.out.println("a soma de todos os números ímpares lidos: "+somaImpares);
        System.out.println("o número de ímpares: "+ impares);
        System.out.println("o número de pares: "+pares);

    }
}