package br.com.ada.petshop.repository;

public class ConexaoBancoFactory {

    //Ser� sempre uma conex�o oracle?
    // nunca vai mudar, por exemplo para MySQL
    // podemos aplicar aqui o D do SOLID?
    // D - DIP - Dependency Inversion Principle - Principio de invers�o de depend�ncia ?
    private Conexao conexao;

    // IC - Inversion Control = Invers�o de controle
    // recebendo a interface Conexao no construtor, ganhamos flexibilidade,
    // pois podemos receber qualquer conexao que implemente essa interface
    public ConexaoBancoFactory(Conexao conexao){
        //this.conexaoOracle = new ConexaoOracle(); // n�o precisamos carregar um instancia da interface de ConexaoOracle quando instanciarmos uma ConexaoBancoFactory
        this.conexao = conexao;
    }

    public ConexaoBancoFactory(){
    }

    public Conexao getConexao() {
        return conexao;
    }
}
