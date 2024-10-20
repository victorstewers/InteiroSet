package exercicio.InteiroSet;



import javax.swing.JOptionPane;

public class InteiroSet {
	private static final int tamanho = 101;
	private boolean[] conjunto;

	public InteiroSet() {
		this.conjunto = new boolean[tamanho];
	}

	public void insereElemento(int numeroAdicionado) {
		if(numeroAdicionado >=0 && numeroAdicionado <= this.tamanho) {
			conjunto[numeroAdicionado] = true;
		}else {
			JOptionPane.showMessageDialog(null, "Número inváldio");
		}
		
	}

	public void deleteElemento(int numeroRemovido) {
		if(numeroRemovido >=0 && numeroRemovido <= this.tamanho) {
			conjunto[numeroRemovido] = false;
		}
		else {
			JOptionPane.showMessageDialog(null, "Número inváldio");
		}
	}

	public InteiroSet uniaoConjuntos(InteiroSet conjunto1, InteiroSet conjunto2) {
		InteiroSet conjuntoUniao = new InteiroSet();
		for (int i = 0; i < tamanho; i++) {
			if (conjunto1.conjunto[i] || conjunto2.conjunto[i]) {
				conjuntoUniao.conjunto[i] = true;
				//ou conjuntoUniao.conjunto[i] = conjunto1.conjunto[i] || conjunto2.conjunto[i];
			}
			
		}
		return conjuntoUniao;


	}
	public InteiroSet interseccaoConjuntos(InteiroSet conjunto1, InteiroSet conjunto2) {
		InteiroSet conjuntoInterseccao = new InteiroSet();
		for(int i = 0 ; i < tamanho; i++) {
			if(conjunto1.conjunto[i] && conjunto2.conjunto[i]) {
				conjuntoInterseccao.conjunto[i] = true;
			}
		}
		return conjuntoInterseccao;
	}

	public boolean ehIgual(InteiroSet conjunto1, InteiroSet conjunto2) {
		for (int i = 0; i < tamanho; i++) {
			if ((conjunto1.conjunto[i] && conjunto2.conjunto[i])
					|| (conjunto1.conjunto[i] == false && conjunto2.conjunto[i] == false)) {

			} else {
				return false;
			}
		}

		return true;
	}

	@Override
	public String toString() {
		String numerosConjunto = "";
		int primeiroAdicionado = 0;
		for (int i = 0; i < this.tamanho; i++) {
			if (conjunto[i] && primeiroAdicionado == 0) {
				numerosConjunto += Integer.toString(i);
				primeiroAdicionado++;
			} else if(conjunto[i]){
				numerosConjunto +=", " +Integer.toString(i);
			}
		}
		return "Conjunto:[" + numerosConjunto + "]";
	}

}
