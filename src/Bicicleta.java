import java.util.ArrayList;
import java.util.List;

public class Bicicleta {
    private int id;
    private String nome;
    private String descricao;
    private double valor;
    private static List<Bicicleta> listaBicicletas = new ArrayList<>();
    private static int contadorId = 0;

    public Bicicleta(String nome, String descricao, double valor){
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        listaBicicletas.add(this);
    }

    public static Bicicleta encontrarBicicleta(int id){
        for ( Bicicleta bicicleta : listaBicicletas ) {
            if(bicicleta.id == id){
                return bicicleta;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static List<Bicicleta> getListaBicicletas() {
        return listaBicicletas;
    }

    public void removerBicicleta() {
        listaBicicletas.remove(this);
    }

    public double getValor(){
        return valor;
    }



}






