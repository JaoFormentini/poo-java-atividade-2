import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String senha = "senha123";
        String senhaDigitada;

        do {
            System.out.println("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            if (!senhaDigitada.equals(senha)) {
                System.out.println("Tente Novamente!");
            }
        } while (!senhaDigitada.equals(senha));
        
        System.out.println("Senha correta!");
        scanner.close();
    }
}