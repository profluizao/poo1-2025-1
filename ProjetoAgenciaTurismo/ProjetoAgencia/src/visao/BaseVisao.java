package visao;

import java.util.Scanner;

public abstract class BaseVisao extends BaseUtil{

    protected abstract void listar();
    protected abstract void exibir();
    protected abstract void incluir();
    protected abstract void alterar();
    protected abstract void excluir();

    public abstract void carregar();

    public BaseVisao(Scanner sc){
        super(sc);
    }
}
