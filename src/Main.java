import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        dadosIniciais();

        System.out.println("Insira o ID do produto>: ");
        int id = sc.nextInt();

        Produto produto = Produto.buscarProduto(id);

        produto.aumentarArmazenamento(64);
        //Cast
        ((Celular) produto).aumentarArmazenamento(64);
    }

    public static void dadosIniciais() {
        new Bicicleta("Oggi Hacker Pro Aro 29", "Bike top", 1799.99, 29, 15.5);
        new Bicicleta("Soul Pro Rider", "Bike High Level", 2799.99, 29, 17);
        new Bicicleta("Monark", "Bike old school", 799.99, 29, 15);
        new Bicicleta("Sense Gravel", "Bike expert", 5399.99, 29, 17);

        new Celular("Galaxy A21S", "Bom Celular", 1399.99, 4, 64);
        new Celular("Iphone 11", "Ótimo Celular", 3399.99, 4, 128);


        new Vendedor("Marcos");
        new Vendedor("Gabriel");
    }
}










