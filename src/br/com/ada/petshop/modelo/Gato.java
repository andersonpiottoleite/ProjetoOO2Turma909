package br.com.ada.petshop.modelo;

import br.com.ada.petshop.enumeracao.EnumRacaCachorro;
import br.com.ada.petshop.enumeracao.EnumRacaGato;

public class Gato extends Animal implements Internavel{

    private boolean estaDoente;

    private EnumRacaGato raca;

    public Gato(Dono dono){
        super(dono);
    }

    public EnumRacaGato getRaca() {
        return raca;
    }

    public void setRaca(EnumRacaGato raca) {
        this.raca = raca;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    @Override
    public boolean estaDoente() {
        return this.estaDoente;
    }

    @Override
    public String toString() {
        return "Gato: " +
                "raca=" + raca +
                super.toString();
    }
}
