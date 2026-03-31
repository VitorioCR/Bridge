package com.example.Bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComissarioTest {

    @Test
    void deveRetornarSalarioComissarioComVooInternacional() {
        CategoriaVoo categoria = new VooInternacional();
        Comissario comissario = new Comissario(4000.0f);
        comissario.setCategoriaVoo(categoria);
        assertEquals(6000.0f, comissario.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioComissarioComVooCargueiro() {
        CategoriaVoo categoria = new VooCargueiro();
        Comissario comissario = new Comissario(4000.0f);
        comissario.setCategoriaVoo(categoria);
        assertEquals(5200.0f, comissario.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioComissarioComVooDomestico() {
        CategoriaVoo categoria = new VooDomestico();
        Comissario comissario = new Comissario(4000.0f);
        comissario.setCategoriaVoo(categoria);
        assertEquals(4400.0f, comissario.calcularSalario(), 0.01f);
    }
}