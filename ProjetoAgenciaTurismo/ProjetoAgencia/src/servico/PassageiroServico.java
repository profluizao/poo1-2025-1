package servico;

import java.util.ArrayList;

import dominio.pessoa.Passageiro;
import repositorio.PassageiroRepo;

public class PassageiroServico implements IBaseServico<Passageiro>{

    private PassageiroRepo repo;

    public PassageiroServico(){
        this.repo = new PassageiroRepo();
    }

    @Override
    public ArrayList<Passageiro> navegar() {
        return this.repo.read();
    }

    @Override
    public Passageiro ler(Long codigo) {
        return this.repo.read(codigo);
    }

    @Override
    public Passageiro editar(Passageiro instancia) {
        return this.repo.update(instancia);
    }

    @Override
    public Passageiro adicionar(Passageiro instancia) {
        return this.repo.create(instancia);
    }

    @Override
    public Passageiro deletar(Long codigo) {
        return this.repo.delete(codigo);
    }
}
