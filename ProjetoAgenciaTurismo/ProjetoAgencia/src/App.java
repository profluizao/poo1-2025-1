import java.util.Scanner;

import visao.PassageiroMenu;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        PassageiroMenu menu = new PassageiroMenu(scan);
        menu.executar();
    }
}
