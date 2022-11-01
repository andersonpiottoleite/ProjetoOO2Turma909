package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Cachorro;

import java.util.Objects;

public class CachorroRepository {

    // count para controlar a posição dos cachorros cadastrados
    private int count = 0;
    private Cachorro[] cachorrosCadastrados = new Cachorro[2];

    public void cadastra(Cachorro cachorro){

        redimensionaArray();

        if (Objects.nonNull(cachorro) && Objects.nonNull(cachorro.getDono())) {
            cachorrosCadastrados[count] = cachorro;
            count++;
        } else {
            System.err.println("Cachorro null ou sem Dono!");
        }
    }

    private void redimensionaArray() {
        // verifica se tem posicao livre
        boolean temPosicaoLivre = false;
        for (int i = 0; i < cachorrosCadastrados.length; i++) {
            if (Objects.isNull(cachorrosCadastrados[i])){
                temPosicaoLivre = true;
            }
        }

        // se não tem redimenciona o array
        if (! temPosicaoLivre){
            Cachorro[] cachorrosCadastrados2 = new Cachorro[cachorrosCadastrados.length + 1];
            for (int i = 0; i < cachorrosCadastrados.length; i++) {
                cachorrosCadastrados2[i] = cachorrosCadastrados[i];
            }
            cachorrosCadastrados = cachorrosCadastrados2;
        }
    }

    public void imprimeCachorrosCadastrados(){
        System.out.println("_____________DOGS CADASTRADOS:_____________");
        boolean existeCaoCadastrado = false;
        for (Cachorro cachorro: cachorrosCadastrados) {
            if (Objects.nonNull(cachorro)){
                existeCaoCadastrado = true;
                System.out.println(cachorro);
            }
        }

        if (!existeCaoCadastrado){
            System.out.println("_____________ZERO CAES CADASTRADOS_____________");
        }
    }

    public void limpaCadastro(){
        System.out.println("_____________LIMPANDO O CADASTRO______________");
        this.cachorrosCadastrados = new Cachorro[2];
        this.count = 0;
    }


}
