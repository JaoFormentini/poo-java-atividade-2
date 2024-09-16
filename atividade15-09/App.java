import Java02092024.produto;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual quantidade total do estoque?");
        int y = sc.nextInt();
        produto carrogol = new produto(50000, "Carro Gol", y);

        carrogol.totalvaloremestoque(y);

        System.out.println("Qual quantidade voce deseja adicionar ao estoque?");
        int x = sc.nextInt();
        carrogol.adicionarproduto(x);

        System.out.println("Qual quantidade voce deseja retirar ao estoque?");
        int z = sc.nextInt();
        carrogol.retirarproduto(z);

        carrogol.mostrarinformacoes();
    }
}
