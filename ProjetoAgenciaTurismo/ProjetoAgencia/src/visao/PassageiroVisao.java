package visao;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.pessoa.Passageiro;
import servico.PassageiroServico;

public class PassageiroVisao extends BaseVisao{

    private PassageiroServico serv;

    public PassageiroVisao(){
        this.serv = new PassageiroServico();
    }

    @Override
    public void carregar() {
        padraoMenu menu = new padraoMenu();
        Scanner sc = new Scanner(System.in);
        while (true){
            int op = menu.executar(sc);
            switch (op) {
                case 1:
                    this.listar();                    
                    break;
                case 2:
                    this.exibir();
                    break;
                case 3:
                    this.incluir();
                    break;
                case 4:
                    this.alterar();
                    break;
                case 5:
                    this.excluir();
                    break;
                case 9:
                    return;
            }
        }        
    }

    @Override
    protected void listar() {
        System.out.println("*************************************");
        System.out.println("* PASSAGEIRO - LISTAR ***************");
        ArrayList<Passageiro> lista = this.serv.navegar();
        for (Passageiro ps : lista) {
            System.out.println("*************************************");
            System.out.println("Codigo: " + ps.getCodigo());
            System.out.println("Nome: " + ps.getNome());
            System.out.println("E-mail: " + ps.getEmail());
        }
        System.out.println("*************************************");
    }

    @Override
    protected void exibir() {
        System.out.println("Vc escolheu Exibir.");
    }

    @Override
    protected void incluir() {
        System.out.println("Vc escolheu Incluir.");

    }

    @Override
    protected void alterar() {
        System.out.println("Vc escolheu Alterar.");
    }

    @Override
    protected void excluir() {
        System.out.println("Vc escolheu Excluir.");
    }
}
