package servico;

import java.util.ArrayList;

public interface IBaseServico<TDominio> {
    ArrayList<TDominio> navegar();
    TDominio ler(Long codigo);
    TDominio editar(TDominio instancia);
    TDominio adicionar(TDominio instancia);
    TDominio deletar(Long codigo);    
}