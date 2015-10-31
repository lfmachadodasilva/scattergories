package state;

import java.util.TreeMap;
import java.util.TreeSet;

import adedanha.Letra;
import adedanha.Tema;
import comunicacao.Client;

public class AtualizacaoConfiguracao implements IState {

	private TreeSet<Tema> temas;
	private TreeMap<Letra, Boolean> letras_validas;
	private float tempo;
	private int numRodadas;
	
	public AtualizacaoConfiguracao(TreeSet<Tema> temas,
			TreeMap<Letra, Boolean> letras_validas,
			float tempo,
			int numRodadas){
		this.temas = temas;
		this.letras_validas = letras_validas;
		this.tempo = tempo;
		this.numRodadas = numRodadas;
	}
	
	public void action(Client cliente) {
		cliente.getController().atualizaConfiguracao(temas,letras_validas,tempo,numRodadas);

	}

	public TreeSet<Tema> getTemas() {
		return temas;
	}

	public void setTemas(TreeSet<Tema> temas) {
		this.temas = temas;
	}

	public TreeMap<Letra, Boolean> getLetras_validas() {
		return letras_validas;
	}

	public void setLetras_validas(TreeMap<Letra, Boolean> letras_validas) {
		this.letras_validas = letras_validas;
	}

	public float getTempo() {
		return tempo;
	}

	public void setTempo(float tempo) {
		this.tempo = tempo;
	}

	public int getNumRodadas() {
		return numRodadas;
	}

	public void setNumRodadas(int numRodadas) {
		this.numRodadas = numRodadas;
	}

}
