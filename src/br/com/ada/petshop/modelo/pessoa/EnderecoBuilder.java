package br.com.ada.petshop.modelo.pessoa;

public class EnderecoBuilder {

    private int id;

    private String rua;
    private String numero;
    private String cep;
    private String bairro;
    private String estado;

    public EnderecoBuilder id(int id) {
        this.id = id;
        return this;
    }

    public EnderecoBuilder rua(String rua) {
        this.rua = rua;
        return this;
    }

    public EnderecoBuilder numero(String numero) {
        this.numero = numero;
        return this;
    }

    public EnderecoBuilder cep(String cep) {
        this.cep = cep;
        return this;
    }

    public EnderecoBuilder bairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public EnderecoBuilder estado(String estado) {
        this.estado = estado;
        return this;
    }

    public Endereco build(){
        Endereco enderecoCriado = new Endereco(id,rua, numero, cep, bairro, estado);
        return enderecoCriado;
    }
}
