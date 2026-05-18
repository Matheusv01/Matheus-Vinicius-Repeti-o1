import java.util.Scanner;

public class Caixa1{
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- caixa eletrônio ---");
        String senha = "4321";

        for (int i = 0; i < 3; i++){
            System.out.println("digite a senha do banco: ");
            String tentativa =teclado.nextLine();

            if (tentativa.equals(senha)){
                System.out.println("acesso liberado!!");
                return;
            }else{
                System.out.println("senha incorreta!");
            }
        }
        System.out.println("conta bloqueada!!");
    }
}