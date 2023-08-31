public class Vendedor {
    int id;
    String nome;
    double comissao;

    static int contadorId = 1;

    public Vendedor(String nome){
        this.id = contadorId;
        contadorId++;
        this.nome = nome;
    }

    public void receberComissao(double valorFinal){
        this.comissao += valorFinal * 0.10;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", comissao=" + comissao +
                '}';
    }
}



