package br.com.ada.petshop.heranca;

public abstract class Ave { // classe abstrata (não pode ser instanciada), não pode ser instanciada

    // comportamento especifico de toda ave, toda ave anda
    public void andar(){
        System.out.println("ave andando...");
    }

    /* metodo asbtrato:
     - não tem corpo/implementação
     - a primeira classe concreta (não asbtract) será obrigada dar um corpo/implementar para esse metodo
     - ver isso acontecendo nas classes Papagaio, Sabia, Pinguim e BeijaFlor
     */
    public abstract void metodoAbstrato(String s); // não tem corpo
}
