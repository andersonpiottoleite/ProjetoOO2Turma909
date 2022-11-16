package br.com.ada.petshop.exemplo.generics;

import br.com.ada.petshop.interfaces.Assinadora;
import br.com.ada.petshop.modelo.*;

import java.util.ArrayList;
import java.util.List;

public class TesteImpressora {

    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        String folha = "conteudo da folha";
        impressora.imprime(folha);
        impressora.imprime(20000);
        impressora.imprime(true);
        impressora.imprime(10.0);

        Impressora<String> impressoraSoDeTexto = new Impressora<>();
        impressoraSoDeTexto.imprime("Novo Texto");

        Impressora<Integer> impressoraSoDeNumeros = new Impressora<>();
        impressoraSoDeNumeros.imprime(2500);
    }
}
