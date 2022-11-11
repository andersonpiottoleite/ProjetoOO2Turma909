package br.com.ada.petshop.autenticacao;

import br.com.ada.petshop.modelo.Pessoa;

public class AutenticacaoRepository {

    /*
    Somente Atendente e Veterinario devem autenticar em nosso PetShop
    mas um dono (que tbm herda de de Pessoa), tamb�m pode ser informado aqui,
    n�o � isso que queremos :(

    Resolva essa situa��o implementando uma interface...

    1 - Crie uma interface Autenticavel com os metodos getLogin e getSenha,
    somente autenticaveis ter�o esses metodos!
    2 - Fa�a as classes Atendente e Veterinario implementarem essa interface.
    3 - Forne�a a implementa��o necess�ria para obter o login e a senha.
    4 - Modifique o metodo autentica,para receber somente autenticaveis.
    5 - Fa�a a l�gica de autentica��o, comparando o login e senha informado com o do banco
    6 - Teste seu c�digo
    */

    private String loginGravadoNoBanco = "user";
    private String senhaGravadaNoBanco = "123";

    public void autentica(Pessoa pessoa){
        // obtenha o login e a senha do autenticavel
        // fa�a a logica de autentica��o, comparando com o login e senha acima
        // se autenticado, segue o fluxo,
        // sen�o lan�a uma mensagem de erro
    }
}
