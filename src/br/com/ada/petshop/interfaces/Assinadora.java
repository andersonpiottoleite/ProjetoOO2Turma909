package br.com.ada.petshop.interfaces;

/*
    Classe que implementa (assina) o contrato das interfaces.
    Ela tem a responsabilidade de dar implementações aos metodos.
    Detalhe: Podemos herdar somente de uma classe,
    mas podemos implementar varias interfaces
 */
public class Assinadora extends Classe1
        implements Contrato, AditivoDeContrato, UltimoAditivoContrato{

    public String assinatura;

    // metodo implementado e com um corpo (cumprindo o contrato)
    @Override
    public void clausula1() {
        System.out.println("implementando a clausua 1");
    }

    @Override
    public void clausula2() {
        System.out.println("implementando a clausula 2");
    }

    @Override
    public int clausula3() {
        return 1;
    }

    @Override
    public boolean clausula4(String s) {
        return false;
    }

    @Override
    public boolean clausula4(String s, int numero) {
        boolean curtiu = s.equals("Joinha");
        return curtiu;
    }

    @Override
    public String getAssinatura() {
        return this.assinatura;
    }

    @Override
    public int getAtributo() {
        return 0;
    }

    @Override
    public void novaClausulaDoAditivo() {

    }

    @Override
    public void ultimaClausulaEuPrometo() {

    }
}
