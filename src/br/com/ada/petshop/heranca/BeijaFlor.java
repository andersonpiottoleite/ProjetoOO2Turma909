package br.com.ada.petshop.heranca;

public class BeijaFlor extends AvesQueVoam{ // filha de AvesQueVoam, é uma AvesQueVoam

    // particularidade e beija flor, faz sentido ficar aqui e não na classe pai
    public void bicar(){
        System.out.println("Beija flor bicando");
    }

    @Override // sobrescrevendo comportamento do metodo "voando" da classe pai AvesQueVoam
    public void voando(){
        System.out.println("Voando modo beija flor....");
    }

    @Override
    public void metodoAbstrato(String s) {

    }
}
