import java.util.ArrayList;
import java.util.List;

//Classe que armazenará o histórico de vendas
public class Venda {

    //Composição
    private Vendedor vendedor;
    private List<Produto> listaProdutos = new ArrayList<>();
    //

    //Agregação
    private Cliente clienteCadastrado;
    //
    private double valorFinal;
    private static List<Venda> vendas = new ArrayList<>();
}




