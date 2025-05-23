package visao;

import java.util.Scanner;

public class DominiosMenu extends BaseMenu{

    private PassageiroMenu passageiroMenu;

    private ColaboradorMenu colaboradorMenu;

    public DominiosMenu(Scanner sc){
        super(sc);
    }

    @Override
    public int executar() {
        int opcao = 0;
        while (opcao != 9){
            System.out.println("1 - Passageiro");
            System.out.println("2 - Colaborador");
            // System.out.println("3 - Incluir");
            // System.out.println("4 - Alterar");
            // System.out.println("5 - Excluir");
            System.out.println("9 - Sair");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    this.passageiroMenu = new PassageiroMenu(this.scan);
                    this.passageiroMenu.executar();
                    break;
                case 2:
                    this.colaboradorMenu = new ColaboradorMenu(this.scan);
                    this.colaboradorMenu.executar();
                    break;
                // case 3:
                // case 4:
                // case 5:
                case 9:
                    return opcao;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        return opcao;
    }
    
}
