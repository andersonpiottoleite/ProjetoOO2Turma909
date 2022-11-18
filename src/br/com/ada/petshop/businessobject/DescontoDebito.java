package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.modelo.Pagamento;
import br.com.ada.petshop.modelo.Servico;

import java.math.BigDecimal;

public class DescontoDebito implements AplicadorDesconto{
    @Override
    public void aplicaDesconto(Servico servico) {
        //se for debito, desconto de R$ 10.00
        BigDecimal valorComDesconto = servico.getValor().subtract(new BigDecimal(10.0));
        servico.setValor(valorComDesconto);
    }
}
