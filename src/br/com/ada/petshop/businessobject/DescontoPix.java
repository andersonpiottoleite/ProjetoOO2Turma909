package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Pagamento;
import br.com.ada.petshop.modelo.Servico;

import java.math.BigDecimal;

public class DescontoPix implements AplicadorDesconto{
    @Override
    public void aplicaDesconto(Servico servico) {
        //se for credito, desconto de R$ 20.00
        BigDecimal valorComDesconto = servico.getValor().subtract(new BigDecimal(20.0));
        servico.setValor(valorComDesconto);
    }
}
