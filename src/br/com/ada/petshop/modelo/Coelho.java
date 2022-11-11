package br.com.ada.petshop.modelo;

public class Coelho extends Animal implements Internavel{

    public Coelho(Dono dono){
        super(dono);
    }

    @Override
    public boolean estaDoente() {
        return false;
    }
}
