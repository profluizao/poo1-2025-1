package visao;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.pessoa.fisica.Colaborador;
import servico.ColaboradorServico;

public class ColaboradorVisao extends BaseVisao{

    private ColaboradorServico serv;

    public ColaboradorVisao(Scanner sc){
        super(sc);
        this.serv = new ColaboradorServico();
    }

    @Override
    protected void listar() {
        System.out.println("***************************************************");
        System.out.println("** COLABORADOR - LISTAR ***************************");
        ArrayList<Colaborador> lista = this.serv.navegar();
        for (Colaborador ps : lista) {
            System.out.println("Codigo: " + ps.getCodigo());
            System.out.println("Nome: " + ps.getNome());
            System.out.println("E-mail: " + ps.getEmail());
        }
        System.out.println("***************************************************");
    }
    @Override
    protected void exibir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibir'");
    }

    @Override
    protected void incluir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'incluir'");
    }

    @Override
    protected void alterar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

    @Override
    protected void excluir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public void carregar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'carregar'");
    }

    
}