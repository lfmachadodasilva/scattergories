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

/**
 * Classe responsavel por gerar o historico de resultados de um Usuario,
 * oferecendo acesso as informacoes, evitando o tratamento direto com o BD.
 * 
 * @author thyago
 */
public class Historico {
    /**
     * Nome do Usuario ao qual o historico se refere.
     */
    private String username;

    /**
     * Construtor. Tenta recuperar o historico do usuario no BD, caso nao
     * consiga, adiciona o novo historico.
     *
     * @param name Nome do Usuario ao qual o historico de refere.
     */
    public Historico(String name) {
        username = name;
    }

    /**
     * Adiciona um novo resultado ao historico de um usuario.
     * @param pontuacao
     * @param posicao
     */
    public void add_resultado(int pontuacao, int posicao) {
    }

    public int get_maior_pontuacao() {
        return 0; //TODO (Thyago, 2010-04-24) Falta implementar.
    }

    public int get_num_vitorias() {
        return 0; //TODO (Thyago, 2010-04-24) Falta implementar.
    }
}
