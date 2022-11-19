package br.com.ada.petshop.repository;

public class ConexaoPostgree implements Conexao{

    private String user = "adm";
    private String password = "123";
    private String urlDeConexao = "jdbc:postgree:thin:banco";

    @Override
    public String toString() {
        return "ConexaoPostgree{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", urlDeConexao='" + urlDeConexao + '\'' +
                '}';
    }
}
