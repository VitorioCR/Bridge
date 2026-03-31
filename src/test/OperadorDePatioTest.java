package com.example.Bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperadorDePatioTest {

    @Test
    void deveRetornarSalarioOperadorComVooInternacional() {
        CategoriaVoo categoria = new VooInternacional();
        OperadorDePatio operador = new OperadorDePatio(3000.0f);
        operador.setCategoriaVoo(categoria);
        assertEquals(3000.0f, operador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioOperadorComVooCargueiro() {
        CategoriaVoo categoria = new VooCargueiro();
        OperadorDePatio operador = new OperadorDePatio(3000.0f);
        operador.setCategoriaVoo(categoria);
        assertEquals(3000.0f, operador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioOperadorComVooDomestico() {
        CategoriaVoo categoria = new VooDomestico();
        OperadorDePatio operador = new OperadorDePatio(3000.0f);
        operador.setCategoriaVoo(categoria);
        assertEquals(3000.0f, operador.calcularSalario(), 0.01f);
    }
}