import java.util.Scanner;

public class Notas_2{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("--- sistemas de notas ---\n");

        for (int i = 1; i < 5; i++){
            System.out.println("\n- notas aluno "+i+" -");

            Double mf = 0.0;

            for (int j = 1; j <= 4; j++){
                System.out.print("digite a nota: ");
                double notas= teclado.nextDouble();
                mf = mf + notas / 4;
            }
            if (mf >= 7){
                System.out.println("aprovado");
            }else if (mf > 4.9 && mf < 7){
                System.out.println("recuperação");
            }else {
                System.out.println("reprovado");
            }
            System.out.println("sua média final é: "+mf);
        }
    }
}