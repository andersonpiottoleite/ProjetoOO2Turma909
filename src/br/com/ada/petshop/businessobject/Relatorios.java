package br.com.ada.petshop.businessobject;

import java.util.List;

public class Relatorios <T> {

    public void geraRelatorioUnico(T t){
        System.out.println("####### GERANDO RELATORIO INDIVIDUAL #######");
        System.out.println(t);
    }

    public void geraRelatorioEmGrupo(List<T> lista){
        System.out.println("####### GERANDO RELATORIO EM GRUPO #######");
        for (T t:lista){
            System.out.println(t);
        }
    }

    public static<T> void metodo(T t){
        System.out.println("Imprimindo do metodo estatico");
        System.out.println(t);
    }

}
