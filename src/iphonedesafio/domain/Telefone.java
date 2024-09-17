package iphonedesafio.domain;

public abstract class Telefone {
    public String numero;

    public abstract void ligar(String numero);

    public abstract void atender();

    public abstract void iniciarCorreioVoz();
}
