package Java02092024;

    public class produto {
        private double valor;
        private String nome;
        private int quantidade;

        public produto(double valor, String nome, int quantidade) {

            this.valor = valor;
            this.nome = nome;
            this.quantidade = quantidade;
        }

        public void totalvaloremestoque(double quantidade){
        this.valor = this.valor*quantidade;
        System.out.println("A valor em estoque é igual a: " +this.valor);
        }

        public void adicionarproduto(int totaladicionar){
        this.quantidade += totaladicionar;
        System.out.println("A quantidade de produto atual é: " +this.quantidade);
        }

        public void retirarproduto(int quantretirar){
            this.quantidade -= quantretirar;
            System.out.println("A quantidade de  produto atual é igual a: "+this.quantidade);
            //return this.quantidade;
        }

        public void mostrarinformacoes(){
            System.out.println("O produto é: "+this.nome);
            System.out.println("A quantidade total é: "+this.quantidade);
            System.out.println("O valor total é: "+(this.quantidade*valor));
        }
    }