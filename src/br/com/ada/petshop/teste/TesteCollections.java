package br.com.ada.petshop.teste;

import br.com.ada.petshop.modelo.Cachorro;
import br.com.ada.petshop.modelo.Dono;
import br.com.ada.petshop.modelo.Endereco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteCollections {

    public static void main(String[] args) {
        /* COM ARRAY TEMOS A NECESSIDADE DE REDIMENCIONAMENTO

        Cachorro[] array = new Cachorro[10];

        for (int i = 0; i < 11; i++) {
            array[i] = criaCachorro();
        }*/

        // Con List (que é uma Collection) podemos trabalhar com coleções de forma dinamica
        List<Cachorro> listaCachorro = new ArrayList();

        // metodo add, adiciona cachorro
        listaCachorro.add(criaCachorro());
        listaCachorro.add(criaCachorro());
        listaCachorro.add(criaCachorro());

        for (Cachorro dog: listaCachorro) {
            System.out.println(dog);
        }

        for (int i = 0; i < 100; i++) {
            listaCachorro.add(criaCachorro());
        }

        // metodo size ve a quantide de cachorros inseridos
        System.out.println(listaCachorro.size());

        for (int i = 0; i < 1000; i++) {
            listaCachorro.add(criaCachorro());
        }

        System.out.println(listaCachorro.size());

        // metodo isEmpty ve se a lista esta vazia
        System.out.println(listaCachorro.isEmpty());

        // metodo get obtem um objeto por seu indice (posicao)
        Cachorro cachorro = listaCachorro.get(5);
        System.out.println(cachorro);


        // metodo remove deleta um objeto por seu indice (posicao)
        listaCachorro.remove(5);
        System.out.println(listaCachorro.size());

        for (int i = 0; i < 150; i++) {
            listaCachorro.add(criaCachorro());
        }

        // list permite objetos repetidos
        List<String> listS = new ArrayList();
        listS.add("Palavra 1");
        listS.add("Palavra 1");
        listS.add("Palavra 1");

        for (String s: listS) {
            System.out.println(s);
        }

        // set NÃO permite objetos repetidos
        Set<String> setS = new HashSet<>();
        boolean adicionouOPrimeiro = setS.add("Palavra 2");
        boolean adicionouOSegundo = setS.add("Palavra 2");
        boolean adicionouOTerceiro = setS.add("Palavra 2");

        System.out.println(adicionouOPrimeiro);
        System.out.println(adicionouOSegundo);
        System.out.println(adicionouOTerceiro);

        for (String s: setS) {
            System.out.println(s);
        }

        System.out.println(listS.size());

        // metodo clear limpa a lista
        listS.clear();
        System.out.println(listS.size());
    }


    public static Cachorro criaCachorro(){
        Endereco endereco = new Endereco();
        Dono dono = new Dono("jose", endereco);
        Cachorro cachorro = new Cachorro(dono);
        return cachorro;
    }
}
