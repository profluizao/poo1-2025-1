package servico;

import java.util.ArrayList;

import dominio.pessoa.fisica.Colaborador;
import repositorio.ColaboradorRepo;

public class ColaboradorServico implements IBaseServico<Colaborador>{

    private ColaboradorRepo repo;

    public ColaboradorServico(){
        this.repo = new ColaboradorRepo();
    }

    @Override
    public ArrayList<Colaborador> navegar() {
        return this.repo.read();
    }

    @Override
    public Colaborador ler(Long codigo) {
        return this.repo.read(codigo);
    }

    @Override
    public Colaborador editar(Colaborador instancia) {
        return this.repo.update(instancia);
    }

    @Override
    public Colaborador adicionar(Colaborador instancia) {
        return this.repo.create(instancia);
    }

    @Override
    public Colaborador deletar(Long codigo) {
        return this.repo.delete(codigo);
    }
    
}
