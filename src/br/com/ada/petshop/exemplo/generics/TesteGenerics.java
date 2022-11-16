package br.com.ada.petshop.exemplo.generics;

import br.com.ada.petshop.modelo.Animal;
import br.com.ada.petshop.modelo.Cachorro;
import br.com.ada.petshop.modelo.Dono;
import br.com.ada.petshop.modelo.Endereco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteGenerics {

    public static void main(String[] args) {
        List lista = new ArrayList<>();

        lista.add("Palavra");
        lista.add(new Integer(10));
        lista.add(new Double(10.0));

        Object objeto1 = lista.get(0);
        Object objeto2 = lista.get(1);
        Object objeto3 = lista.get(2);

        /*String agoraSimUmaString = (String) objeto1;
        agoraSimUmaString = agoraSimUmaString.replace("a", "*");
        System.out.println(agoraSimUmaString);

        Integer agoraSimUmaInteger = (Integer) objeto2;
        System.out.println(agoraSimUmaInteger);

        Double agoraSimUmaDouble = (Double) objeto3;
        System.out.println(agoraSimUmaDouble);*/

        if (objeto2 instanceof String){
            String agoraSimUmaString = (String) objeto2;
            agoraSimUmaString = agoraSimUmaString.replace("a", "*");
            System.out.println(agoraSimUmaString);

        } else if (objeto2 instanceof Integer){
            Integer agoraSimUmaInteger = (Integer) objeto2;
            System.out.println(agoraSimUmaInteger);

        } else if (objeto2 instanceof Double){
            Double agoraSimUmaDouble = (Double) objeto2;
            System.out.println(agoraSimUmaDouble);
        }

        List<String> lista2 = new ArrayList<>();
        lista2.add("palavra");
        lista2.add("outra palavra");
        lista2.add( "sou seu camarada coloco só strings");

        percorreListaEFazCastString(lista2);

        List<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(new Cachorro(new Dono("Jose", new Endereco())));
        System.out.println(cachorros.size());
        System.out.println(cachorros.get(0));

        Map<Integer, Animal> map = new HashMap<>();
        map.put(1, new Cachorro(new Dono("Jose", new Endereco())));
        Animal objetoRecuperado = map.get(1);
        System.out.println(objetoRecuperado);
        System.out.println(map);

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "palavra 1");
        map2.put(2, "palavra 2 ");
        System.out.println(map2);

    }

    private static void percorreListaEFazCastString(List<String> lista){
      for (String obj: lista){
          System.out.println(obj.toUpperCase());
      }
    }
}
