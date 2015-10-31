/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tratamento_erro;

/**
 *
 * @author thyago
 */
public class JogadorNaoProntoException extends Exception {
        @Override
	public String getMessage() {
		return "Ha um jogador que ainda nao esta pronto.";
	}
}
