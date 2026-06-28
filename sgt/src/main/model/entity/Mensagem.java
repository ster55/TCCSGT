package com.itb.inf2gm.sgt.model.entity;

public class Mensagem {

    private Long id;
    private String conteudo;
    private String dataHoraEnvio;
    private boolean codStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDataHoraEnvio() {
        return dataHoraEnvio;
    }

    public void setDataHoraEnvio(String dataHoraEnvio) {
        this.dataHoraEnvio = dataHoraEnvio;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}