package br.com.ada.petshop.modelo.animais;

import br.com.ada.petshop.enumeracao.EnumRacaCachorro;
import br.com.ada.petshop.modelo.pessoa.Dono;

/**
 * Java doc:
 *
 *  Essa classe representa um cachorro
 * @author Anderson Piotto
 * @since 18/11/2022
 * @version 1.0.0
 *
 */
public class Cachorro extends Animal implements Internavel{

    private boolean estaDoente;

    private EnumRacaCachorro raca;


    public Cachorro(Dono dono){
        super(dono);
    }

    /** obtem a raca
     *
     * @return EnumRacaCachorro raca
     */
    public EnumRacaCachorro getRaca() {
        return raca;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public void setRaca(EnumRacaCachorro raca) {
        this.raca = raca;
    }

    public String toString() {
        return "Cachorro: " +
                "raca=" + raca +
                super.toString();
    }

    @Override
    public boolean estaDoente() {
        return this.estaDoente;
    }
}
