package br.com.ada.petshop.teste;

import br.com.ada.petshop.businessobject.CalculadoraDescontoPrecoServico;
import br.com.ada.petshop.enumeracao.TipoPagamentoEnum;
import br.com.ada.petshop.enumeracao.TipoServicoEnum;
import br.com.ada.petshop.modelo.Pagamento;
import br.com.ada.petshop.modelo.Servico;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class TesteCalculoServico {

    public static void main(String[] args) {
        Servico tosa = new Servico();
        tosa.setValor(new BigDecimal(100.00));
        tosa.setTipoServico(TipoServicoEnum.TOSA);

        Servico banho = new Servico();
        banho.setValor(new BigDecimal(50.00));
        banho.setTipoServico(TipoServicoEnum.BANHO);

        Pagamento pagamentoDebito = new Pagamento();
        pagamentoDebito.setTipoPagamento(TipoPagamentoEnum.DEBITO);

        Pagamento pagamentoCredito = new Pagamento();
        pagamentoCredito.setTipoPagamento(TipoPagamentoEnum.CREDITO);

        CalculadoraDescontoPrecoServico calc = new CalculadoraDescontoPrecoServico();
        System.out.println("Valor anterior tosa: "+getValorFormatado(tosa.getValor()));
        calc.aplicaDesconto(tosa, pagamentoCredito);
        System.out.println("Valor do tosa com desconto: "+getValorFormatado(tosa.getValor()));

        System.out.println("Valor anterior banho: "+getValorFormatado(banho.getValor()));
        calc.aplicaDesconto(banho, pagamentoDebito);
        System.out.println("Valor do banho com desconto: "+ getValorFormatado(banho.getValor()));
    }

    private static String getValorFormatado(BigDecimal valor){
        String valorFormatado = NumberFormat
                .getCurrencyInstance(new Locale("pt", "br"))
                .format(valor);

        return valorFormatado;
    }
}
