import Dominio.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        // Carro meu = new Carro(1);
        // meu.setAno(1994);
        // meu.setModelo("Pólo");
        // meu.setCor("Prata");
        // meu.setFabricante("Volkswagen");
        Carro meu = new Carro(10, 2020, "Gol", "Branco", "Volkswagen");
        System.out.println("Código:" + meu.getCodigo());
        System.out.println("Ano:" + meu.getAno());
        System.out.println("Modelo:" + meu.getModelo());
        System.out.println("Cor:" + meu.getCor());
        System.out.println("Fabricante:" + meu.getFabricante());
    }
}
