package controller;

import br.edu.fateczl.hugobispo.ListaEncadeada.*;

public class Verificar_Ordem {

	ListaEncadedaSimples lista = new ListaEncadedaSimples();

	public void InserirDado(String dado, int tamanho) {
		if (tamanho == 0) {
			lista.adicionaPrimeiroElemento(new No(dado));
		} else {
			lista.adicionaElemento(new No(dado));
		}
	}

	public ListaEncadedaSimples ChecarOrdem(int tamanho) {
		Boolean validador = true;
		lista.adicionaElemento(new No(""));
		System.out.println("Elementos na Lista");
		System.out.println(lista.toString());
		for (int i = 0; i < tamanho; i++) {
			int numero1 = Integer.parseInt(lista.pegaElemento(i));
			int numero2 = Integer.parseInt(lista.pegaElemento(i+1));
			if (numero1 > numero2) {
				System.out.println("Lista não é Crescente");
				System.exit(0);
				break;
			}
		}
		if (validador == true) {
			System.out.println("Lista é Crescente");
		}
		return lista;
	}
}
