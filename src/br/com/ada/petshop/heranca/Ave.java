package br.com.ada.petshop.heranca;

public abstract class Ave { // classe abstrata (n�o pode ser instanciada), n�o pode ser instanciada

    // comportamento especifico de toda ave, toda ave anda
    public void andar(){
        System.out.println("ave andando...");
    }

    /* metodo asbtrato:
     - n�o tem corpo/implementa��o
     - a primeira classe concreta (n�o asbtract) ser� obrigada dar um corpo/implementar para esse metodo
     - ver isso acontecendo nas classes Papagaio, Sabia, Pinguim e BeijaFlor
     */
    public abstract void metodoAbstrato(String s); // n�o tem corpo
}
