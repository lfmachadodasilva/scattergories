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

package adedanha;

import java.io.Serializable;

import tratamento_erro.ErroDeProgramacao;

/**
 * Classe responsavel por armazenar a resposta e a pontuacao de um Usuario em
 * uma determinada Rodada e Tema.
 * 
 * @author thyago
 */
public class Resultado implements Serializable,Comparable{
    /**
     * Resposta dada para um determinado Tema em uma determinada Rodada.
     */
    private String resposta;

    /**
     * Pontuacao da resposta dada. Pode ser 0, 5 ou 10 pontos. Caso nao tenha
     * sido setada ainda, tem valor negativo.
     */
    private int pontuacao;

    /**
     * Construtor. Inicia resposta como uma String vazia e pontuacao como um
     * valor negativo.
     */
    public Resultado() {
        resposta = new String();
        pontuacao = -1;
    }

    /**
     * Construtor.
     *
     * @param resposta Resposta do resultado.
     * @param pontuacao Pontuacao da resposta.
     */
    public Resultado(String resposta, int pontuacao) {
        this.resposta = resposta;
        this.pontuacao = pontuacao;
    }

    /**
     * Obter a pontuacao. Pode ser 0, 5 ou 10 pontos ou um valor negativo caso
     * nao tenha sido setado.
     *
     * @return Valor da pontuacao do resultado.
     */
    public int get_pontuacao() {
        return pontuacao;
    }

    /**
     * Setar a pontuacao. O valor deve ser 0, 5 ou 10 pontos.
     *
     * @param pontuacao Valor da pontuacao do resultado.
     */
    public void set_pontuacao(int pontuacao) {
        if(pontuacao != 0 && pontuacao != 5 && pontuacao != 10)
            return;

        this.pontuacao = pontuacao;
    }

    /**
     * Obter resposta do Resultado.
     *
     * @return String com a resposta do Resultado ou vazia.
     */
    public String get_resposta() {
        return resposta;
    }

    /**
     * Setar a resposta de um Resultado.
     *
     * @param resposta Palavra dada como resposta.
     */
    public void set_resposta(String resposta) {
        this.resposta = resposta;
    }
    
    @Override
    public boolean equals(Object obj) {
    	Resultado res = (Resultado) obj;
    	return this.resposta.equals(res.get_resposta());
    }

	public int compareTo(Object o) {
		Resultado res = (Resultado) o;
		return this.get_resposta().compareTo(res.get_resposta());
	}
}
