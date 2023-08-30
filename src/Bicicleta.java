import java.util.ArrayList;
import java.util.List;

public class Bicicleta {
    int id;
    String nome;
    String descricao;
    double valor;
    static List<Bicicleta> listaBicicletas = new ArrayList<>();
    static int contadorId = 0;

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


    //futuro assunto: getter e setters
    public double pegarValor(){
        return valor;
    }
}





