package br.com.ada.petshop.teste;

import br.com.ada.petshop.modelo.*;

import java.util.*;

public class TesteCollections {

    public static void main(String[] args) {
        /* COM ARRAY TEMOS A NECESSIDADE DE REDIMENCIONAMENTO

        Cachorro[] array = new Cachorro[10];

        for (int i = 0; i < 11; i++) {
            array[i] = criaCachorro();
        }*/

        // Con List (que é uma Collection) podemos trabalhar com coleções de forma dinamica
        List<Cachorro> listaCachorro = new LinkedList<>();

        // metodo add, adiciona cachorro
        listaCachorro.add(criaCachorro());
        listaCachorro.add(criaCachorro());
        listaCachorro.add(criaCachorro());

        for (Cachorro dog: listaCachorro) {
            System.out.println(dog);
        }

        for (int i = 0; i < 100; i++) {
            listaCachorro.add(criaCachorro());
        }

        // metodo size ve a quantide de cachorros inseridos
        System.out.println(listaCachorro.size());

        for (int i = 0; i < 1000; i++) {
            listaCachorro.add(criaCachorro());
        }

        System.out.println(listaCachorro.size());

        // metodo isEmpty ve se a lista esta vazia
        System.out.println(listaCachorro.isEmpty());

        // metodo get obtem um objeto por seu indice (posicao)
        Cachorro cachorro = listaCachorro.get(5);
        System.out.println(cachorro);


        // metodo remove deleta um objeto por seu indice (posicao)
        listaCachorro.remove(5);
        System.out.println(listaCachorro.size());

        for (int i = 0; i < 150; i++) {
            listaCachorro.add(criaCachorro());
        }

        // list permite objetos repetidos
        List<String> listS = new ArrayList();
        listS.add("Palavra 1");
        listS.add("Palavra 1");
        listS.add("Palavra 1");

        for (String s: listS) {
            System.out.println(s);
        }

        // set NÃO permite objetos repetidos
        Set<String> setS = new HashSet<>();
        boolean adicionouOPrimeiro = setS.add("Palavra 2");
        boolean adicionouOSegundo = setS.add("Palavra 2");
        boolean adicionouOTerceiro = setS.add("Palavra 2");

        if (setS.add("Palavra 2")){
            System.out.println("Adicionou");
        } else {
            System.out.println("Não adicionou");
        }

        System.out.println(adicionouOPrimeiro);
        System.out.println(adicionouOSegundo);
        System.out.println(adicionouOTerceiro);

        for (String s: setS) {
            System.out.println(s);
        }

        System.out.println(listS.size());

        // metodo clear limpa a lista
        listS.clear();
        System.out.println(listS.size());

        System.out.println(setS.contains("Palavra 4"));

        Set<ClasseTeste> setClasseTeste = new HashSet<>();

        ClasseTeste classeTeste = new ClasseTeste();
        classeTeste.setId(1);
        classeTeste.setName("Teste 1");

        setClasseTeste.add(classeTeste);

        ClasseTeste classeTeste2 = new ClasseTeste();
        classeTeste2.setId(1);
        classeTeste2.setName("Teste 2");

        setClasseTeste.add(classeTeste2);

        System.out.println(setClasseTeste.size());

        //System.out.println(setClasseTeste.contains(classeTeste2));

        List<Cachorro> l = new ArrayList<>();
        Map<Integer, String> mapCaes = new HashMap<>();

        mapCaes.put(classeTeste2.getId(), "Meu objeto 1");
        mapCaes.put(2, "Meu objeto 2");

        System.out.println(mapCaes);

        mapCaes.put(2, "Meu objeto 3");

        System.out.println(mapCaes);

        String retorno = mapCaes.get(2);
        System.out.println(retorno);

        Map<Integer, Cachorro> mapCaes2 = new HashMap<>();

        Cachorro cachorro1 = criaCachorro();
        Cachorro cachorro2 = criaCachorro();

        mapCaes2.put(classeTeste2.getId(), cachorro1);
        mapCaes2.put(-10, cachorro2);
    }


    public static Cachorro criaCachorro(){
        Endereco endereco = new Endereco();
        Dono dono = new Dono("jose", endereco);
        Cachorro cachorro = new Cachorro(dono);
        return cachorro;
    }
}


class ClasseTeste {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object outro) {
        if(! (outro instanceof ClasseTeste)){
            return false;
        }
        ClasseTeste outroTeste = (ClasseTeste) outro;
        return this.getName().equals(outroTeste.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public List getList(){
        return new ArrayList();
        //return new LinkedList();
    }
}
