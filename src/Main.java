public class Main {
    public static void main(String[] args) {
        //Criação de uma matriz de uma loja de bicicletas
        String [][] bicicletas = new String[5][5];

        //Definição do nome da bicicleta
        bicicletas[4][0] = "Oggi Hacker Pro Aro 29";

        //Manipulando a descrição da 5ª bicicleta da loja através do nome dela
        for (int i = 0; i < bicicletas.length; i++) {
            if(bicicletas[i][0] != null){
                if(bicicletas[i][0].equals("Oggi Hacker Pro Aro 29")){
                    bicicletas[i][1] = "Bicicleta Top de Linha";
                }
            }
        }
    }
}






