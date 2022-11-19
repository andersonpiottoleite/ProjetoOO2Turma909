package br.com.ada.petshop.repository;

public class ConexaoMySQL implements Conexao{

    private String user = "adm";
    private String password = "123";
    private String urlDeConexao = "jdbc:mysql:thin:banco";

    @Override
    public String toString() {
        return "ConexaoMySQL{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", urlDeConexao='" + urlDeConexao + '\'' +
                '}';
    }
}
