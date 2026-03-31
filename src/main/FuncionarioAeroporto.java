package com.example.Bridge;

public abstract class FuncionarioAeroporto {
    protected CategoriaVoo categoriaVoo; // A ponte para a interface
    protected float salarioBase;

    public FuncionarioAeroporto(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setCategoriaVoo(CategoriaVoo categoriaVoo) {
        this.categoriaVoo = categoriaVoo;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}