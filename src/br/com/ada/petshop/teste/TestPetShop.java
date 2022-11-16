package br.com.ada.petshop.teste;

import br.com.ada.petshop.enumeracao.EnumRacaCachorro;
import br.com.ada.petshop.enumeracao.EnumRacaGato;
import br.com.ada.petshop.enumeracao.TipoAnimalEnum;
import br.com.ada.petshop.modelo.*;
import br.com.ada.petshop.repository.AnimalRepository;
import br.com.ada.petshop.businessobject.Internacoes;

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
        cachorro1.setRaca(EnumRacaCachorro.PASTOR_ALEMAO);
        cachorro1.setIdade(1);

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua dos limoes");
        endereco2.setNumero("100");
        endereco2.setBairro("Das Limoes");
        endereco2.setEstado("São Paulo");

        Dono dono2 = new Dono("Maria", endereco2);

        Cachorro cachorro2 = new Cachorro(dono2);
        cachorro2.setNome("Eddie");
        cachorro2.setRaca(EnumRacaCachorro.PIT_PULL);
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
        cachorro3.setRaca(EnumRacaCachorro.PASTOR_ALEMAO);
        cachorro3.setIdade(10);
        cachorro3.setEstaDoente(true);

        Cachorro cachorro4 = new Cachorro(dono3);
        cachorro4.setNome("Toro");
        cachorro4.setRaca(EnumRacaCachorro.VIRA_LATA);
        cachorro4.setIdade(10);
        cachorro4.setEstaDoente(true);
        cachorro4.setTipoAnimal(TipoAnimalEnum.CACHORRO);

        AnimalRepository repository1 = new AnimalRepository();
        repository1.cadastra(cachorro1);
        repository1.cadastra(cachorro2);
        repository1.cadastra(cachorro3);
        repository1.cadastra(cachorro4);

        repository1.imprimeAnimaisCadastrados();

        System.out.println("-----------CADASTRO DOS GATOS----------------");

        Gato gato = new Gato(dono3);
        gato.setNome("Zeus");
        gato.setIdade(8);
        gato.setRaca(EnumRacaGato.SIAMES);
        gato.setTipoAnimal(TipoAnimalEnum.GATO);

        Gato gato2 = new Gato(dono3);
        gato2.setNome("Nillo");
        gato2.setIdade(3);
        gato2.setRaca(EnumRacaGato.VIRA_LATA_JAPONES);
        gato2.setTipoAnimal(TipoAnimalEnum.GATO);

        repository1.cadastra(gato);
        repository1.cadastra(gato2);

        repository1.imprimeAnimaisCadastrados();

        Passaro passaro = new Passaro(dono3);
        passaro.setIdade(1);
        passaro.setTipoAnimal(TipoAnimalEnum.PASSARO);

        gato2.estaDoente();

        Coelho coelho = new Coelho(dono3);

        Internacoes internacoes  = new Internacoes();
        internacoes.internar(cachorro2);
        internacoes.internar(cachorro3);
        internacoes.internar(gato2);
        internacoes.internar(coelho);
        //internacoes.internar(passaro); //não é possivel,
        // pois pasaro não assinou o contrato de internavel, não implemento sua interface

        internacoes.mostraCachorrosInternados();

    }
}
