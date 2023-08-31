public class Main {
    public static void main(String[] args) {
        dadosIniciais();
        //Cria o vendedor
        Vendedor vendedor = new Vendedor("Marcos");

        //Identifica a bicicleta vendida
        Bicicleta bicicleta = Bicicleta.encontrarBicicleta(3);

        //Estado atual da comissão
        System.out.println(vendedor.comissao);

        //Executa o método
        vendedor.receberComissao(bicicleta.valor);

        //Verifica o novo estado, testando e verificando
        //A funcionalidade da palavra this
        System.out.println(vendedor.comissao);
    }

    public static void dadosIniciais(){
       new Bicicleta("Oggi Hacker Pro Aro 29", "Bike top", 1799.99);

        new Bicicleta("Soul Pro Rider", "Bike High Level", 2799.99);

        new Bicicleta("Monark", "Bike old school", 799.99);

        new Bicicleta("Sense Gravel", "Bike expert", 5399.99);
    }
}






