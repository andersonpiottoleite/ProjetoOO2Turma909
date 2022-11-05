package br.com.ada.petshop.heranca;

public class Papagaio extends AvesQueVoam { // filha de AvesQueVoam, é uma AvesQueVoam

    public Papagaio(){
        System.out.println("chamando construtor do papagaio");
    }

    // particularidade e papagaio, faz sentido ficar aqui e não na classe pai
    public void falar(){
        System.out.println("Papagaio falando: Quero café");
    }
}
