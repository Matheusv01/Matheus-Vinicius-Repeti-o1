import java.util.Scanner;

public class somar4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- soma números multilplos de 3 ---");

        int soma = 0;

        for (int i = 0; i < 100;i++){
            if (i % 3 == 0){
                System.out.println(+i);
                soma += i;
            }
        }
        System.out.print("\n a soma dos multiplos é: " +soma);
    }
}