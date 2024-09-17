package iphonedesafio.test;

import iphonedesafio.domain.Iphone;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();

        iPhone.ligar("8595463211");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println("-------------------------------");

        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Céu azul");

        System.out.println("-------------------------------");

        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
