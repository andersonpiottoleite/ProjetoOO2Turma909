package br.com.ada.petshop.modelo.produto;

// segregação de interface (I do SOLID)
public interface ProdutoSemBula {

    String getFornecedor();

    void setFornecedor(String fornecedor);
}
