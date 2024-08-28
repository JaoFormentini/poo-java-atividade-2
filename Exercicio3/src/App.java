import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float notaAtual;
        float media = 0;

        for(int i=1; i<=4; i++){
            System.out.println(i+". Nota: ");
            notaAtual = scanner.nextFloat();
            media += notaAtual;
        }

        media /= 4;        

        System.out.println("Sua média é: " + media);

        if (media > 6) {
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}
