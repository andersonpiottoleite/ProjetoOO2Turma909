package br.com.ada.petshop.teste;

import br.com.ada.petshop.businessobject.CachorroRepository;
import br.com.ada.petshop.businessobject.Internacoes;
import br.com.ada.petshop.modelo.Cachorro;
import br.com.ada.petshop.modelo.Dono;
import br.com.ada.petshop.modelo.Endereco;

import java.time.LocalDate;
import java.util.Scanner;

public class TestPetShop{

    public static void main(String[] args){
        /* criando/instanciando objetos e pegando o endere?o deles na memoria
        esse endere?o ? atributo a variavel
        estamos usando varios construtores para isso*/

        Endereco endereco = new Endereco();
        endereco.setRua("Rua das laranjeiras");
        endereco.setNumero("10");
        endereco.setBairro("Das Laranjas");
        endereco.setEstado("São Paulo");

        Dono dono1 = new Dono("Caterine", endereco);

        Cachorro cachorro1 = new Cachorro(dono1);
        cachorro1.setNome("Cacau");
        cachorro1.setRaca("Vira lata caramelo");
        cachorro1.setIdade(1);

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua dos limoes");
        endereco2.setNumero("100");
        endereco2.setBairro("Das Limoes");
        endereco2.setEstado("São Paulo");

        Dono dono2 = new Dono("Maria", endereco2);

        Cachorro cachorro2 = new Cachorro(dono2);
        cachorro2.setNome("Eddie");
        cachorro2.setRaca("Caramelo");
        cachorro2.setIdade(15);
        cachorro2.setEstaDoente(true);

        Endereco endereco3 = new Endereco();
        endereco3.setRua("Rua das Mexiricas");
        endereco3.setNumero("105");
        endereco3.setBairro("Das Mexiricas");
        endereco3.setEstado("São Paulo");

        Dono dono3 = new Dono("Paula", endereco3);

        Cachorro cachorro3 = new Cachorro(dono3);
        cachorro3.setNome("Bob");
        cachorro3.setRaca("Pastor Alemao");
        cachorro3.setIdade(10);
        cachorro3.setEstaDoente(true);

        Cachorro cachorro4 = new Cachorro(dono3);
        cachorro4.setNome("Toro");
        cachorro4.setRaca("Rotwhaer");
        cachorro4.setIdade(10);
        cachorro4.setEstaDoente(true);

        CachorroRepository repository1 = new CachorroRepository();
        repository1.cadastra(cachorro1);
        repository1.cadastra(cachorro2);
        repository1.cadastra(cachorro3);
        repository1.cadastra(cachorro4);

        repository1.imprimeCachorrosCadastrados();

        Internacoes internacoes  = new Internacoes();
        internacoes.internar(cachorro2);
        internacoes.internar(cachorro3);

        internacoes.mostraCachorrosInternados();
    }
}
