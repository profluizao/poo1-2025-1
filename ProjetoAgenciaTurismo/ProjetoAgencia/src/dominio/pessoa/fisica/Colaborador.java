package dominio.pessoa.fisica;

import java.time.LocalDate;

public class Colaborador extends BasePessoaFisica{

    public Colaborador(long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String nome, String telefone,
            String email, String rg, String cpf, LocalDate dataDeNascimento) {
        super(codigo, dataDeInclusao, dataDeAlteracao, nome, telefone, email, rg, cpf, dataDeNascimento);
    }
}
