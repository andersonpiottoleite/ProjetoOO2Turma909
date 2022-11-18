package br.com.ada.petshop.teste;

import br.com.ada.petshop.repository.ConexaoBancoFactory;
import br.com.ada.petshop.repository.ConexaoOracle;

public class TesteConexao {

    public static void main(String[] args) {
        ConexaoBancoFactory bancoFactory = new ConexaoBancoFactory();
        ConexaoOracle conexao = bancoFactory.getConexao();
    }
}
