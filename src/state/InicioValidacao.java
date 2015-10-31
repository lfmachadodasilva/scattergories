package state;

import java.util.List;
import java.util.TreeMap;

import adedanha.Resultado;
import adedanha.Tema;
import comunicacao.Client;

public class InicioValidacao implements IState{

	private TreeMap<Tema, List<Resultado>> respostas;
	public void action(Client cliente) {	
		cliente.getController().inicia_votacao(respostas);
	}
	
	public InicioValidacao(TreeMap<Tema, List<Resultado>> respostas){
		this.respostas = respostas;
	}

}
