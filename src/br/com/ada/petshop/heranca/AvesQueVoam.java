package br.com.ada.petshop.heranca;

public abstract class AvesQueVoam extends Ave{ // classe abstrata (não pode ser instanciada), filha de Ave, é uma Ave


    // comportamentos especificos de aves que voam, toda ave que voa, tem altitude  anda
    private int autitude;

    public AvesQueVoam(){
        System.out.println("chamando construtor da Ave");
    }

    public void voando(){
        System.out.println("Voando....");
    }

    public int getAutitude() {
        return autitude;
    }

    public void setAutitude(int autitude) {
        this.autitude = autitude;
    }
}
