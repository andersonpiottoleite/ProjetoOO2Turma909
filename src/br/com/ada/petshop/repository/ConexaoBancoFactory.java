package br.com.ada.petshop.repository;

public class ConexaoBancoFactory {

    //Será sempre uma conexão oracle?
    // nunca vai mudar, por exemplo para MySQL
    // podemos aplicar aqui o D do SOLID?
    // D - DIP - Dependency Inversion Principle - Principio de inversão de dependência ?
    private ConexaoOracle conexaoOracle;

    public ConexaoBancoFactory(){
        this.conexaoOracle = new ConexaoOracle();
    }

    public ConexaoOracle getConexao() {
        return conexaoOracle;
    }
}
