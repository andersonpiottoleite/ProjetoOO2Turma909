package br.com.ada.petshop.heranca;

public class RestaurarAsaAve {

    // posso passar qualquer objeto que seja filho de Ave...
    // aqui posso passar um Papagaio, um Pinguim, um Sabia, etc. Isso é polimorfismo
    public void restauraAsaAve(Ave ave){
        System.out.println("Restaurando asa da ave");
    }

}
