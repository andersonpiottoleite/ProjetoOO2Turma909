package br.com.ada.petshop.repository;

public class ConexaoBancoFactory {

    //Ser� sempre uma conex�o oracle?
    // nunca vai mudar, por exemplo para MySQL
    // podemos aplicar aqui o D do SOLID?
    // D - DIP - Dependency Inversion Principle - Principio de invers�o de depend�ncia ?
    private ConexaoOracle conexaoOracle;

    public ConexaoBancoFactory(){
        this.conexaoOracle = new ConexaoOracle();
    }

    public ConexaoOracle getConexao() {
        return conexaoOracle;
    }
}
