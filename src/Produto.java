import java.util.ArrayList;
import java.util.List;

public class Produto {
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
}

