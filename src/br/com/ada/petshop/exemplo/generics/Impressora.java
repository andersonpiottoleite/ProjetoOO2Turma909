package br.com.ada.petshop.exemplo.generics;

// Conven��o para o uso de Generics:
// <> -> operador diamante
// T -> Type
// E -> Element
// K -> Key
// V -> Value
// e mais...

public class Impressora<T> { // <T extends Animal> -> � possivel limitar o uso � classs filhas
    // de Animal, ou outra, basta trocar Animal pela classe desejada

    public void imprime(T t){
        System.out.println("########### IMPRIMINDO FOLHA ###########");
        System.out.println(t);
    }

    public static<T> void metodo2(T t){
        System.out.println("Usando metodo estatico: "+t);
    }
}
