package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CondutorTest {

    Condutor condutor;
    Carro carro;

    @BeforeEach
    void setUp() {
        this.condutor = new Condutor();
        this.carro = new Carro("Fusca");
    }

    @Test
    void deveAcelerarCarro() {
        Tarefa tarefa = new AceleraCarroTarefa(this.carro);
        this.condutor.executarTarefa(tarefa);
        assertEquals(10, this.carro.getVelocidade());
    }

    @Test
    void deveFrearCarroParado() {
        Tarefa tarefa = new FreiaCarroTarefa(this.carro);
        this.condutor.executarTarefa(tarefa);
        assertEquals(0, this.carro.getVelocidade());
    }

    @Test
    void deveFrearCarroEmMovimento() {
        Tarefa tarefa = new AceleraCarroTarefa(this.carro);
        this.condutor.executarTarefa(tarefa);
        tarefa = new FreiaCarroTarefa(this.carro);
        this.condutor.executarTarefa(tarefa);
        assertEquals(0, this.carro.getVelocidade());
    }

    @Test
    void deveCancelarUltimaTarefa() {
        Tarefa tarefaAcelerar = new AceleraCarroTarefa(this.carro);
        Tarefa tarefaFrear = new FreiaCarroTarefa(this.carro);

        this.condutor.executarTarefa(tarefaAcelerar);
        this.condutor.executarTarefa(tarefaFrear);
        this.condutor.cancelarUltimaTarefa();

        assertEquals(10, this.carro.getVelocidade());
    }

}