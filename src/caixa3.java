import java.util.Scanner;

public class caixa3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- caixa eletrônio ---");
        double valortotal = 0;

        for (int i = 0;i >= 0; i++){
            System.out.println("digite o valor do produto: ");
            double valor = teclado.nextDouble();
            if (valor == 0){
                System.out.println("compra finalizada!!");
                break;
            }
            valortotal += valor;
        }
        System.out.println("o valor total a ser pago é: "+valortotal);
    }
}
