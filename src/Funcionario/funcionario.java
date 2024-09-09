package Funcionario;

public class funcionario {

    //atributos do objeto

    private String nome;
    private double salariobruto;
    private double taxa;
    private double salarioliquido;
    private float porcentagem;

    public funcionario(String nome, double salariobruto, double taxa){
        this.nome = nome;
        this.salariobruto = salariobruto;
        this.taxa = taxa;
        this.salarioliquido = salarioliquido;
        this.porcentagem = porcentagem;
    }

    public void imprimir_informacoes(){

        double salarioliquido = salariobruto-taxa;

        System.out.println("O nome do funcionario é: "+nome);
        System.out.println("O salário bruto do funcionario é: "+salariobruto);
        System.out.println("O salario liquido do funcionario é: "+salarioliquido);
    }

    public void aumentarsalario(float porcentagem){
        double valoraumentado = (salariobruto * porcentagem)/100;
        salarioliquido = (valoraumentado + salariobruto) - taxa;
        System.out.println("O salário com aumento é: "+salarioliquido);

    }
}
