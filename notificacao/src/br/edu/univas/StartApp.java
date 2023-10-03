package br.edu.univas;

import br.edu.univas.models.Notificacao;
import br.edu.univas.enums.TipoNotificacao;
import br.edu.univas.services.GerenciadorDeNotificacoes;

public class StartApp {

    public static void main(String[] args) {
        Notificacao notificacao = new Notificacao(TipoNotificacao.EMAIL);
        GerenciadorDeNotificacoes gerenciadorDeNotificacoes = new GerenciadorDeNotificacoes();
        gerenciadorDeNotificacoes.enviarNotificacao(notificacao);
        notificacao.setTipoNotificacao(TipoNotificacao.APP);
        gerenciadorDeNotificacoes.enviarNotificacao(notificacao);
    }

}