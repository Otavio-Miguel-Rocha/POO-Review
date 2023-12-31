import java.util.ArrayList;
import java.util.List;

public class Bicicleta extends Produto{
    private double tamanhoAro;
    private double tamanhoQuadro;

    public Bicicleta(String nome, String descricao, double valor,
                     double tamanhoAro, double tamanhoQuadro){
        super(nome, descricao, valor);
        this.tamanhoAro = tamanhoAro;
        this.tamanhoQuadro = tamanhoQuadro;
    }

    @Override
    public String toString() {
        return  "Bicicleta {" + "\n" +
                super.toString() + "\n" +
                "tamanhoAro=" + tamanhoAro +
                ", tamanhoQuadro=" + tamanhoQuadro +
                '}';
    }

    @Override
    public double calcularImposto(double valorAtual) {
        //Bicicleta - 5,5% de imposto
        return valorAtual * 1.055;
    }
}






