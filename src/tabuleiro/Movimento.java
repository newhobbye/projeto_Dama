package tabuleiro;

import Enum.Cor;
import entidades.Peao;

public class Movimento {

	private Tabuleiro tab = new Tabuleiro();
	private Peao p = new Peao();

	public Movimento(Tabuleiro tabuleiro) {
		this.tab = tabuleiro;
	}

	public boolean verificarExistenciaPeca(int posicaoL, int posicaoC) {
		String[][] aux = tab.getMatriz();

		if (aux[posicaoL][posicaoC] == "-") { // Verifica se existe peça na posição origem.

			tab.setMatriz(aux);
			return false;
		} else
			return true;
	}

	public boolean validarPosicaoTabuleiro(int posicaoL, int posicaoC) {
		if (posicaoL >= 0 && posicaoL < 11 && posicaoC >= 0 && posicaoC < 11) {
			return true; // Verifica se a posição não é maior que o tabuleiro.
		} else {
			return false;
		}
	}


	public boolean moverJog1(int posAL, int posAC, int posPL, int posPC) {
		String[][] aux = tab.getMatriz();

		if (aux[posPL][posPC] == p.jogador1(Cor.AZUL) && aux[posAL][posAC] == p.jogador1(Cor.AZUL)) {
			if (posPL >= posAL + 1)

				tab.setMatriz(aux);
			return false;
		} else {
			return true;
		}

	}

	/*
	 * public boolean moverJog2(int posAL, int posAC, int posPL, int posPC) {
	 * String[][] aux = tab.getMatriz();
	 * 
	 * if (aux[posPL][posPC] == p.jogador2(Cor.BRANCO) && aux[posAL][posAC] ==
	 * p.jogador2(Cor.BRANCO)) { } if (posPL <= posAL + 1) {
	 * 
	 * tab.setMatriz(aux); return false; } else return true; }
	 * 
	 */
	
	public void promoverDama(int posicaoPosteriorL, int posicaoPosteriorC) {
		String [][] aux = tab.getMatriz();
		aux[posicaoPosteriorL][posicaoPosteriorC] = "D";
		tab.setMatriz(aux);
	}

	public void moverPecas(int posAL, int posAC, int posPL, int posPC) {

		String[][] aux = tab.getMatriz();

		if (verificarExistenciaPeca(posPL, posPC)) {
			throw new TabuleiroExcecao("Peça na posição destino!");
		}
		
		if(validarPosicaoTabuleiro(posAL, posAC)) {
			throw new TabuleiroExcecao("Posição Anterior selecionada fora das margens do tabuleiro!");
		}
		
		if(validarPosicaoTabuleiro(posPL, posPC)) {
			throw new TabuleiroExcecao("Posição Posterior selecionada fora das margens do tabuleiro!");
		}
		/*
		 * if (moverJog1(posAL, posAC, posPL, posPC)) { throw new
		 * TabuleiroExcecao("Somente a dama pode mover-se para trás!"); }
		 */
		// if(moverJog2(posAL, posAC, posPL, posPC)) {
		// throw new TabuleiroExcecao("Somente a dama pode mover-se para trás!");
		// }
		
		
		String aux2 = aux[posAL][posAC]; // recebe a variavel unica do vetor.
		aux[posAL][posAC] = aux[posPL][posPC];
		aux[posPL][posPC] = aux2; // recebe de volta a variavel retirada do vetor, porem em outro local.
		
		if (posPL == 10 && aux[posPL][posPC] == p.jogador1(Cor.AZUL)) {
			promoverDama(posPL, posPC);
		}
		if (posPL == 1 && aux[posPL][posPC] == p.jogador2(Cor.BRANCO)) {
			promoverDama(posPL, posPC);
		}
		
		tab.setMatriz(aux);

	}

}
