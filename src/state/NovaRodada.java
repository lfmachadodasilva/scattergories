/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package state;

import comunicacao.Client;
import controller.Controller;
import gui.TelaJogo;
import gui.TelaVotacao;

/**
 *
 * @author luizfelipe
 */
public class NovaRodada implements IState {
        public void action(Client cliente) {
		Controller controller = cliente.getController();
                
                TelaVotacao tela = controller.getTelaVotacao();
                if(tela != null)
                    controller.getTelaVotacao().setVisible(false);
                
		TelaJogo jogo = new TelaJogo(controller);
		jogo.setVisible(true);
                controller.setTelaJogo(jogo);
	}
}
