package br.com.ada.petshop.teste;

import br.com.ada.petshop.modelo.produto.AntiPulga;
import br.com.ada.petshop.modelo.produto.ProdutoComBula;
import br.com.ada.petshop.modelo.produto.ProdutoSemBula;
import br.com.ada.petshop.modelo.produto.Racao;

public class TesteProdutos {

    public static void main(String[] args) {
        ProdutoSemBula racao = new Racao();
        racao.setFornecedor("Pedigree");
        //racao.setBula("Bula da ra��o"); // null? Ser� que precisa desse metodo setBula em racao ?
        //racao.getBula();
        // aplicando o principio da segrega��o de interface, n�o temos mais metodos sem sentido em ra��o, como getBula e setBula

        System.out.println(racao);

        ProdutoComBula antiPulga = new AntiPulga();
        antiPulga.setFornecedor("Bayer");
        antiPulga.setBula("Esse medicamente � contra indicado em casos de ...");

        System.out.println(antiPulga);
    }
}
