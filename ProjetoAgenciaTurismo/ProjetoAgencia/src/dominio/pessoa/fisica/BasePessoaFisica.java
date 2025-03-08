package dominio.pessoa.fisica;

import java.time.LocalDate;

import dominio.pessoa.BasePessoa;

public abstract class BasePessoaFisica extends BasePessoa{
    protected String rg;
    protected String cpf;
    protected LocalDate dataDeNascimento;
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public BasePessoaFisica(long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String nome,
            String telefone, String email, String rg, String cpf, LocalDate dataDeNascimento) {
        super(codigo, dataDeInclusao, dataDeAlteracao, nome, telefone, email);
        this.rg = rg;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }
    
}
