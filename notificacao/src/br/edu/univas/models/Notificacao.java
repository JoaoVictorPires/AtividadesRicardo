package br.edu.univas.models;

import br.edu.univas.enums.TipoNotificacao;

public class Notificacao {
    private TipoNotificacao tipoNotificacao;

    public Notificacao(TipoNotificacao tipoNotificacao) {
        this.setTipoNotificacao(tipoNotificacao);
    }

    public TipoNotificacao getTipoNotificacao() {
        return this.tipoNotificacao;
    }

    public String getTipoString() {
        return this.getTipoNotificacao().getTipo();
    }

    public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }
}