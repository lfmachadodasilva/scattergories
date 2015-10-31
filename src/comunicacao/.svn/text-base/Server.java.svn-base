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

import java.io.Serializable;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

import especialistas.ConfiguracaoEspecialista;
import especialistas.RespostasEspecialista;
import especialistas.VotacaoEspecialista;
import gui.TelaResultadoFinal;
import javax.swing.JOptionPane;
import state.AtualizacaoConfiguracao;
import state.AtualizacaoJogador;
import state.ComecoJogo;
import state.ConfirmacaoConfiguracao;
import state.FimRodada;
import state.IState;
import state.InicioValidacao;
import state.NovaMensagem;
import state.NovaRodada;
import state.StopRodada;
import tratamento_erro.JogadorNaoConcordaException;
import tratamento_erro.JogadorNaoProntoException;
import tratamento_erro.LetrasInsuficientesException;
import tratamento_erro.TemasInsuficientesException;

public class Server implements IRemoteServer, Serializable {

	private List<IRemoteClient> observers;
	private static Server instance;
	private int porta;
	private Jogo jogo;
	private ConfiguracaoEspecialista confEspecialista;
	private RespostasEspecialista respEspecialista;
	private VotacaoEspecialista votEspecialista;

	public static Server getInstance(int porta) {
		if (instance == null) {
			instance = new Server(porta);
		}
		return instance;
	}

	private Server(int porta) {
		this.porta = porta;
		observers = new ArrayList<IRemoteClient>();
		jogo = new Jogo();
		confEspecialista = new ConfiguracaoEspecialista();
		respEspecialista = new RespostasEspecialista();
		votEspecialista = new VotacaoEspecialista();
	}

	public void addObserver(IRemoteClient o) throws RemoteException {
		observers.add(o);

	}

