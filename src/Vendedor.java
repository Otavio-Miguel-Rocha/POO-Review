public class Vendedor {
    private int id;
    private String nome;
    private double comissao;

    private static int contadorId = 1;

    public Vendedor(String nome){
        this.id = contadorId;
        contadorId++;
        this.nome = nome;
    }

    public void receberComissao(double valorFinal){
        this.comissao += valorFinal * 0.10;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getId() {
        return id;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
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



