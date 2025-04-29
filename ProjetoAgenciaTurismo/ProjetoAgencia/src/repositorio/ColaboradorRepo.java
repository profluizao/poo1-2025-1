package repositorio;

import dominio.pessoa.fisica.Colaborador;
import fakedb.ColaboradorFakeDB;

public class ColaboradorRepo extends BaseRepositorio<Colaborador>{

    private ColaboradorFakeDB fakeDB;

    public ColaboradorRepo(){
        this.fakeDB = new ColaboradorFakeDB();
        this.baseDeDados = this.fakeDB;
    }

    @Override
    public Colaborador create(Colaborador instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public Colaborador read(Long codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public Colaborador update(Colaborador instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Colaborador delete(Long codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}