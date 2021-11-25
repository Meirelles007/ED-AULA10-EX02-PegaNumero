package controller;

import br.edu.fateczl.hugobispo.ListaEncadeada.*;

public class Busca_Controller {
	ListaEncadedaSimples lista = new ListaEncadedaSimples();

	public int Recurvisa(ListaEncadedaSimples lista, int numero, int tamanho, int quantidade) {
		if (tamanho == 0) {
			return quantidade;
		} else {
			int aux = Integer.parseInt(lista.pegaElemento(tamanho));
			if (aux == numero) {
				quantidade++;
			}
		}
		tamanho--;
		return Recurvisa(lista, numero, tamanho, quantidade);
	}

	public int Iterativa(ListaEncadedaSimples lista, int numero, int tamanho, int quantidade) {
		quantidade = 0;
		for (int i = 0; i < tamanho; i++) {
			int aux = Integer.parseInt(lista.pegaElemento(i+1));
			if (aux == numero) {
				quantidade++;
			}
		}
		return quantidade;
	}
}
