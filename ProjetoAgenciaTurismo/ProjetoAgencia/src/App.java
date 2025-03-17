import java.util.ArrayList;

import dominio.pessoa.Passageiro;
import fakedb.PassageiroFakeDB;

public class App {
    public static void main(String[] args) throws Exception {

        PassageiroFakeDB fakeDB = new PassageiroFakeDB();
        ArrayList<Passageiro> lista = fakeDB.getInstancia();
        for (Passageiro item : lista) {
            System.out.println("Codigo: " + item.getCodigo());
            System.out.println("Nome: " + item.getNome());
            System.out.println("CPF: " + item.getDocumentoPessoal());
            System.out.println("----------------------------------");
        }
    }
}
