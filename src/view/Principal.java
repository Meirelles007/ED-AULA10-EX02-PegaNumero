package view;

import javax.swing.JOptionPane;

import controller.Busca_Controller;
import controller.Verificar_Ordem;
import br.edu.fateczl.hugobispo.ListaEncadeada.*;

public class Principal {

	public static void main(String[] args) {
		ListaEncadedaSimples lista = new ListaEncadedaSimples();
		Verificar_Ordem Controll_Ordem = new Verificar_Ordem();
		Busca_Controller Controll_Busca = new Busca_Controller();
		String dado = "";
		int tamanho = 0;
		while (true) {
			dado = JOptionPane.showInputDialog("Insira o numero\nDigite 'sair' para sair");
			if (dado.equalsIgnoreCase("Sair")) {
				lista = Controll_Ordem.ChecarOrdem(tamanho);
				System.out.println(lista.toString());
				break;
			} else {
				Controll_Ordem.InserirDado(dado, tamanho);
			}
			tamanho++;
		}
		int quantidade = 0;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero para consultar a quantidade de vezes que ele está na lista"));
		
		int resultado1 = Controll_Busca.Recurvisa(lista, numero, tamanho, quantidade);
		int resultado2 = Controll_Busca.Iterativa(lista, numero, tamanho, quantidade);
		JOptionPane.showMessageDialog(null,
				"Resultado Recursivo = " + resultado1 + "\nResultado Iterativo = " + resultado2);
	}
}
