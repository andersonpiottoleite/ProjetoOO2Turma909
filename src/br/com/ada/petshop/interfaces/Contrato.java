package br.com.ada.petshop.interfaces;

// interfaces s�o um contrato, quem assina (implements) deve fornecer a implementa��o dos metodos que n�o tem corpo (abstratos)
public interface Contrato {

    // metodo abstrato, n�o tem corpo, devera ser implementado por quem assinar a interface (contrato)
    void clausula1();

    void clausula2();

    int clausula3();

    boolean clausula4(String s);

    boolean clausula4(String s, int numero);


    String getAssinatura();

    int getAtributo();
}
