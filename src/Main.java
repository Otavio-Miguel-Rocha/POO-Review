public class Main {
    public static void main(String[] args) {
        dadosIniciais();

        Vendedor vendedor = new Vendedor("Marcos");

        //Nome antes da alteração
        System.out.println(vendedor.getNome());

        //Alteração do nome, para nome e sobrenome
        vendedor.setNome("Marcos Rocha");

        //Nome após a alteração
        System.out.println(vendedor.getNome());
    }

    public static void dadosIniciais() {
        new Bicicleta("Oggi Hacker Pro Aro 29", "Bike top", 1799.99);
        new Bicicleta("Soul Pro Rider", "Bike High Level", 2799.99);
        new Bicicleta("Monark", "Bike old school", 799.99);
        new Bicicleta("Sense Gravel", "Bike expert", 5399.99);
    }
}










