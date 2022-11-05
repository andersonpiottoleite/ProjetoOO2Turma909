package br.com.ada.petshop.heranca;

import br.com.ada.petshop.modelo.Cachorro;

public class TesteHerancaPolimorfismo {

    public static void main(String[] args) {
        // usando polimorfismo, posso me referenciar a Papagaio como:
        // - Papagaio
        // - AvesQueVoam
        // - Aves
        AvesQueVoam papagaio = new Papagaio();
        papagaio.andar();
        papagaio.voando();
        //papagaio.falar();

        AvesQueVoam beijaFlor = new BeijaFlor();
        beijaFlor.andar();
        beijaFlor.voando();
        //beijaFlor.bicar();

        AvesQueVoam sabia = new Sabia();
        sabia.andar();
        sabia.voando();
        //sabia.assubiar();

        Pinguim pinguim = new Pinguim();
        pinguim.andar();

        RestaurarAsaAve restaurarAsaAve = new RestaurarAsaAve();
        // polimorfismo... posso passar qualquer objeto filho de Ave
        restaurarAsaAve.restauraAsaAve(papagaio);
        restaurarAsaAve.restauraAsaAve(beijaFlor);
        restaurarAsaAve.restauraAsaAve(sabia);
        restaurarAsaAve.restauraAsaAve(pinguim);

        CampeonatoAvesVoadoras campeonatoAvesVoadoras = new CampeonatoAvesVoadoras();
        // polimorfismo... posso passar qualquer objeto filho de AvesQueVoam
        campeonatoAvesVoadoras.largada(papagaio);
        campeonatoAvesVoadoras.largada(beijaFlor);
        campeonatoAvesVoadoras.largada(sabia);

        System.out.println("############### Testando sobrescrita #################");
        beijaFlor.voando();

    }
}
