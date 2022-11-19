package br.com.ada.petshop.modelo;

public class Racao implements ProdutoSemBula {

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
    public String toString() {
        return "Racao{" +
                "fornecedor='" + fornecedor + '\'' +
                '}';
    }
}
