package br.com.ada.petshop.teste;

import br.com.ada.petshop.businessobject.CachorroRepository;
import br.com.ada.petshop.modelo.Cachorro;
import br.com.ada.petshop.modelo.Dono;
import br.com.ada.petshop.modelo.Endereco;

import java.util.Scanner;

public class CadastroDinamicoDeCaes {

    private static final CachorroRepository cachorroRepository = new CachorroRepository();

    public static void main(String[] args) {
        final int SAIR_DO_SISTEMA = 4;
        int opcaoSelecionada = 0;
        do{
            System.out.println("Selecione a op??o desejada:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Ver cadastrados");
            System.out.println("3 - Limpar cadastros");
            System.out.println("4 - Sair");

            Scanner scanner = new Scanner(System.in);
            opcaoSelecionada = scanner.nextInt();

            switch (opcaoSelecionada){
                case 1:
                    cadastra(scanner, cachorroRepository);
                    break;
                case 2:
                    cachorroRepository.imprimeCachorrosCadastrados();
                    break;
                case 3:
                    cachorroRepository.limpaCadastro();
                    break;
                case 4:
                    System.out.println("Saindo do Sistema");
                    break;
                default:
                    System.out.println("Op??o invalida");
            }

        }while (opcaoSelecionada != SAIR_DO_SISTEMA);
    }
    private static void cadastra(Scanner scanner, CachorroRepository cachorroRepository) {
        System.out.println("######## CADASTRO DE CÃES ########");
        System.out.println("######## Informe seus dados pessoais... ########");

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("######## Informe os dados do seus endereço... ########");

        System.out.println("Digite sua rua:");
        String rua = scanner.next();

        System.out.println("Digite o numero da sua casa:");
        String numero = scanner.next();

        System.out.println("Digite o seu cep:");
        String cep = scanner.next();

        System.out.println("Digite seu bairro:");
        String bairro = scanner.next();

        System.out.println("Digite seu estado ende mora:");
        String estado = scanner.next();

        System.out.println("######## Agora é hora de informar os dados do seu Cãozinho... ########");

        System.out.println("Digite o nome do seu Cão:");
        String nomeCachorro = scanner.next();

        System.out.println("Digite a raca:");
        String raca = scanner.next();

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setCep(cep);
        endereco.setBairro(bairro);
        endereco.setEstado(estado);

        Dono dono = new Dono(nome, endereco);

        Cachorro cachorro = new Cachorro(dono);
        cachorro.setNome(nomeCachorro);
        cachorro.setRaca(raca);
        cachorro.setIdade(idade);

        cachorroRepository.cadastra(cachorro);
        System.out.println("CADASTRO FINALIZADO COM SUCESSO!! ACESSE A OPÇÃO 2 PARA CONSULTAR");
    }
}
