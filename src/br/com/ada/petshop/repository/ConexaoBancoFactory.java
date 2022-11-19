package br.com.ada.petshop.repository;

public class ConexaoBancoFactory {

    //Será sempre uma conexão oracle?
    // nunca vai mudar, por exemplo para MySQL
    // podemos aplicar aqui o D do SOLID?
    // D - DIP - Dependency Inversion Principle - Principio de inversão de dependência ?
    private Conexao conexao;

    // IC - Inversion Control = Inversão de controle
    public ConexaoBancoFactory(Conexao conexao){
        //this.conexaoOracle = new ConexaoOracle();
        this.conexao = conexao;
    }

    public ConexaoBancoFactory(){
    }

    public Conexao getConexao() {
        return conexao;
    }
}
