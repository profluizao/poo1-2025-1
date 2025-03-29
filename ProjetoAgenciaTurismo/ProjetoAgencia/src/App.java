import java.util.ArrayList;

import dominio.pessoa.Passageiro;
import servico.PassageiroServico;

public class App {
    public static void main(String[] args) throws Exception {
        PassageiroServico serv = new PassageiroServico();
        ArrayList<Passageiro> lista = serv.navegar();
        for (Passageiro passageiro : lista) {
            System.out.println("Codigo: " + passageiro.getCodigo());
            System.out.println("Nome: " + passageiro.getNome());
            System.out.println("Telefone: " + passageiro.getTelefone());
        }
    }
}
