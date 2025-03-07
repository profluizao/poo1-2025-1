package dominio.pessoa;

import java.time.LocalDate;

import dominio.BaseParametro;

public abstract class BasePessoa extends BaseParametro {
    protected String nome;
    protected String telefone;
    protected String email;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public BasePessoa(long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String nome, String telefone,
            String email) {
        super(codigo, dataDeInclusao, dataDeAlteracao);
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    

}
