package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Cachorro;

import java.util.Objects;

//TODO permitir cadastro de outros animais, como Gato, para isso poder ser usado o polimorfismo com a classe Animal
public class Internacoes {

    private Cachorro[] cachorrosInternados = new Cachorro[10];

    public void internar(Cachorro cachorro){
        for (int i = 0; i < cachorrosInternados.length; i++) {
            if(Objects.isNull(cachorrosInternados[i])){
                cachorrosInternados[i] = cachorro;
                break;
            }
        }
    }

    public void mostraCachorrosInternados(){
        System.out.println("-----------------DOGUINHOS DOENTES--------------------");
        for (Cachorro cachorro: cachorrosInternados) {
            if (Objects.nonNull(cachorro)) {
                System.out.println(cachorro);
            }
        }
    }

}