	public void notifyObservers(IState update) throws RemoteException {
		for (int i = 0; i < observers.size(); i++) {
			try {
				observers.get(i).update(update, this);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public IRemoteClient removeObserver(IRemoteClient o) throws RemoteException {
		if (observers.remove(o)) {
			return o;
		} else {
			return null;
		}

	}

        public int get_new_cliet_port() throws RemoteException {
            int p = this.porta + 1;
            int max_client_port = 0;

            for(IRemoteClient c: observers) {
                if(c.getPorta() > max_client_port)
                    max_client_port = c.getPorta();
            }

            if(max_client_port != 0)
                p = max_client_port + 1;

            return p;
        }

	public boolean inicializa() throws RemoteException {
		System.setProperty("java.security.policy", "policy.txt");

		System.setSecurityManager(new RMISecurityManager());
		try {
			// UnicastRemoteObject.unexportObject(this, true);
			IRemoteServer fileCont = (IRemoteServer) UnicastRemoteObject
					.exportObject(this, 0);
			Registry registry = LocateRegistry.createRegistry(porta);
			registry.rebind("ServerConstrucao", fileCont);

			return true;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean add_usuario(Usuario user) throws RemoteException {
		boolean added = jogo.add_usuario(user);
		if (added) {
			notifyObservers(new AtualizacaoJogador());
			return true;
		} else {
			return false;
		}
	}

	public void remove_usuario(Usuario user) throws RemoteException {
		jogo.remove_usuario(user);
		notifyObservers(new AtualizacaoJogador());
	}

	/**
	 * Retorna a lista de nomes dos usuarios conectados no jogo.
	 * 
	 * @return Lista de nomes dos usuarios conectados no jogo.
	 */
	public List<String> get_user_list() throws RemoteException {
		List<String> names = new LinkedList<String>();
		List<Usuario> users = jogo.get_usuarios();

		for (Usuario u : users)
			names.add(u.get_username());

		return names;
	}

	/**
	 * Adiciona os temas recebidos ao jogo apagando os que houvessem
	 * anteriormente.
	 * 
	 * @param temas
	 *            Temas a serem adicionados ao jogo.
	 */
	private void set_temas(List<Tema> temas) throws RemoteException {
		jogo.set_temas(new Vector<Tema>(temas));
	}

	/**
	 * Define quais sao as letras validas no jogo.
	 * 
	 * @param letras
	 *            Letras validas no jogo.
	 */
	private void set_letras(TreeMap<Letra, Boolean> letras)
			throws RemoteException {
		for (Entry<Letra, Boolean> e : letras.entrySet())
			jogo.set_letra_invalida(e.getKey(), e.getValue());
	}

	/**
	 * Define o tempo de duração da rodada em minutos.
	 * 
	 * @param tempo
	 *            Tempo de duração da rodada em minutos.
	 */
	private void set_tempo_rodada(float tempo) throws RemoteException {
		jogo.set_tempo_rodada(tempo);
	}

	/**
	 * Define o numero de rodadas do jogo.
	 * 
	 * @param num_rodadas
	 *            Numero de rodadas do jogo. Deve ser maior que 0.
	 */
	private void set_num_rodadas(int num_rodadas) throws RemoteException {
		jogo.set_num_rodadas(num_rodadas);
	}

	/**
	 * Obtem a rodada atual.
	 * 
	 * @return Obtem a Rodada atual do jogo ou null se nao houver.
	 */
	public Rodada get_rodada_atual() throws RemoteException{
		return jogo.get_rodada_atual();
	}

	/**
	 * Inicia uma nova Rodada.
	 */
	public void inicia_rodada() throws RemoteException {
		jogo.inicia_rodada();
	}

	public void terminaJogo() throws RemoteException {
		while (observers.size() > 0) {
			try {
				observers.get(0).terminaJogo();
				observers.remove(0);
				UnicastRemoteObject.unexportObject(this, true);
				Registry registry = LocateRegistry.getRegistry(porta);
				registry.unbind("ServerConstrucao");

			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public int getPorta()throws RemoteException {
		return porta;
	}

	public void setPorta(int porta) throws RemoteException{
		this.porta = porta;
	}

	public void enviaMensagem(String texto) throws RemoteException {
		notifyObservers(new NovaMensagem(texto));

	}

	public void atualizaConfiguracao(TreeSet<Tema> temas,
			TreeMap<Letra, Boolean> letras_validas, float tempo, int numRodadas)
			throws RemoteException {
		notifyObservers(new AtualizacaoConfiguracao(temas, letras_validas,
				tempo, numRodadas));

	}

	public void confirmaConfiguracao(TreeSet<Tema> temas,
			TreeMap<Letra, Boolean> letras_validas, float tempo,
			int numRodadas, Usuario user) throws RemoteException,
			TemasInsuficientesException, LetrasInsuficientesException,
                        JogadorNaoProntoException, JogadorNaoConcordaException {
		if (temas == null || temas.size() < 3) {
			throw new TemasInsuficientesException();
		}
		if (temas.size() > 12) {

		}
		int cont = 0;
		if (letras_validas == null || letras_validas.size() == 0) {
			throw new LetrasInsuficientesException();
		} else {
			Iterator it = letras_validas.keySet().iterator();
			while (it.hasNext()) {
				Letra l = (Letra) it.next();
				if (letras_validas.get(l).booleanValue()) {
					cont++;
				}
			}

			if (cont < 3) {
				throw new LetrasInsuficientesException();
			}
		}
		set_letras(letras_validas);
		set_num_rodadas(numRodadas);
		set_temas(new LinkedList<Tema>(temas));
		set_tempo_rodada(tempo);

		confEspecialista.getConfirmacoes().clear();
                for(IRemoteClient c: observers) {
                    confEspecialista.setConfirmacao(c.getNomeCliente(), false);
                }
		confEspecialista.setConfirmacao(user.get_username(), true);
		notifyObservers(new ConfirmacaoConfiguracao());

                try {
                    while(!confEspecialista.verificaConfirmacoes(this))
                        wait(1000);
                } catch(InterruptedException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(),
                            "Erro de Interrupcao", JOptionPane.ERROR_MESSAGE);
                }
	}

	public void aprovaConfiguracao(Usuario user) throws RemoteException {
		confEspecialista.setConfirmacao(user.get_username(), true);
		boolean res = confEspecialista.verificaConfirmacoes(this);

                // Se todos os usuarios tiverem concordado
		if (res) {
                        /* Servidor comeca primeira rodada */
                        inicia_rodada();
			notifyObservers(new ComecoJogo());
		}

	}

	public void cancelaAprovacaoConfiguracao(Usuario user)
			throws RemoteException {
		confEspecialista.setConfirmacao(user.get_username(), false);
	}

	public Jogo getJogo() throws RemoteException {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	/**
	 * Obtem o numero da rodada atual do jogo.
	 * 
	 * @return Integer com o numero da rodada atual do jogo. Eh retornado 0 se
	 *         nao houver uma rodada atual.
	 */
	public Integer get_num_rodada_atual() throws RemoteException {
		return jogo.get_num_rodada_atual();
	}

	public boolean stop() throws RemoteException {
		if (jogo.stop() == false)
			return false;

		try {
			notifyObservers(new StopRodada());
			for (IRemoteClient c : observers) {
				respEspecialista.getRespostas().put(c.getNomeCliente(),
						c.get_respostas());
			}
		} catch (RemoteException e) {
			// TODO (Thyago, 2010-06-23) Tratar erro
			return false;
		}

		notifyObservers(new InicioValidacao(respEspecialista
				.getRespostasUnificadas()));

		return true;
		
	}

	public void vota(Usuario user,TreeMap<Tema, List<Resultado>> respostas)
			throws RemoteException {
		if(votEspecialista.getRespostas().get(user.get_username()) == null){
			votEspecialista.getRespostas().put(user.get_username(),respostas);
		}
		boolean res = votEspecialista.verificaConfirmacoes(this);
		if(res){
                    votEspecialista.calculaPontuacao(this);
                    try {
                        if (jogo.get_num_rodadas() > jogo.get_num_rodada_atual()) {
                            confEspecialista = new ConfiguracaoEspecialista();
                            votEspecialista = new VotacaoEspecialista();
                            
                            inicia_rodada();
                            notifyObservers(new NovaRodada());
                        } else {
                            notifyObservers(new FimRodada());
                        }
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
		}
	}

	public RespostasEspecialista getRespEspecialista() {
		return respEspecialista;
	}
	
	
}
