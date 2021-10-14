package entidades;

import Enum.Cor;

public class Peao {
	
	private Cor cor;
	private String jogador;
	public Peao() {
		
	}
	
	public String jogador1(Cor cor) {
		return setJogador("J1");
	}

	public String jogador2(Cor cor) {
		return setJogador("J2");
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public String getJogador() {
		return jogador;
	}

	public String setJogador(String jogador) {
		this.jogador = jogador;
		return jogador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((jogador == null) ? 0 : jogador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peao other = (Peao) obj;
		if (cor != other.cor)
			return false;
		if (jogador == null) {
			if (other.jogador != null)
				return false;
		} else if (!jogador.equals(other.jogador))
			return false;
		return true;
	}
	
	

	
	
	
	
	
	
	

}
