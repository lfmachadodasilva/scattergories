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

/**
 * Classe responsavel por armazenar as informacoes de um usuario.
 * 
 * @author thyago
 */
public class Usuario implements Serializable{
    /**
     * Nome do usuario.
     */
    private String username;

    /**
     * Historico de resultados do jogador.
     */
    private Historico historico;
    
    private boolean usuarioServidor;
    
    public int pontuacaoTotal;
    
    public int pontuacaoAtual;

    public Usuario(String name) {
        username = name;
        usuarioServidor = false;

        //TODO (Thyago, 2010-04-24) Obter historico do usuario do BD.
    }
    
    public Usuario(String name,boolean usuarioServidor) {
        username = name;
        this.usuarioServidor = usuarioServidor;

        //TODO (Thyago, 2010-04-24) Obter historico do usuario do BD.
    }

    /**
     * Obter o nome do Usuario.
     *
     * @return String com o nome do Usuario.
     */
    public String get_username() {
        return username;
    }

    /**
     * Salva resultado no historico do usuario.
     *
     * @param pontuacao Pontuacao alcancada pelo Usuario no jogo.
     * @param posicao Posicao do Usuario no jogo.
     */
    public void salva_resultado(int pontuacao, int posicao) {
        //TODO (Thyago, 2010-04-24) Implementar o metodo de salvar resultado no
        //historico.
    }

    public int get_maior_pontuacao() {
        if(historico == null) // historico nao pode ser null, deve ter sido criado no construtor
            return 0;

        return historico.get_maior_pontuacao();
    }

    public int get_num_vitorias() {
        if(historico == null) // historico nao pode ser null, deve ter sido criado no construtor
            return 0;

        return historico.get_num_vitorias();
    }

	public boolean isUsuarioServidor() {
		return usuarioServidor;
	}

	public void setUsuarioServidor(boolean usuarioServidor) {
		this.usuarioServidor = usuarioServidor;
	}
	
	@Override
	public boolean equals(Object obj) {
		Usuario user = (Usuario) obj;
		return this.get_username().equals(user.get_username());
	}

	public int getPontuacaoTotal() {
		return pontuacaoTotal;
	}

	public void setPontuacaoTotal(int pontuacaoTotal) {
		this.pontuacaoTotal = pontuacaoTotal;
	}

	public int getPontuacaoAtual() {
		return pontuacaoAtual;
	}

	public void setPontuacaoAtual(int pontuacaoAtual) {
		this.pontuacaoAtual = pontuacaoAtual;
	}
}
