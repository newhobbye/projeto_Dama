package programa;

import java.util.Scanner;

import tabuleiro.Movimento;
import tabuleiro.Tabuleiro;

public class Programa {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Tabuleiro tab = new Tabuleiro();
		Movimento mov = new Movimento(tab);

		tab.colocarPecaNoTabuleiro();
		tab.imprimeTab();

		do {
			int movaL = sc.nextInt();

			sc.nextLine();
			int movaC = sc.nextInt();
			sc.nextLine();

			int movpL = sc.nextInt();
			sc.nextLine();
			int movpC = sc.nextInt();
			sc.nextLine();

			mov.moverPecas(movaL, movaC, movpL, movpC);
			tab.imprimeTab();
		} while (true);

	}
}
