package br.com.ada.petshop.modelo.animais;

public interface Internavel {

    boolean estaDoente();

    /* a partir do java 8, surgiu esse metodo default, que possui corpo
      e portanto n�o precisa ser implemtado nas classes que implementam a interface
      isso � util para quando voc� deseja inserir um comportamento na interface e n�o que obrigar as classes a
      fazerem  implementa��o ;)
     */
    default void metodo(){
        System.out.println("Chamando o metodo default");
    }
}
