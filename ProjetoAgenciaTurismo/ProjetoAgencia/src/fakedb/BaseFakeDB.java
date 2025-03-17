package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<TDominio> {
    protected ArrayList<TDominio> instancia;
    public ArrayList<TDominio> getInstancia(){
        if (this.instancia == null){
            this.instancia = new ArrayList<>();
        }
        return this.instancia;
    }
    public BaseFakeDB(){
        this.instancia = new ArrayList<>();
        this.preencherDados();
    }

    protected abstract void preencherDados();
}
