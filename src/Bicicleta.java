import java.util.ArrayList;
import java.util.List;

public class Bicicleta {
    String nome;
    String descricao;
    double valor;
    static List<Bicicleta> listaBicicletas = new ArrayList<>();

    public Bicicleta(String nome, String descricao, double valor){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        listaBicicletas.add(this);
    }
}





