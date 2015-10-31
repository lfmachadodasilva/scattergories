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

import adedanha.Resultado;
import adedanha.Tema;

import java.io.Serializable;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import state.IState;
import tratamento_erro.ErroComunicacao;

import controller.Controller;

import adedanha.Usuario;
import gui.TelaConfiguracao;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class Client implements IRemoteClient, Serializable {
	private static Client instance;
	private Usuario user;
	private Controller controller;
	private int porta;

	public static Client getInstance(int porta) throws ErroComunicacao {
		if (instance == null) {
			instance = new Client(porta);
		}
		return instance;
	}

	private Client(int porta) throws ErroComunicacao {
		this.porta = porta;
		iniciaReceptor(this, porta);
	}

	static public IRemoteServer conectaCliente(String ip, int portaServidor) {
		try {
			Registry registry = LocateRegistry.getRegistry(ip, portaServidor);
			IRemoteServer server = (IRemoteServer) registry
					.lookup("ServerConstrucao");
			// server.addObserver((IRemoteClient)this);
			return server;

		} catch (RemoteException e) {
			e.printStackTrace();
			return null;

		} catch (NotBoundException e) {
			e.printStackTrace();
			return null;
		}

	}

	public void update(IState state, IRemoteServer server)
			throws RemoteException {
		this.getController().setServer(server);
		state.action(this);

	}

        public int getPorta() throws RemoteException {
            return porta;
        }

        public boolean estou_pronto() throws RemoteException {
            return controller.getTelaConfiguracao().get_pronto();
        }

        public boolean confirmaConfiguracao() throws RemoteException {
            if(JOptionPane.showConfirmDialog(null, "Concorda com a configuracao atual?",
                    "Confirmar Configuracao", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                return true;
            
            return false;
        }

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;

	}

	public String getNomeCliente() throws RemoteException {
		return user.get_username();
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public void iniciaReceptor(IRemoteClient cliente, int porta)
			throws ErroComunicacao {
		System.setProperty("java.security.policy", "policy.txt");
		System.setSecurityManager(new RMISecurityManager());

		try {
			LocateRegistry.createRegistry(porta);
		} catch (RemoteException e) {
			throw new ErroComunicacao();
		}
		try {
			UnicastRemoteObject.unexportObject(cliente, true);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		try {
			IRemoteClient observer = (IRemoteClient) UnicastRemoteObject
					.exportObject(cliente, 0);
			Registry registry;
			registry = LocateRegistry.getRegistry(porta);
			registry.rebind("Client", observer);
		} catch (RemoteException e) {
			throw new ErroComunicacao();
		}
	}

	public void terminaJogo() throws RemoteException {
		UnicastRemoteObject.unexportObject(this, true);
		Registry registry = LocateRegistry.getRegistry(porta);
		try {
			registry.unbind("Client");
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getController().terminaJogo();

	}

	public TreeMap<Tema, Resultado> get_respostas() throws RemoteException {
		return controller.get_respostas();
	}

	
	

	public void set_respostas_validadas(TreeMap<Tema, Resultado> respostas) throws RemoteException{
		// TODO (Thyago, 2010-06-25) Implementar a recepcao das respostas
		// validadas.
	}
	
	
}
