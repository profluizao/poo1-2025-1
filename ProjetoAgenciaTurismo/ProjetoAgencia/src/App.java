import java.util.ArrayList;

import dominio.pessoa.Passageiro;
import repositorio.PassageiroRepo;

public class App {
    public static void main(String[] args) throws Exception {
        PassageiroRepo repo = new PassageiroRepo();
        ArrayList<Passageiro> lista = repo.read();
        for (Passageiro passageiro : lista) {
            System.out.println("Codigo: " + passageiro.getCodigo());
            System.out.println("Nome: " + passageiro.getNome());
            System.out.println("Telefone: " + passageiro.getTelefone());
        }
    }
}
