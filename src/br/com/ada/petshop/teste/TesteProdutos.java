package br.com.ada.petshop.teste;

import br.com.ada.petshop.modelo.AntiPulga;
import br.com.ada.petshop.modelo.Produto;
import br.com.ada.petshop.modelo.Racao;

public class TesteProdutos {

    public static void main(String[] args) {
        Racao racao = new Racao();
        racao.setFornecedor("Pedigree");
        racao.setBula(null); // null? Será que precisa desse metodo setBula em racao ?

        System.out.println(racao);

        AntiPulga antiPulga = new AntiPulga();
        antiPulga.setFornecedor("Bayer");
        antiPulga.setBula("Esse medicamente é contra indicado em casos de ...");

        System.out.println(antiPulga);
    }
}
