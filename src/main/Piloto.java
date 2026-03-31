package com.example.Bridge;

public class Piloto extends FuncionarioAeroporto {

    public Piloto(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.categoriaVoo.percentualAdicional());
    }
}