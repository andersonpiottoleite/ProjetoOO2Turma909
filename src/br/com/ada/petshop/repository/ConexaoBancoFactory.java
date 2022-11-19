package br.com.ada.petshop.repository;

public class ConexaoBancoFactory {

    //Será sempre uma conexão oracle?
    // nunca vai mudar, por exemplo para MySQL
    // podemos aplicar aqui o D do SOLID?
    // D - DIP - Dependency Inversion Principle - Principio de inversão de dependência ?
    private Conexao conexao;

    // IC - Inversion Control = Inversão de controle
    // recebendo a interface Conexao no construtor, ganhamos flexibilidade,
    // pois podemos receber qualquer conexao que implemente essa interface
    public ConexaoBancoFactory(Conexao conexao){
        //this.conexaoOracle = new ConexaoOracle(); // não precisamos carregar um instancia da interface de ConexaoOracle quando instanciarmos uma ConexaoBancoFactory
        this.conexao = conexao;
    }

    public ConexaoBancoFactory(){
    }

    public Conexao getConexao() {
        return conexao;
    }
}
