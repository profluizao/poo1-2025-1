package visao;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.pessoa.Passageiro;
import servico.PassageiroServico;

public class PassageiroVisao extends BaseVisao{

    private PassageiroServico serv;

    public PassageiroVisao(Scanner sc){
        super(sc);
        this.serv = new PassageiroServico();
    }

    @Override
    public void carregar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void listar() {
        Util.limparTela();
        System.out.println("***************************************************");
        System.out.println("** PASSAGEIRO - LISTAR ****************************");
        ArrayList<Passageiro> lista = this.serv.navegar();
        for (Passageiro ps : lista) {
            System.out.println("*************************************");
            System.out.println("Codigo: " + ps.getCodigo());
            System.out.println("Nome: " + ps.getNome());
            System.out.println("E-mail: " + ps.getEmail());
        }
        System.out.println("***************************************************");
        Util.pausar();
    }

    @Override
    protected void exibir() {
        Util.limparTela();
        System.out.println("***************************************************");
        System.out.println("** PASSAGEIRO - EXIBIR ***************************");

        System.out.print("Digite o código do passageiro: ");
        Long codigo = this.scan.nextLong();
        
        Passageiro psbusca = this.serv.ler(codigo);
        if (psbusca == null){
            System.out.print("ERRO - Passageiro não consta da lista.");
            return;
        }
        else{
            System.out.println("***************************************************");
            System.out.println("Codigo: " + psbusca.getCodigo());
            System.out.println("Nome: " + psbusca.getNome());
            System.out.println("E-mail: " + psbusca.getEmail());
        }
        System.out.println("***************************************************");
        Util.pausar();
    }

    @Override
    protected void incluir() {
        Util.limparTela();
        System.out.println("***************************************************");
        System.out.println("** PASSAGEIRO - INCLUIR ***************************");

        System.out.print("Digite o nome do passageiro: ");
        String nome = this.scan.next();
        this.scan.nextLine();

        System.out.print("Digite o email do passageiro: ");
        String email = this.scan.nextLine();

        Passageiro ps = new Passageiro(0, null, null, nome, null, email, null, null);
        Passageiro novops = this.serv.adicionar(ps);

        System.out.println("Passageiro adicionado com o código: [" + novops.getCodigo() + "]");
        System.out.println("***************************************************");
        Util.pausar();
    }

    @Override
    protected void alterar() {
        Util.limparTela();
        System.out.println("***************************************************");
        System.out.println("** PASSAGEIRO - ALTERAR ***************************");
        System.out.print("Digite o código do passageiro: ");
        Long codigo = this.scan.nextLong();
        
        Passageiro psbusca = this.serv.ler(codigo);
        if (psbusca == null){
            System.out.print("ERRO - Passageiro não consta da lista.");
            return;
        }
        else{
            System.out.println("***************************************************");
            System.out.println("Passageiro localizado:");
            System.out.println("Codigo: " + psbusca.getCodigo());
            System.out.println("Nome: " + psbusca.getNome());
            System.out.println("E-mail: " + psbusca.getEmail());

            System.out.println("***************************************************");
            System.out.print("Digite o nome do passageiro: ");
            String nome = this.scan.next();
            this.scan.nextLine();
    
            System.out.print("Digite o email do passageiro: ");
            String email = this.scan.nextLine();

            psbusca.setNome(nome);
            psbusca.setEmail(email);

            System.out.println("***************************************************");
            System.out.println("Dados alterados:");
            System.out.println("Codigo: " + psbusca.getCodigo());
            System.out.println("Nome: " + psbusca.getNome());
            System.out.println("E-mail: " + psbusca.getEmail());              
        }
        System.out.println("***************************************************");
        Util.pausar();
    }

    @Override
    protected void excluir() {
        Util.limparTela();
        System.out.println("***************************************************");
        System.out.println("** PASSAGEIRO - EXCLUIR ***************************");

        System.out.print("Digite o código do passageiro: ");
        Long codigo = this.scan.nextLong();
        
        Passageiro psbusca = this.serv.ler(codigo);
        if (psbusca == null){
            System.out.print("ERRO - Passageiro não consta da lista.");
            return;
        }
        else{
            System.out.println("***************************************************");
            System.out.println("Passageiro localizado:");
            System.out.println("Codigo: " + psbusca.getCodigo());
            System.out.println("Nome: " + psbusca.getNome());
            System.out.println("E-mail: " + psbusca.getEmail());

            System.out.println("***************************************************");
            this.serv.deletar(codigo);
            System.out.println("Passageiro removido da lista.");
        }
        System.out.println("***************************************************");
        Util.pausar();
    }
}
