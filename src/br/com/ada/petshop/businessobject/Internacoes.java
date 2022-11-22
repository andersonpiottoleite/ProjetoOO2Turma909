package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.exceptions.InternacaoException;
import br.com.ada.petshop.modelo.animais.Internavel;

import java.util.HashSet;
import java.util.Set;

// TODO permitir cadastro de outros animais, como Gato, para isso poder ser usado o polimorfismo com a classe Animal
public class Internacoes {

    private final int NUMERO_MAXIMO_VAGAS = 6;

    private Set<Internavel> animaisInternados = new HashSet<>();

    public void internar(Internavel internavel) throws InternacaoException {
        if (!internavel.estaDoente()){
            throw new InternacaoException("É permitido internar somente animais doentes");
        }
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
