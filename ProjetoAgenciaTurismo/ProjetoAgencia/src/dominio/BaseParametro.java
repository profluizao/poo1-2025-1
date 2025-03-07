package dominio;

import java.time.LocalDate;

public abstract class BaseParametro extends BaseIdentificador {
    protected LocalDate dataDeInclusao;
    protected LocalDate dataDeAlteracao;
    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }
    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }
    public LocalDate getDataDeAlteracao() {
        return dataDeAlteracao;
    }
    public void setDataDeAlteracao(LocalDate dataDeAlteracao) {
        this.dataDeAlteracao = dataDeAlteracao;
    }
    public BaseParametro(long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao) {
        super(codigo);
        this.dataDeInclusao = dataDeInclusao;
        this.dataDeAlteracao = dataDeAlteracao;
    }
        
}
