package br.com.ada.petshop.repository;

import br.com.ada.petshop.modelo.Animal;

import java.util.Objects;

public class AnimalRepository {

    // count para controlar a posição dos animais cadastrados
    private static int count = 0;
    // array estatico, só havera esse array na memoria, ele será compartilhado entre os objetos
    private static Animal[] animaisCadastrados = new Animal[2];

    // contador estatico para atribuir os ids...
    private static int sequence = 1;

    public void cadastra(Animal animal){
        setId(animal);
        redimensionaArray();

        if (Objects.nonNull(animal) && Objects.nonNull(animal.getDono())) {
            animaisCadastrados[count] = animal;
            count++;
        } else {
            System.err.println("Animal nulo ou sem Dono!");
        }
    }

    private void setId(Animal animal) {
        animal.setId(sequence);
        animal.getDono().setId(sequence);
        animal.getDono().getEndereco().setId(sequence);
        sequence ++;
    }

    private void redimensionaArray() {
        // verifica se tem posicao livre
        boolean temPosicaoLivre = false;
        for (int i = 0; i < animaisCadastrados.length; i++) {
            if (Objects.isNull(animaisCadastrados[i])){
                temPosicaoLivre = true;
            }
        }

        // se não tem redimenciona o array
        if (! temPosicaoLivre){
            Animal[] animaisCadastrados2 = new Animal[animaisCadastrados.length + 1];
            for (int i = 0; i < animaisCadastrados.length; i++) {
                animaisCadastrados2[i] = animaisCadastrados[i];
            }
            animaisCadastrados = animaisCadastrados2;
        }
    }

    public void imprimeAnimaisCadastrados(){
        System.out.println("_____________ANIMAIS CADASTRADOS:_____________");
        boolean existeAnimalCadastrado = false;
        for (Animal animal: animaisCadastrados) {
            if (Objects.nonNull(animal)){
                existeAnimalCadastrado = true;
                System.out.println(animal);
            }
        }

        if (!existeAnimalCadastrado){
            System.out.println("_____________ZERO ANIMAIS CADASTRADOS_____________");
        }
    }

    public void limpaCadastro(){
        System.out.println("_____________LIMPANDO O CADASTRO______________");
        this.animaisCadastrados = new Animal[2];
        this.count = 0;
    }


}
