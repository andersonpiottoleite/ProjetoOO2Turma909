package br.com.ada.petshop.modelo;

import br.com.ada.petshop.enumeracao.TipoAnimalEnum;

public abstract class Animal {

    // atributos, o que um classe tem
    private int id;
    private TipoAnimalEnum tipoAnimal;

    private String nome;
    private int idade;


    // composição, um cachorro é composto por um dono
    private Dono dono;

    /* atributo estatico, que pertence somente a classe
    havera somente uma instancia, compartilhada entre os objetos
     */

    // construtores, que podem ser usados para a cria??o de objetos

    public Animal(Dono dono){
        this.dono = dono;
    }

    // metodos, o que uma classe faz...

    // metodos de configura??o - setam os valores - setters dos atributos


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    // encapsulando regra de neg?cio no setter
    public void setIdade(int idade) {
        if(idade < 0){
            System.err.println("Cachorro n?o pode ter idade negativa");
        } else if(idade > 29) {
            System.err.println("N?o ? permitido cachorros com idades superiores a 29 anos");
        } else {
            this.idade = idade;
        }
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public void setTipoAnimal(TipoAnimalEnum tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    // metodos de consulta - consultam os valores dos atributos


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Dono getDono() {
        return dono;
    }

    public int getId() {
        return id;
    }

    public TipoAnimalEnum getTipoAnimal() {
        return tipoAnimal;
    }

    // metodo usado para imprimir mais informa??es (estado) sobre os valores dos atributos do objeto


    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", tipoAnimal=" + tipoAnimal +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dono=" + dono +
                '}';
    }
}
