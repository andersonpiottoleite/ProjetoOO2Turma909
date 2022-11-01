package br.com.ada.petshop.modelo;

public class Cachorro {

    // atributos, o que um classe tem
    private String nome;
    private String raca;

    private int idade;
    private boolean estaDoente;

    // composição, um cachorro é composto por um dono
    private Dono dono;

    /* atributo estatico, que pertence somente a classe
    havera somente uma instancia, compartilhada entre os objetos
     */

    // construtores, que podem ser usados para a cria??o de objetos

    public Cachorro(Dono dono){
        this.dono = dono;
    }

    // metodos, o que uma classe faz...

    // metodos de configura??o - setam os valores - setters dos atributos

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
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

    // metodos de consulta - consultam os valores dos atributos

    public boolean isEstaDoente() {
        return estaDoente;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public Dono getDono() {
        return dono;
    }

    // metodo usado para imprimir mais informa??es (estado) sobre os valores dos atributos do objeto

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", estaDoente=" + estaDoente +
                ", dono=" + dono +
                '}';
    }
}
