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

import comunicacao.IRemoteClient;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;
import tratamento_erro.ErroDeProgramacao;

/**
 *
 * @author thyago
 */
public class Jogo implements Serializable {
    /**
     * Usuario que joga na instancia corrente do jogo.
     *
     * @see Usuario
     */
    private Usuario usuario_corrente;

    /**
     * Usuario criador do jogo e responsavel pelas configuracoes.
     *
     * @see Usuario
     */
    private Usuario usuario_criador;

    /**
     * Lista de usuarios do jogo.
     */
    private TreeMap<String, Usuario> usuarios;

    /**
     * Rodada atual do jogo.
     *
     * @see Rodada
     */
    private Rodada rodada_atual;

    /**
     * Todas as rodadas do jogo.
     *
     * @see Rodada
     */
    private Vector<Rodada> rodadas;

    /**
     * Numero de rodadas por jogo. Deve ser maior que zero.
     */
    private int num_rodadas;

    /**
     * Tempo de duracao da rodada em minutos.
     */
    private float tempo_rodada;

    /**
     * Lista de letras validas. Deve-se acessar com o enum <code>Letra</code> e
     * o valor armazenado e um booleano informando se a letra e valida ou nao.
     */
    private TreeMap<Letra, Boolean> letras_validas;

    /**
     * Lista de temas selecionados para o jogo.
     */
    private Vector<Tema> temas;

    /**
     * Flag a ser marcada quando o primeiro jogador pedir Stop de forma a evitar que outros jogadores tambem pecam para parar.
     */
    private boolean parado;

    /**
     * Construtor. Inicia a lista de letras validas com todas validas, o numero
     * de rodadas como 0 e tempo de cada rodada como 2 minutos.
     */
    public Jogo() {
        num_rodadas = 0;
        tempo_rodada = 2;
        letras_validas = new TreeMap<Letra, Boolean>();
        rodadas = new Vector<Rodada>();
        usuarios = new TreeMap<String, Usuario>();

        for(Letra l: Letra.values())
            letras_validas.put(l, Boolean.TRUE);

        temas = new Vector<Tema>();

        parado = false;
    }

    /**
     * Obter o tempo de duracao de cada rodada.
     *
     * @return Tempo de duracao de cada rodada em minutos.
     */
    public float get_tempo_rodada() {
        return tempo_rodada;
    }

    /**
     * Obter numero de rodadas de cada partida.
     *
     * @return Numero de rodadas de cada partida.
     */
    public int get_num_rodadas() {
        return num_rodadas;
    }

    /**
     * Obtem a lista de letras validas e invalidas. Os valores nao devem ser
     * modificados, para isso deve-se usar o metodo set_letra_valida.
     *
     * @return TreeMap com pares letra e status (valida/invalida)
     */
    public final TreeMap<Letra, Boolean> get_letras_validas() {
        return letras_validas;
    }

    /**
     * Obtem a lista de temas selecionados para o jogo. Os valores nao devem ser
     * modificados, para isso deve-se usar o metodo set_temas.
     *
     * @return Vector com os temas selecionados.
     */
    public Vector<Tema> get_temas() {
        return temas;
    }

    /**
     * Seta o tempo de duracao de cada rodada do jogo.
     *
     * @param tempo_rodada Tempo em minutos de duracao de cada rodada. Nao pode
     *                     ser menor ou igual a zero.
     */
    public void set_tempo_rodada(float tempo_rodada) {
        if(tempo_rodada <= 0)
            return;

        this.tempo_rodada = tempo_rodada;
    }

    /**
     * Seta o numero de rodadas de cada jogo.
     *
     * @param num_rodadas Numero de rodadas do jogo. Nao pode ser menor ou igual
     *                    a zero.
     */
    public void set_num_rodadas(int num_rodadas) {
        if(num_rodadas <= 0)
            return;

        this.num_rodadas = num_rodadas;
    }

    /**
     * Modifica o status da letra passada. True significa que a letra eh valida
     * e false que nao eh valida.
     *
     * @param l Letra a ter o status modificado.
     * @param valida Novo status da letra. True = valida e false = invalida.
     */
    public void set_letra_invalida(Letra l, boolean valida) {
        letras_validas.put(l, valida);
    }

    /**
     * Adiciona um usuario novo ao jogo.
     *
     * @param u Usuario novo a ser adicionado ao jogo.
     * @return True se houver sucesso e false caso o usuario ja existisse.
     */
    public boolean add_usuario(Usuario u) {
        Usuario existente = usuarios.get(u.get_username());
        if(existente != null)
            return false;

        usuarios.put(u.get_username(), u);

        return true;
    }

    /**
     * Retorna a lista de usuarios no jogo.
     *
     * @return Lista de usuarios no jogo.
     */
    public List<Usuario> get_usuarios() {
        Collection<Usuario> users = usuarios.values();
        LinkedList<Usuario> list = new LinkedList<Usuario>();

        for(Usuario u: users)
            list.add(u);

        return list;
    }

    /**
     * Adiciona os temas recebidos no jogo. Apaga os temas anteriores, se houvessem.
     *
     * @param t Temas a serem adicionados ao jogo.
     */
    public void set_temas(Vector<Tema> t) {
        temas.clear();
        
        for(Tema i: t)
            temas.add(i);
    }

    /**
     * Inicia uma rodada nova e a configura como a rodada atual.
     */
    public void inicia_rodada() {
        parado = false;
        Rodada r = new Rodada();

        r.set_temas(temas);
        letras_validas.remove((Letra)r.sorteia_letra(letras_validas));

        rodadas.add(r);
        rodada_atual = r;
    }

    /**
     * Obtem a rodada atual. A rodada atual sera a rodada criada pela chamada do
     * metodo inicia_rodada.
     *
     * @return A rodada atual ou null caso nao haja uma rodada atual (se o metodo
     *         inicia_rodada nao tiver sido chamado).
     */
    public Rodada get_rodada_atual() {
        return rodada_atual;
    }

    /**
     * Retorna o numero da rodada atual. Como as rodadas vao sendo adicionadas a
     * rodadas conforme sao criadas, o tamanho da lista eh o numero da rodada atual.
     *
     * @return Numero da rodada atual.
     */
    public Integer get_num_rodada_atual() {
        return new Integer(rodadas.size());
    }
    
    /**
     * Remove um usuario do jogo.
     *
     * @param u Usuario a ser removido do jogo.
     * @return True se houver sucesso e false caso o usuario nao exista
     */
    public boolean remove_usuario(Usuario u) {
        Usuario excluido = usuarios.remove(u.get_username());
        
        if (excluido == null){
        	return false;
        }

        return true;
    }
    
    public TreeMap<String,Usuario> getUsuarioTree(){
    	return usuarios;
    }

    /**
     * Para a rodada e solicita as respostas de todos os jogadores.
     *
     * @return True se for o primeiro jogador a pedir Stop e false se nao for.
     */
    public boolean stop() {
        // Outro jogador ja pediu Stop.
        if(parado == true)
            return false;

        parado = true;

        return true;
    }

   
        
}
