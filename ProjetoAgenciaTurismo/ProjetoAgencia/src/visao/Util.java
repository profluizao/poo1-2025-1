package visao;

public class Util {

    public static void pausar() {
        System.out.println("\nPressione ENTER para continuar...");
        try {
            System.in.read();
            System.in.skip(System.in.available()); // limpa o buffer
        } catch (Exception e) {
            System.out.println("Erro ao pausar.");
        }
    }
    
    public static void limparTela() {
        try {
            String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Linux e macOS geralmente suportam isso
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível limpar a tela.");
        }
    }    
}
