package Dominio;

public class Carro extends BaseIdentificador {
        
    private int ano;
    private String modelo;
    private String cor;
    private String fabricante;
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public Carro(int codigo) {
        super(codigo);
    }

    public Carro(int codigo, int ano, String modelo, 
        String cor, String fabricante){
            super(codigo);
            this.ano = ano;
            this.modelo = modelo;
            this.cor = cor;
            this.fabricante = fabricante;
    }
}
