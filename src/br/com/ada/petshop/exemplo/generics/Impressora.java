package br.com.ada.petshop.exemplo.generics;

import br.com.ada.petshop.modelo.Animal;
import br.com.ada.petshop.modelo.Pessoa;

import java.util.List;

// Convenção para o uso de Generics:
// <> -> operador diamante
// T -> Type
// E -> Element
// K -> Key
// V -> Value
// e mais...

public class Impressora<T> { // <T extends Animal> -> é possivel limitar o uso à classs filhas
    // de Animal, ou outra, basta trocar Animal pela classe desejada

    public void imprime(T t){
        System.out.println("########### IMPRIMINDO FOLHA ###########");
        System.out.println(t);
    }
}
