package br.edu.univas.regrasfrete;

import br.edu.univas.interfaces.Frete;
import br.edu.univas.models.Produto;

public class PorPeso implements Frete {

    @Override
    public double calcular(Produto produto) {
        return produto.getPeso() * 0.337;
    }

}