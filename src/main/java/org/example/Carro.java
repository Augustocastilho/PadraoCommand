package org.example;

public class Carro {

    private String nome;
    private int velocidade;

    public Carro(String nome) {
        this.nome = nome;
        this.velocidade = 0;
    }

    public void acelerar() {
        this.velocidade += 10;
    }

    public void frear() {
        if (this.velocidade > 0) 
            this.velocidade -= 10;
    }

    public int getVelocidade() {
        return velocidade;
    }

}
