package br.com.ada.petshop.autenticacao;

import br.com.ada.petshop.modelo.Pessoa;

public class AutenticacaoRepository {

    /*
    Somente Atendente e Veterinario devem autenticar em nosso PetShop
    mas um dono (que tbm herda de de Pessoa), também pode ser informado aqui,
    não é isso que queremos :(

    Resolva essa situação implementando uma interface...

    1 - Crie uma interface Autenticavel com os metodos getLogin e getSenha,
    somente autenticaveis terão esses metodos!
    2 - Faça as classes Atendente e Veterinario implementarem essa interface.
    3 - Forneça a implementação necessária para obter o login e a senha.
    4 - Modifique o metodo autentica,para receber somente autenticaveis.
    5 - Faça a lógica de autenticação, comparando o login e senha informado com o do banco
    6 - Teste seu código
    */

    private String loginGravadoNoBanco = "user";
    private String senhaGravadaNoBanco = "123";

    public void autentica(Pessoa pessoa){
        // obtenha o login e a senha do autenticavel
        // faça a logica de autenticação, comparando com o login e senha acima
        // se autenticado, segue o fluxo,
        // senão lança uma mensagem de erro
    }
}
