public class TesteProdutoImportado {

    public static void main(String[] args) {
        //Criação e instância de um objeto da classe ProdutoImportado
        ProdutoImportado produtoImportado = new ProdutoImportado();

        //Construção do objeto ProdutoImportado
        produtoImportado.setDescricao("Café");
        produtoImportado.setPreco(500.0);
        produtoImportado.setTaxa(20.0);
        //produtoImportado.origem = "Colômbia";
        //produtoImportado.aliquota = 60.0;
        produtoImportado.setOrigem("Colômbia");
        produtoImportado.setAliquota(60.0);

        //Imprimindo os dados do produto importado
        System.out.println("\n\t\t\t -- Produto Importado -- \n");
        produtoImportado.imprimirProdutoImportado();

        //Criação e instância de um outro produto importado
        ProdutoImportado outroProdutoImportado = new ProdutoImportado("Sabão", 30.0, 20.0, "Jalapão", 100.0);

        //Imprimindo os dados do outro produto importado
        System.out.println("\n\t\t\t -- Outro Produto Importado -- \n");
        outroProdutoImportado.imprimirProdutoImportado();
        
    }
    }
