package br.com.ada.petshop.modelo.animais;

import br.com.ada.petshop.modelo.pessoa.Dono;

public class Coelho extends Animal implements Internavel{

    public Coelho(Dono dono){
        super(dono);
    }

    @Override
    public boolean estaDoente() {
        return true;
    }
}
