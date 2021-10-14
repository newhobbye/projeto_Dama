package tabuleiro;

import Enum.Cor;
import entidades.Peao;

public class Tabuleiro {

	private String[][] matriz;
	private int tamanho = 10;
	private Peao peao = new Peao();

	public Tabuleiro() {
		tamanho++;
		this.matriz = new String[tamanho][tamanho];
		this.matriz[0][0] = "  ";
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				matriz[i][j] = "-";
			}
		}
	}

	public void imprimeTab() {
		// System.out.println("\n 1 2 3 4 5 6 7 8 9 10 ");
		System.out.print("\n          ");
		for (int i = 1; i < tamanho; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();

		for (int linha = tamanho - 1; linha > 0; linha--) {
			System.out.printf("\n%9d ", linha);
			/*
			 * if (linha < 10) { System.out.println(); System.out.print("        " + linha +
			 * " "); } else { System.out.println(); System.out.print("       " + linha +
			 * " ");
			 * 
			 * }
			 */
			for (int coluna = 1; coluna < tamanho; coluna++) {
				System.out.printf("%4s", matriz[linha][coluna]);
				// System.out.print(" " + matriz[linha][coluna]);

			}

			System.out.println();
		}

	}

	public void colocarPecaNoTabuleiro() {

		for (int i = 2; i < tamanho; i += 2) {
			matriz[1][i] = peao.jogador1(Cor.AZUL);

			for (int j = 1; j < tamanho; j += 2) {
				matriz[2][j] = peao.jogador1(Cor.AZUL);
			}

			for (int v = 2; v < tamanho; v += 2) {
				matriz[3][v] = peao.jogador1(Cor.AZUL);
			}

			for (int x = 1; x < tamanho; x += 2) {
				matriz[8][x] = peao.jogador2(Cor.BRANCO);
			}

			for (int h = 2; h < tamanho; h += 2) {
				matriz[9][h] = peao.jogador2(Cor.BRANCO);
			}
			for (int b = 1; b < tamanho; b += 2) {
				matriz[10][b] = peao.jogador2(Cor.BRANCO);
			}

		}

	}

	public String[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}

	public int getTamanho() {
		return tamanho;
	}
}
