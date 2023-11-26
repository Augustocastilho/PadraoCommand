package org.example;

public class AceleraCarroTarefa implements Tarefa{

    private Carro carro;

    public AceleraCarroTarefa(Carro carro) {
        this.carro = carro;
    }

    @Override
    public void executar() {
        this.carro.acelerar();
    }

    @Override
    public void cancelar() {
        this.carro.frear();
    }   

}
