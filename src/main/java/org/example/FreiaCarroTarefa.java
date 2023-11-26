package org.example;

public class FreiaCarroTarefa implements Tarefa{

    private Carro carro;

    public FreiaCarroTarefa(Carro carro) {
        this.carro = carro;
    }

    @Override
    public void executar() {
        this.carro.frear();
    }

    @Override
    public void cancelar() {
        this.carro.acelerar();
    }
    
}
