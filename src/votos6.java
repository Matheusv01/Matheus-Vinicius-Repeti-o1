import java.util.Scanner;

public class votos6{
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- sistema de votos eleição ---\n 1 = joão\n 2- maria\n 0- nulo\n");

        int maria = 0;
        int joao = 0;
        int nulo = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("escolha um candidato para votar: ");
            int votos = teclado.nextInt();

            if (votos % 2 == 0) {
                maria += votos / 2;
            } else {
                joao += votos;
            }
        }
        if (maria > joao){
            System.out.println("maria venceu a votação");
        } else {
            System.out.println("joao venceu a votação");
        }
    }
}