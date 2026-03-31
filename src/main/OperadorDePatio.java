package com.example.Bridge;

public class OperadorDePatio extends FuncionarioAeroporto {

    public OperadorDePatio(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}