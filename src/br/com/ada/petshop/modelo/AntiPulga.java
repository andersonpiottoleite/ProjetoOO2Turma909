package br.com.ada.petshop.modelo;

public class AntiPulga implements Produto{

    private String fornecedor;
    private String bula;

    @Override
    public String getFornecedor() {
        return this.fornecedor;
    }

    @Override
    public String getBula() {
        return this.bula;
    }
    @Override
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    @Override
    public void setBula(String bula) {
        this.bula = bula;
    }

    @Override
    public String toString() {
        return "AntiPulga{" +
                "fornecedor='" + fornecedor + '\'' +
                ", bula='" + bula + '\'' +
                '}';
    }
}
