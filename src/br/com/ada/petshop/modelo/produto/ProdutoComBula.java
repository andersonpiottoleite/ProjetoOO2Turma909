package br.com.ada.petshop.modelo.produto;

// segregação de interface (I do SOLID)
public interface ProdutoComBula {

    String getFornecedor();

    void setFornecedor(String fornecedor);

    String getBula();

    void setBula(String bula);
}
