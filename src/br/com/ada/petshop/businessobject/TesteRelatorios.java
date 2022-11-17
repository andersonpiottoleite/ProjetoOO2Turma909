package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.*;

import java.util.ArrayList;
import java.util.List;

public class TesteRelatorios {

    public static void main(String[] args) {

        Atendente atendente = new Atendente("Pedro", new Endereco());

        Dono dono = new Dono("João", new Endereco());
        Cachorro cachorro = new Cachorro(dono);
        cachorro.setNome("Bob");

        Gato gato = new Gato(dono);
        gato.setNome("Bob");

        Relatorios<Animal> relatoriosAnimais = new Relatorios();

        relatoriosAnimais.geraRelatorioUnico(cachorro);

        List<Animal> animais = List.of(cachorro, gato);
        relatoriosAnimais.geraRelatorioEmGrupo(animais);

        Relatorios<Pessoa> relatoriosPessoas = new Relatorios();
        relatoriosPessoas.geraRelatorioUnico(atendente);
        List<Pessoa> atendentes = List.of(atendente, dono);
        relatoriosPessoas.geraRelatorioEmGrupo(atendentes);

        Relatorios relatoriosDeTudo = new Relatorios();
        relatoriosDeTudo.geraRelatorioUnico(cachorro);
        relatoriosDeTudo.geraRelatorioUnico(atendente);

        List<Object> objetosDiversos = List.of();
        System.out.println(objetosDiversos);
        List<Pessoa> somentePessoas = getObjetosSomentePessoas(objetosDiversos);
        System.out.println(somentePessoas);

        Relatorios.metodo(gato);
    }

    public static Cachorro getCachorro(){
        Dono dono = new Dono("João", new Endereco());
        Cachorro cachorro = new Cachorro(dono);
        cachorro.setNome("Bob");
        return cachorro;
    }

    private static List<Pessoa> getObjetosSomentePessoas(List<Object> lista){
        List<Pessoa> saoPessoas = new ArrayList<>();
        for (Object o : lista) {
            if (o instanceof Pessoa){
                saoPessoas.add((Pessoa)o);
            }
        }

        return saoPessoas;
    }
}
