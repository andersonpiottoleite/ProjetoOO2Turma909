package br.com.ada.petshop.maroto;


import java.util.ArrayList;
import java.util.List;

public class TesteBuscaNome {

    public static void main(String[] args) {

        Teste t1 = new Teste("nome1");
        Teste t2 = new Teste("nome2");

        List<Teste> l = new ArrayList<>();
        l.add(t1);
        l.add(t2);

        Teste testeEncontrado = buscaPorNome("nome3", l);
        System.out.println(testeEncontrado);
    }

    private static Teste buscaPorNome(String nome, List<Teste> lista){
        for (Teste t : lista){
            if (nome.equals(t.getNome())){
                return t;
            }
        }
        System.out.println("Nome não encontrado: " + nome);
        return null;
    }
}

class Teste{
    private String nome;

    public Teste(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Teste{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
