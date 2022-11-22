package br.com.ada.petshop.teste;

import br.com.ada.petshop.modelo.pessoa.Dono;
import br.com.ada.petshop.modelo.pessoa.Endereco;
import br.com.ada.petshop.modelo.pessoa.EnderecoBuilder;

public class TesteBuilder {

    public static void main(String[] args) {
        // construindo um objeto e populando ele via metodos set's
        Endereco endereco1 = new Endereco();
        endereco1.setId(1);
        endereco1.setNumero("8");
        endereco1.setRua("Eldorado");
        endereco1.setBairro("Rochdalle");
        endereco1.setEstado("São Paulo");
        endereco1.setCep("06226436");

        System.out.println(endereco1);

        // construindo um objeto e populando ele via construtor
        Endereco endereco2 = new Endereco("Eldorado", "8", "06226436", "Rochdalle", "São Paulo");

        System.out.println(endereco2);

        // criando um endereco via builder
        Endereco enderecoCriadoPeloBuilder = new EnderecoBuilder()
                .bairro("Rochdalle")
                .id(1)
                .estado("São Paulo")
                .rua("Eldorado")
                .cep("06226436")
                .numero("8")
                .build();

        new Dono("José", enderecoCriadoPeloBuilder);

        System.out.println(enderecoCriadoPeloBuilder);

    }
}
