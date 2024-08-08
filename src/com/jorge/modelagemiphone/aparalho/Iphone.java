package com.jorge.modelagemiphone.aparalho;

import com.jorge.modelagemiphone.interfaces.AparelhoTelefonico;
import com.jorge.modelagemiphone.interfaces.NavegadorNaInternet;
import com.jorge.modelagemiphone.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Está exibindo uma página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Está adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Está atualizando a página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Está ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Está atendendo");
    }

    @Override
    public void iniciarCorreiovoz() {
        System.out.println("Está iniciando o correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Está tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Está pausando");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Está selecionando: " + nomeMusica);
    }

}
