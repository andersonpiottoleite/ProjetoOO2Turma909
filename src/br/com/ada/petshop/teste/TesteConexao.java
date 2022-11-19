package br.com.ada.petshop.teste;

import br.com.ada.petshop.repository.*;

public class TesteConexao {

    public static void main(String[] args) {
        ConexaoOracle conexaoOracle = new ConexaoOracle();
        ConexaoMySQL conexaoMySQL = new ConexaoMySQL();
        ConexaoPostgree conexaoPostgree = new ConexaoPostgree();
        //DI - Dependence Injection = Injeção de dependencia
        ConexaoBancoFactory bancoFactory = new ConexaoBancoFactory(conexaoOracle);
        Conexao conexao = bancoFactory.getConexao();
        System.out.println(conexao);
    }
}
