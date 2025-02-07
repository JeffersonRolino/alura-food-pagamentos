package br.com.alurafood.pagamentos.dto;

import br.com.alurafood.pagamentos.model.Status;

import java.math.BigDecimal;

public class PagamentoDto {
    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Status status;
    private Long formaDePagamentoId;
    private Long pedidoId;

    public Long getId() {
        return this.id;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getExpiracao() {
        return this.expiracao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public Status getStatus() {
        return this.status;
    }

    public Long getFormaDePagamentoId() {
        return this.formaDePagamentoId;
    }

    public Long getPedidoId() {
        return this.pedidoId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setExpiracao(String expiracao) {
        this.expiracao = expiracao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setFormaDePagamentoId(Long formaDePagamentoId) {
        this.formaDePagamentoId = formaDePagamentoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }
}
