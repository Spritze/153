import java.util.Scanner;
public class exercicio26 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 5: ");
        int numero = leia.nextInt();
        
        switch (numero) {
            case 1:
                System.out.print("Número 1 foi digitado...");
                break;

            case 2:
                System.out.print("Número 2 foi digitado...");
                break;

            case 3:
                System.out.print("Número 3 foi digitado...");
                break; 

            case 4:
                System.out.print("Número 4 foi digitado...");
                break;

            case 5:
                System.out.print("Número 5 foi digitado...");
                break;

            default:
                System.out.print("Número inválido");
                break;
        }
    }
}
