package br.edu.univas.services;

import br.edu.univas.interfaces.Frete;
import br.edu.univas.models.Produto;

public class CalculoFrete {

    private Frete tipoFrete;

    public CalculoFrete(Frete frete) {
        this.tipoFrete = frete;
    }

    public void calcularFrete(Produto produto) {
        System.out.println("Frete é de: R$" + tipoFrete.calcular(produto));
    }
}