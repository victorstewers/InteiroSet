package exercicio.InteiroSet;

import javax.swing.JOptionPane;

public class testaInteiroSet {
	public static void main(String[] args) {
		InteiroSet conj1 = new InteiroSet();
		InteiroSet conj2 = new InteiroSet();
		
		int qntidadeNumerosConjunto = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o a qntidade de elementos a ser inserido no conjunto 1(0-100)"));
		for(int i = 0; i<qntidadeNumerosConjunto;i++) {
			int numeroAdicionadoConjunto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número a ser inserido(0-100)"));
			conj1.insereElemento(numeroAdicionadoConjunto);
		}
		int qntidadeNumerosConjunto2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o a qntidade de elementos a ser inserido no conjunto 2(0-100)"));
		for(int i = 0; i<qntidadeNumerosConjunto2;i++) {
			int numeroAdicionadoConjunto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número a ser inserido(0-100)"));
			conj2.insereElemento(numeroAdicionadoConjunto);
		}
		JOptionPane.showMessageDialog(null, "Primeiro Conjunto"+conj1);
		JOptionPane.showMessageDialog(null, "Segundo Conjunto"+conj2);
		JOptionPane.showMessageDialog(null, conj1.ehIgual(conj1, conj2));
		
		InteiroSet conj3 = new InteiroSet();
		conj3 = conj3.uniaoConjuntos(conj1, conj2);
		JOptionPane.showMessageDialog(null, "Conjunto Uniao"+ conj3);
		
		InteiroSet conj4 =  new InteiroSet();
		conj4 = conj4.interseccaoConjuntos(conj1, conj2);
		JOptionPane.showMessageDialog(null, "Conjunto Interseccao"+ conj4);
		
		
		int numeroRemovido = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número a ser removido do conjunto1(0-100)"));
		conj1.deleteElemento(numeroRemovido);
		JOptionPane.showMessageDialog(null, "Primeiro Conjunto"+conj1);
		JOptionPane.showMessageDialog(null, "Segundo Conjunto"+conj2);
		
		InteiroSet conj5 = new InteiroSet();
		conj5 = conj5.uniaoConjuntos(conj1, conj2);
		JOptionPane.showMessageDialog(null, "Conjunto Uniao"+ conj5);
		
		InteiroSet conj6 =  new InteiroSet();
		conj6 = conj6.interseccaoConjuntos(conj1, conj2);
		JOptionPane.showMessageDialog(null, "Conjunto Interseccao"+ conj6);
		
		
		
		
		
	}
}
