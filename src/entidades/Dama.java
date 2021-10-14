package entidades;

import Enum.Cor;

public class Dama {

	private Cor cor;
	
	public Dama() {
		
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public String jogDama1(Cor cor) {
		return "1D";
	}
	
	public String jogDama2(Cor cor) {
		return "2D";
	}
	
}
