import java.util.ArrayList;
import java.util.List;

public class Celular extends Produto{
    private double memoriaRam;
    private double armazenamento;

    public Celular(String nome, String descricao, double valor, double memoriaRam, double armazenamento){
        super(nome, descricao, valor);
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }

    public void aumentarArmazenamento(double armazenamento){
        this.armazenamento += armazenamento;
    }

    @Override
    public double calcularImposto(double valorAtual) {
        //Celular - 3,5% de imposto
        return valorAtual * 1.035;
    }
}



