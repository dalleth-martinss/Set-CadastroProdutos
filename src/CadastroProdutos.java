import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();

    }

    public Set<Produto> getProdutoSet() {
        return produtoSet;
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet); // TreeSet ordena os elementos usando a ordem natural definida na classe Produto
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

}