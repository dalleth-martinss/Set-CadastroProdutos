public class Main {
    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos =  new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto C", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto A", 20d, 10);
        cadastroProdutos.adicionarProduto(3L, "Produto B", 10d, 4);
        cadastroProdutos.adicionarProduto(4L, "Produto E", 13d, 2);
        cadastroProdutos.adicionarProduto(5L, "Produto D", 9d, 2);
        cadastroProdutos.adicionarProduto(4L, "Produto G", 13d, 2);
        cadastroProdutos.adicionarProduto(5L, "Produto H", 9d, 2);
        cadastroProdutos.adicionarProduto(4L, "Produto I", 13d, 2);
        cadastroProdutos.adicionarProduto(5L, "Produto F", 9d, 2);

        System.out.println("********* LISTA DE PRODUTOS ******************\n");
        System.out.println(cadastroProdutos.getProdutoSet());
        System.out.println("*********** LISTA POR PREÇO ****************\n");
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());
        System.out.println("************ LISTA POR NOME ***************\n");
        System.out.println(cadastroProdutos.exibirProdutoPorNome());


    }
}