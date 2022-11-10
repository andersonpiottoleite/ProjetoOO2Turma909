package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Animal;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// TODO permitir cadastro de outros animais, como Gato, para isso poder ser usado o polimorfismo com a classe Animal
public class Internacoes {

    private final int NUMERO_MAXIMO_VAGAS = 2;

    private Set<Animal> animaisInternados = new HashSet<>();

    public void internar(Animal animal){
        if (animaisInternados.size() < NUMERO_MAXIMO_VAGAS) {
            animaisInternados.add(animal);
        } else{
            System.err.println("Não há vagas");
        }
    }

    public void mostraCachorrosInternados(){
        System.out.println("-----------------DOGUINHOS DOENTES--------------------");
        for (Animal animal: animaisInternados) {
            System.out.println(animal);
        }
    }

}
