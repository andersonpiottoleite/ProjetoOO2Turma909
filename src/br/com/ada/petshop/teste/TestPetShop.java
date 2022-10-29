package br.com.ada.petshop.teste;

import br.com.ada.petshop.businessobject.Internacoes;
import br.com.ada.petshop.modelo.Cachorro;

public class TestPetShop {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Doguinho");

        Cachorro cachorro0 = new Cachorro("Doguinho 2", -200);

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Cacau");
        cachorro1.setRaca("Vira lata caramelo");
        cachorro1.setIdade(1);

        //System.out.println("Idade do " + cachorro1.getNome()+ " e " + cachorro1.getIdade());

        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("Spike");
        cachorro2.setRaca("PitBull");
        cachorro2.setIdade(15);
        cachorro2.setEstaDoente(true);

        Cachorro cachorro3 = new Cachorro();
        cachorro3.setNome("Bob");
        cachorro3.setRaca("Pastor Alemao");
        cachorro3.setIdade(10);
        cachorro3.setEstaDoente(true);

        //System.out.println("Idade do " + cachorro2.getNome()+ " e " + cachorro2.getIdade());

        //System.out.println("-------------------------------------");

        /*System.out.println(cachorro);
        System.out.println(cachorro0);
        System.out.println(cachorro1);
        System.out.println(cachorro2);
        System.out.println(cachorro3);*/

        Internacoes internacoes  = new Internacoes();
        internacoes.internar(cachorro2);
        internacoes.internar(cachorro3);

        internacoes.mostraCachorrosInternados();

    }

}
