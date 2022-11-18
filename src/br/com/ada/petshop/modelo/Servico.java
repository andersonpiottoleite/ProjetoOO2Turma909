package br.com.ada.petshop.modelo;

import br.com.ada.petshop.enumeracao.TipoServicoEnum;

import java.math.BigDecimal;

public class Servico {

    private BigDecimal valor;

    private TipoServicoEnum tipoServico;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoServicoEnum getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServicoEnum tipoServico) {
        this.tipoServico = tipoServico;
    }
}
