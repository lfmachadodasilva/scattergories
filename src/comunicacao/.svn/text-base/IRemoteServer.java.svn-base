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

package comunicacao;

import adedanha.Jogo;
import adedanha.Letra;
import adedanha.Resultado;
import adedanha.Rodada;
import adedanha.Tema;
import adedanha.Usuario;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import state.IState;
import tratamento_erro.JogadorNaoConcordaException;
import tratamento_erro.JogadorNaoProntoException;
import tratamento_erro.LetrasInsuficientesException;
import tratamento_erro.TemasInsuficientesException;

/**
 * Interface responsavel por definir os metodos a serem chamados pelos clientes
 * atraves do RMI.
 * 
 * @author thyago
 */
public interface IRemoteServer extends Remote {

	boolean inicializa() throws RemoteException;

	void addObserver(IRemoteClient o) throws RemoteException;

	IRemoteClient removeObserver(IRemoteClient o) throws RemoteException;

	void notifyObservers(IState state) throws RemoteException;

        int get_new_cliet_port() throws RemoteException;

	boolean add_usuario(Usuario user) throws RemoteException;

	void remove_usuario(Usuario user) throws RemoteException;

	List<String> get_user_list() throws RemoteException;

	void inicia_rodada() throws RemoteException;

        Jogo getJogo() throws RemoteException;

	Rodada get_rodada_atual() throws RemoteException;

	Integer get_num_rodada_atual() throws RemoteException;

	void terminaJogo() throws RemoteException;

	int getPorta() throws RemoteException;

	void enviaMensagem(String texto) throws RemoteException;

	void atualizaConfiguracao(TreeSet<Tema> temas,
			TreeMap<Letra, Boolean> letras_validas, float tempo, int numRodadas)
			throws RemoteException;

	void confirmaConfiguracao(TreeSet<Tema> temas,
			TreeMap<Letra, Boolean> letras_validas, float tempo,
			int numRodadas, Usuario user) throws RemoteException,
			TemasInsuficientesException, LetrasInsuficientesException,
                        JogadorNaoProntoException, JogadorNaoConcordaException;

	void aprovaConfiguracao(Usuario user) throws RemoteException;

	void cancelaAprovacaoConfiguracao(Usuario user) throws RemoteException;

	boolean stop() throws RemoteException;

	void vota(Usuario user,TreeMap<Tema, List<Resultado>> respostas)
			throws RemoteException;			
}
