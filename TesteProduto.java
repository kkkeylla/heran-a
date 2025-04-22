public class TesteProduto {

    public static void main(String[] args) {
        //Criação e instância de um objeto da classe Produto
        Produto produto = new Produto();

        //Construção do objeto Produto
        //produto.descricao = "Banana";
        //produto.preco =  100.0;
        //produto.taxa = 20.0;
        produto.setDescricao("Banana");
        produto.setPreco(100.0);
        produto.setTaxa(20.0);

        //Imprimindo os dados do produto
        System.out.println("\n\t\t\t -- Produto 1 -- \n");
        produto.imprimirProduto();
        

        //Criação e instância de um outro produto
        Produto outroProduto = new Produto("Chapéu", 300.0, 25.0);

        //imprimindo os dados do outro produto
        System.out.println("\n\t\t\t -- Produto 2 -- \n");
        outroProduto.imprimirProduto();

        
    }
}