package br.edu.univas;

import br.edu.univas.models.Produto;
import br.edu.univas.regrasFrete.*;
import br.edu.univas.services.CalculoFrete;

public class StartApp {
    public static void main(String[] args) {
        CalculoFrete fretePorPeso = new CalculoFrete(new br.edu.univas.regrasfrete.PorPeso());
        CalculoFrete fretePorTamanho = new CalculoFrete(new br.edu.univas.regrasfrete.PorTamanho());
        Produto produto = new Produto("Sabonete", 0.1, 0.2);
        fretePorPeso.calcularFrete(produto);
        fretePorTamanho.calcularFrete(produto);
    }
}