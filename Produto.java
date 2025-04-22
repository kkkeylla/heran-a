public class Produto {
    //Atributos
    private String descricao;
    private double preco;
    private double taxa;

    //Métodos
    public void imprimirProduto(){
        System.out.println("Descrição: " + descricao);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.printf("Taxa: %.2f%%\n", taxa);
        System.out.printf("Preço: de venda R$ %.2f\n", this.calcularPrecoVenda());
    }

    public double calcularPrecoVenda(){
        return preco * (1 + (taxa /100));
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    Produto(String descricao, double preco, double taxa) {
        this.descricao = descricao;
        this.preco = preco;
        this.taxa = taxa;
    }

    Produto(){
        this.descricao = "Produto Não definido";
        this.preco = 0.00;
        this.taxa = 0.000;
    }
}