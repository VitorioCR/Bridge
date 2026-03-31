package com.example.Bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PilotoTest {

    @Test
    void deveRetornarSalarioPilotoComVooInternacional() {
        CategoriaVoo categoria = new VooInternacional();
        Piloto piloto = new Piloto(10000.0f);
        piloto.setCategoriaVoo(categoria);
        assertEquals(15000.0f, piloto.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioPilotoComVooCargueiro() {
        CategoriaVoo categoria = new VooCargueiro();
        Piloto piloto = new Piloto(10000.0f);
        piloto.setCategoriaVoo(categoria);
        assertEquals(13000.0f, piloto.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioPilotoComVooDomestico() {
        CategoriaVoo categoria = new VooDomestico();
        Piloto piloto = new Piloto(10000.0f);
        piloto.setCategoriaVoo(categoria);
        assertEquals(11000.0f, piloto.calcularSalario(), 0.01f);
    }
}