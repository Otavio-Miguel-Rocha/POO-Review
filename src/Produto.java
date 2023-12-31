import java.util.ArrayList;
import java.util.List;

public abstract class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double valor;

    //Conceito de Polimorfismo, explicado posteriormente
    private static List<Produto> listaProdutos = new ArrayList<Produto>();

    private static int contadorId = 0;

    public Produto(String nome, String descricao, double valor){
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        listaProdutos.add(this);
    }

    public static Produto buscarProduto(int id){
        for ( Produto produto : listaProdutos) {
            if(produto.id == id){
                return produto;
            }
        }
        return null;
    }

    public static Produto buscarProduto(String nome){
        for ( Produto produto : listaProdutos) {
            if(produto.nome.equals(nome)){
                return produto;
            }
        }
        return null;
    }

    public abstract double calcularImposto(double valorAtual);

    @Override
    public String toString() {
        return "id=" + id + "\n" +
                ", nome='" + nome + "\n" +
                ", descricao='" + descricao + "\n" +
                ", valor=" + valor;
    }
}

