package state;

import gui.TelaJogo;
import comunicacao.Client;
import controller.Controller;

public class ComecoJogo implements IState {

	public void action(Client cliente) {
		Controller controller = cliente.getController();
		controller.exibeMensagemInicioJogo();
                if(controller.getTelaConfiguracao() != null) {
                    controller.getTelaConfiguracao().setVisible(false);
                    controller.setTelaConfiguracao(null);
                }
		TelaJogo jogo = new TelaJogo(controller);
		jogo.setVisible(true);
                controller.setTelaJogo(jogo);
	}

}
