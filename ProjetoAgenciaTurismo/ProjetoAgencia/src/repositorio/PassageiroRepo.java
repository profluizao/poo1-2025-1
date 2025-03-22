package repositorio;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.pessoa.Passageiro;
import fakedb.PassageiroFakeDB;

public class PassageiroRepo extends BaseRepositorio<Passageiro> {
    private PassageiroFakeDB fakeDB;
    public PassageiroRepo(){
        this.fakeDB = new PassageiroFakeDB();
        this.baseDeDados = this.fakeDB;
    }

    @Override
    public Passageiro create(Passageiro instancia) {
        Passageiro p = this.baseDeDados.getInstancia().getLast();
        Long chave = p.getCodigo() + 1;
        instancia.setCodigo(chave);
        this.baseDeDados.getInstancia().add(instancia);
        return instancia;
    }

    @Override
    public Passageiro read(Long codigo) {
        ArrayList<Passageiro> lista = this.baseDeDados.getInstancia();
        for (Passageiro passageiro : lista) {
            if (passageiro.getCodigo() == codigo){
                return passageiro;
            }
        }
        return null;
    }

    @Override
    public Passageiro update(Passageiro instancia) {
        Passageiro alterado = this.read(instancia.getCodigo());
        if (alterado != null){
            alterado.setDataDeAlteracao(LocalDate.now());
            alterado.setDocumentoPessoal(instancia.getDocumentoPessoal());
            alterado.setEmail(instancia.getEmail());
            alterado.setNome(instancia.getNome());
            alterado.setNumeroDeCartao(instancia.getNumeroDeCartao());
            alterado.setTelefone(instancia.getTelefone());
            return alterado;
        }
        return alterado;
    }

    @Override
    public Passageiro delete(Long codigo) {
        Passageiro deletado = this.read(codigo);
        if(deletado != null){
            this.baseDeDados.getInstancia().remove(deletado);
            return deletado;
        }
        return deletado;
    }
}
