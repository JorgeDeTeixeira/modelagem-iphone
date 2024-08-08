package com.jorge.modelagemiphone;

import com.jorge.modelagemiphone.aparalho.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.ligar("1234567890");
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.atender();
        iphone.iniciarCorreiovoz();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Rock and Roll");
    }
}
