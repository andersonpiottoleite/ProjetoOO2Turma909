package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Pagamento;
import br.com.ada.petshop.modelo.Servico;

public interface AplicadorDesconto {

     void aplicaDesconto(Servico servico);
}
