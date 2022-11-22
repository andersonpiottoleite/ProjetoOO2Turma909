package br.com.ada.petshop.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteRemove {
    public static void main(String[] args) {
        Teste t1 = new Teste(1, "teste 1");
        Teste t2 = new Teste(2, "teste 2");

        List<Teste> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);

        System.out.println(list);

        System.out.println("Digite a opção...");

        Scanner s = new Scanner(System.in);

        Integer indice = s.nextInt();

        list.remove(indice.intValue());

        System.out.println(list);
    }
}

class Teste{
    private Integer id;
    private String name;

    public Teste(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teste{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
