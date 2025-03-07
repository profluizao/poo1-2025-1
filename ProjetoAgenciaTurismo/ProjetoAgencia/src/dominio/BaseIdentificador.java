package dominio;

public abstract class BaseIdentificador {
    protected long codigo;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public BaseIdentificador(long codigo) {
        this.codigo = codigo;
    }

}