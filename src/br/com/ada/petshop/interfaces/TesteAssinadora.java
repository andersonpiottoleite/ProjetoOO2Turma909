package br.com.ada.petshop.interfaces;

public class TesteAssinadora {

    public static void main(String[] args) {
        Assinadora assinadora = new Assinadora();
        assinadora.clausula4("a", 1);

        // podemos usar polimorfismo, se referindo a Contrato, uma vez que Assinadora implementa a interface Contrato
        Contrato assinadora2 = new Assinadora();
        assinadora2.clausula4("a", 1);


        // podemos usar polimorfismo, se referindo a AditivoDeContrato, uma vez que Assinadora tbm implementa a interface AditivoDeContrato
        AditivoDeContrato assinadora3 = new Assinadora();
        assinadora3.novaClausulaDoAditivo();

        // podemos usar polimorfismo, se referindo a UltimoAditivoContrato, uma vez que Assinadora tbm implementa a interface UltimoAditivoContrato
        UltimoAditivoContrato assinadora4 = new Assinadora();
        assinadora4.ultimaClausulaEuPrometo();

    }
}
