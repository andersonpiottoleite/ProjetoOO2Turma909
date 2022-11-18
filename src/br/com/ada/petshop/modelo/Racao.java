package br.com.ada.petshop.modelo;

public class Racao implements Produto{

    private String fornecedor;

    @Override
    public String getFornecedor() {
        return this.fornecedor;
    }

    @Override
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String getBula() {
        return null; // sempre null, será que precisa desse metodo aqui?

        // Estamos quebrando o L do SOLID - LSP - Liskov Substitution Principle - Principio de substituição de Liskov ?
        // Podemos aplicar o I do SOLID?
        // I - ISP - Interface Segregation Principle - Principio da segregação de interface?
    }

    @Override
    public void setBula(String bula) {
        // faço nada?
    }

    @Override
    public String toString() {
        return "Racao{" +
                "fornecedor='" + fornecedor + '\'' +
                '}';
    }
}
