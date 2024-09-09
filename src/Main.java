import Funcionario.funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        funcionario joao = new funcionario("Joao Pedro Formentini", 6000, 1000);
        funcionario gabriel = new funcionario("Gabriel Gomes", 10000, 1000);

            Scanner sc = new Scanner(System.in);

            System.out.println("Qual a porcentagem de aumento salarial?");
            float porcentagem = sc.nextFloat();
        joao.imprimir_informacoes();
        joao.aumentarsalario(porcentagem);
    }

}