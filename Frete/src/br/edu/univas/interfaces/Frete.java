package br.edu.univas.interfaces;

import br.edu.univas.models.Produto;

public interface Frete {
    double calcular(Produto produto);
}