package br.com.ada.petshop.repository;

public class ConexaoBancoFactory {

    //Ser� sempre uma conex�o oracle?
    // nunca vai mudar, por exemplo para MySQL
    // podemos aplicar aqui o D do SOLID?
    // D - DIP - Dependency Inversion Principle - Principio de invers�o de depend�ncia ?
    private Conexao conexao;

    // IC - Inversion Control = Invers�o de controle
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
