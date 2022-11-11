package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Animal;
import br.com.ada.petshop.modelo.Cachorro;
import br.com.ada.petshop.modelo.Gato;
import br.com.ada.petshop.modelo.Internavel;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// TODO permitir cadastro de outros animais, como Gato, para isso poder ser usado o polimorfismo com a classe Animal
public class Internacoes {

    private final int NUMERO_MAXIMO_VAGAS = 6;

    private Set<Internavel> animaisInternados = new HashSet<>();

    public void internar(Internavel internavel){
        if (animaisInternados.size() < NUMERO_MAXIMO_VAGAS) {
            animaisInternados.add(internavel);
        } else{
            System.err.println("Não há vagas");
        }
    }

    public void mostraCachorrosInternados(){
        System.out.println("-----------------DOGUINHOS DOENTES--------------------");
        for (Internavel internavel: animaisInternados) {
            System.out.println(internavel);
        }
    }

}
