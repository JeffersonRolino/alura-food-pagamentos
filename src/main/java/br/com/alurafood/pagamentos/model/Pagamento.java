package br.com.alurafood.pagamentos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

@Entity
@Table(name = "pagamentos")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Positive
    private BigDecimal valor;

    @NotBlank
    @Size(max = 100)
    private String nome;

    @NotBlank
    @Size(max = 19)
    private String numero;

    @NotBlank
    @Size(max = 7)
    private String expiracao;

    @NotBlank
    @Size(min = 3, max = 3)
    private String codigo;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @NotNull
    private Long pedidoId;

    @NotNull
    private Long formaDePagamentoId;

    public Pagamento(Long id, @NotNull @Positive BigDecimal valor, @NotBlank @Size(max = 100) String nome, @NotBlank @Size(max = 19) String numero, @NotBlank @Size(max = 7) String expiracao, @NotBlank @Size(min = 3, max = 3) String codigo, @NotNull Status status, @NotNull Long pedidoId, @NotNull Long formaDePagamentoId) {
        this.id = id;
        this.valor = valor;
        this.nome = nome;
        this.numero = numero;
        this.expiracao = expiracao;
        this.codigo = codigo;
        this.status = status;
        this.pedidoId = pedidoId;
        this.formaDePagamentoId = formaDePagamentoId;
    }

    public Pagamento() {
    }

    public Long getId() {
        return this.id;
    }

    public @NotNull @Positive BigDecimal getValor() {
        return this.valor;
    }

    public @NotBlank @Size(max = 100) String getNome() {
        return this.nome;
    }

    public @NotBlank @Size(max = 19) String getNumero() {
        return this.numero;
    }

    public @NotBlank @Size(max = 7) String getExpiracao() {
        return this.expiracao;
    }

    public @NotBlank @Size(min = 3, max = 3) String getCodigo() {
        return this.codigo;
    }

    public @NotNull Status getStatus() {
        return this.status;
    }

    public @NotNull Long getPedidoId() {
        return this.pedidoId;
    }

    public @NotNull Long getFormaDePagamentoId() {
        return this.formaDePagamentoId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setValor(@NotNull @Positive BigDecimal valor) {
        this.valor = valor;
    }

    public void setNome(@NotBlank @Size(max = 100) String nome) {
        this.nome = nome;
    }

    public void setNumero(@NotBlank @Size(max = 19) String numero) {
        this.numero = numero;
    }

    public void setExpiracao(@NotBlank @Size(max = 7) String expiracao) {
        this.expiracao = expiracao;
    }

    public void setCodigo(@NotBlank @Size(min = 3, max = 3) String codigo) {
        this.codigo = codigo;
    }

    public void setStatus(@NotNull Status status) {
        this.status = status;
    }

    public void setPedidoId(@NotNull Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public void setFormaDePagamentoId(@NotNull Long formaDePagamentoId) {
        this.formaDePagamentoId = formaDePagamentoId;
    }
}