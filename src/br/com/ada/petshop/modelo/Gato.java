package br.com.ada.petshop.modelo;

import br.com.ada.petshop.enumeracao.EnumRacaCachorro;
import br.com.ada.petshop.enumeracao.EnumRacaGato;

public class Gato extends Animal{

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

    @Override
    public String toString() {
        return "Gato{" +
                "raca=" + raca +
                '}';
    }
}
