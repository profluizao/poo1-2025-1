package dominio.pessoa.juridica;

import java.time.LocalDate;

public class Prestador extends BasePessoaJuridica{

    private double valorContratado;

    public double getValorContratado() {
        return valorContratado;
    }

    public void setValorContratado(double valorContratado) {
        this.valorContratado = valorContratado;
    }

    public Prestador(long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String nome, String telefone,
            String email, String cnpj, String inscricaoEstadual, LocalDate dataInicioVinculo,
            LocalDate dataFinalVinculo) {
        super(codigo, dataDeInclusao, dataDeAlteracao, nome, telefone, email, cnpj, inscricaoEstadual, dataInicioVinculo,
                dataFinalVinculo);

    }    
    
}
