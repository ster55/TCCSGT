package com.itb.inf2gm.sgt.model.entity;

public class Tarefa {

    private Long id;
    private String titulo;
    private String descricao;
    private String prioridade;
    private String prazo;
    private boolean concluida;
    private boolean entregueNoPrazo;
    private boolean codStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public boolean isEntregueNoPrazo() {
        return entregueNoPrazo;
    }

    public void setEntregueNoPrazo(boolean entregueNoPrazo) {
        this.entregueNoPrazo = entregueNoPrazo;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}