package com.example.Bridge;

public class Comissario extends FuncionarioAeroporto {

    public ComissarioBordo(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.categoriaVoo.percentualAdicional());
    }
}