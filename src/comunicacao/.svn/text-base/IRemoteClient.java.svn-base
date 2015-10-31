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
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.TreeMap;

import state.IState;

/**
 * Interface responsavel por definir os metodos a serem chamados pelo servidor
 * atraves do RMI.
 * 
 * @author thyago
 */
public interface IRemoteClient extends Remote {

	void update(IState state, IRemoteServer server) throws RemoteException;

	String getNomeCliente() throws RemoteException;

        int getPorta() throws RemoteException;

        boolean estou_pronto() throws RemoteException;

        boolean confirmaConfiguracao() throws RemoteException;

	void terminaJogo() throws RemoteException;

	TreeMap<Tema, Resultado> get_respostas() throws RemoteException;
	
	void set_respostas_validadas(TreeMap<Tema, Resultado> respostas)
			throws RemoteException;
	
	
	
}
