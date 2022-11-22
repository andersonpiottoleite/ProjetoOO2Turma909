package br.com.ada.petshop.modelo.animais;

public interface Internavel {

    boolean estaDoente();

    /* a partir do java 8, surgiu esse metodo default, que possui corpo
      e portanto não precisa ser implemtado nas classes que implementam a interface
      isso é util para quando você deseja inserir um comportamento na interface e não que obrigar as classes a
      fazerem  implementação ;)
     */
    default void metodo(){
        System.out.println("Chamando o metodo default");
    }
}
