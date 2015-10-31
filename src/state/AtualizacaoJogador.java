/*
 * PUC-Rio - Pontificia Universidade Catolica
 * Bacharelado em Sistemas de Informacao
 *
 * INF 1405 - Construcao de Sistemas 2010.1     Turma: 3WA
 * Professor: Edmundo Torreao
 *
 * Grupo: Lucas Guarisco
 *        Luiz Felipe Machado
 *        Thyago Lopes
 */

package state;

import comunicacao.Client;

public class AtualizacaoJogador implements IState{

	public void action(Client cliente) {
		cliente.getController().atualizaJogadores();
	}

}
