import java.util.Comparator;
import java.util.Objects;

public class Produto  implements Comparable<Produto> {
    private long codigo;
    private  String nome;
    private double preco;
    private int quantidade;


    //Comaparator para ordenar e colocar em ordem alfabetica.
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) { // serve para verificar se o codigo é o mesmo ou não do produto
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Produto {" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                " }\n ";
    }

    // Comparator para ordenar por preço
   public static class ComparatorPorPreco implements Comparator<Produto>{

        @Override
        public int compare(Produto p1, Produto p2) { // serve para comparar os preços e vai coloando em ordem
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }
}