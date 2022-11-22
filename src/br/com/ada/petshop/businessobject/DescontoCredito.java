package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.servico.Servico;

import java.math.BigDecimal;

public class DescontoCredito implements AplicadorDesconto{
    @Override
    public void aplicaDesconto(Servico servico) {
        //se for credito, desconto de R$ 1.00
        BigDecimal valorComDesconto = servico.getValor().subtract(new BigDecimal(1.0));
        servico.setValor(valorComDesconto);
    }
}
