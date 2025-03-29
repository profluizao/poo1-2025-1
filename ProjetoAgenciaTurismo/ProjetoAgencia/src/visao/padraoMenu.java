package visao;

import java.util.Scanner;

public class padraoMenu extends BaseMenu{

    @Override
    public int executar(Scanner scan) {
        int opcao = 0;
        while (opcao != 9){
            System.out.println("1 - Listar");
            System.out.println("2 - Exibir");
            System.out.println("3 - Incluir");
            System.out.println("4 - Alterar");
            System.out.println("5 - Excluir");
            System.out.println("9 - Sair");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
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
