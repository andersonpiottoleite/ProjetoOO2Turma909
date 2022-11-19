package br.com.ada.petshop.teste;

import br.com.ada.petshop.modelo.AntiPulga;
import br.com.ada.petshop.modelo.Produto;
import br.com.ada.petshop.modelo.Racao;

public class TesteProdutos {

    public static void main(String[] args) {
        Produto racao = new Racao();
        racao.setFornecedor("Pedigree");
        racao.setBula("Bula da ração"); // null? Será que precisa desse metodo setBula em racao ?
        racao.getBula();

        System.out.println(racao);

        Produto antiPulga = new AntiPulga();
        antiPulga.setFornecedor("Bayer");
        antiPulga.setBula("Esse medicamente é contra indicado em casos de ...");

        System.out.println(antiPulga);
    }
}
