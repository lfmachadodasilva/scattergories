package state;

import comunicacao.Client;

public class NovaMensagem implements IState {

	private String texto;
	public NovaMensagem(String texto){
		this.texto = texto;
	}
	public void action(Client cliente) {
		cliente.getController().recebeMensagem(texto);
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}

}
