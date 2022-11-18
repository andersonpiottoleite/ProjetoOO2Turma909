package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Animal;

import java.util.List;

public class EmailService {

    public void enviaEmailDeBoasVindas(Animal animal){
        System.out.println("EMAIL:");
        System.out.println("Sr. "+ animal.getDono().getNome() +" Bem vindo nosso PetShop");
        System.out.println("Vamos cuidar muito bem do "+ animal.getNome());
        System.out.println("Aqui vc encontra nossos serviços e produtos:");
        System.out.println("www.petshop.com.br");
    }

    public void enviaEmailEmLote(List<Animal> animais){
        System.out.println("Enviando email em lote para os donos...");
    }
}
