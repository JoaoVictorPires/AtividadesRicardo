package br.edu.univas.regrasfrete;

import br.edu.univas.interfaces.Frete;
import br.edu.univas.models.Produto;

public class PorTamanho implements Frete {

    @Override
    public double calcular(Produto produto) {
        return produto.getTamanho() * 0.237;
    }

}