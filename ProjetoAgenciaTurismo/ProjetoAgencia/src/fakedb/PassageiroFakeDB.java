package fakedb;

import java.time.LocalDate;

import dominio.pessoa.Passageiro;

public class PassageiroFakeDB 
    extends BaseFakeDB<Passageiro>{

    @Override
    protected void preencherDados() {
        this.instancia.add(new Passageiro(1, LocalDate.now(), null, "Mateus", "123", "mateus@teste.com", "123", "741"));
        this.instancia.add(new Passageiro(2, LocalDate.now(), null, "Lucas", "123", "mateus@teste.com", "123", "741"));
        this.instancia.add(new Passageiro(3, LocalDate.now(), null, "João", "123", "mateus@teste.com", "123", "741"));
        this.instancia.add(new Passageiro(4, LocalDate.now(), null, "Paulo", "123", "mateus@teste.com", "123", "741"));
        this.instancia.add(new Passageiro(5, LocalDate.now(), null, "Pedro", "123", "mateus@teste.com", "123", "741"));        
    }
    
    public PassageiroFakeDB(){
        super();
    }
}
