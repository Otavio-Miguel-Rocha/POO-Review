public class Main {
    public static void main(String[] args) {
        dadosIniciais();
        //Vamos imaginar que no sistema, estamos pesquisando por uma bike
        //vamos pesquisar ela pelo código de barra(ID)
        //Que nesse exemplo é 3
        Bicicleta bicicleta = Bicicleta.encontrarBicicleta(3);

        //A saída será Monark
        System.out.println(bicicleta.nome);
    }

    public static void dadosIniciais(){
       new Bicicleta("Oggi Hacker Pro Aro 29", "Bike top", 1799.99);

        new Bicicleta("Soul Pro Rider", "Bike High Level", 2799.99);

        new Bicicleta("Monark", "Bike old school", 799.99);

        new Bicicleta("Sense Gravel", "Bike expert", 5399.99);
    }
}






