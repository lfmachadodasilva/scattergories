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
package controller;

import adedanha.Letra;
import adedanha.Resultado;
import adedanha.Rodada;
import adedanha.Tema;
import adedanha.Usuario;
import gui.TelaInicial;

import java.io.Serializable;
import java.rmi.RemoteException;

import comunicacao.Client;
import comunicacao.IRemoteServer;
import comunicacao.Server;
import gui.TelaConfiguracao;
import gui.TelaJogo;
import gui.TelaResultadoFinal;
import gui.TelaVotacao;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import state.NovaRodada;

import tratamento_erro.ErroComunicacao;
import tratamento_erro.JogadorNaoConcordaException;
import tratamento_erro.JogadorNaoProntoException;
import tratamento_erro.LetrasInsuficientesException;
import tratamento_erro.TemasInsuficientesException;

public class Controller implements Serializable {

    private IRemoteServer server;
    private Client cliente;
    private TelaConfiguracao telaConfiguracao;
    private TelaJogo telaJogo;
    private TelaVotacao telaVotacao;

    public TelaVotacao getTelaVotacao() {
        return telaVotacao;
    }

    public void setTelaVotacao(TelaVotacao telaVotacao) {
        this.telaVotacao = telaVotacao;
    }

    public Controller() {
    }

    public void registraCliente() {
        try {
            server.addObserver(cliente);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void conectaCliente(TelaInicial inicial, String ip, int portaServidor) throws ErroComunicacao {
        server = Client.conectaCliente(ip, 9010);
//        try {
            cliente = Client.getInstance(portaServidor);
//        } catch (RemoteException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
        cliente.setController(this);
        System.out.println("Server conecta cliente" + server);

    }

    /**
     * Adiciona um usuario ao jogo ao qual estah conectado.
     *
     * @param user
     *            Usuario a ser adicionado.
     */
    public boolean add_usuario(Usuario user) {
        try {
            cliente.setUser(user);
            boolean added = server.add_usuario(user);
            return added;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Remove um usuario ao jogo ao qual estah conectado.
     *
     * @param user
     *            Usuario a ser removido.
     */
    public void remove_usuario() {
        try {
            server.removeObserver(cliente);
            server.remove_usuario(cliente.getUser());
            if (cliente.getUser().isUsuarioServidor()) {
                server.terminaJogo();
            }

        } catch (RemoteException e) {
            // TODO (Thyago, 2010-06-13) Criar tratamento de erros.
        }
    }

    /**
     * Obtem a lista de nomes dos usuarios conectados ao jogo.
     *
     * @return Lista de nomes dos usuarios conectados ao jogo.
     */
    public List<String> get_user_list() {
        try {
            List<String> users = server.get_user_list();
            return users;
        } catch (RemoteException e) {
            // TODO (Thyago, 2010-06-13) Criar tratamento de erros.
            return new LinkedList<String>();
        }
    }

    public TelaConfiguracao getTelaConfiguracao() {
        return telaConfiguracao;
    }

    public void setTelaConfiguracao(TelaConfiguracao telaConfiguracao) {
        this.telaConfiguracao = telaConfiguracao;
    }

    public TelaJogo getTelaJogo() {
        return telaJogo;
    }

    public void setTelaJogo(TelaJogo telaJogo) {
        this.telaJogo = telaJogo;
    }

    public void atualizaJogadores() {
        if (telaConfiguracao != null) {
            telaConfiguracao.atualizaListaJogadores();
        }
        if (telaJogo != null) {
            telaJogo.atualizaListaJogadores();
        }
    }

    public IRemoteServer getServer() {
        return server;
    }

    public void setServer(IRemoteServer server) {
        this.server = server;
    }

    public void inicializaServidor(int porta) {

        try {
            server = Server.getInstance(porta);
            System.out.println("Porta que vai ser usada: " + porta);
            server.inicializa();

        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }

    public void terminaJogo() {
        if (telaConfiguracao != null) {
            telaConfiguracao.terminaJogo();
        }
        if (telaJogo != null) {
            telaJogo.terminaJogo();
        }
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public void recebeMensagem(String texto) {
        if (telaConfiguracao != null) {
            telaConfiguracao.setMensagem(texto);
        }
        if (telaJogo != null) {
            telaJogo.setMensagem(texto);
        }
    }

    public void enviaMensagem(String texto) {
        try {
            server.enviaMensagem(texto);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void enviaAtualizacaoConfiguracao(TreeSet<Tema> temas,
            TreeMap<Letra, Boolean> letras_validas, float tempo, int numRodadas) {
        try {
            server.atualizaConfiguracao(temas, letras_validas, tempo,
                    numRodadas);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void atualizaConfiguracao(TreeSet<Tema> temas,
            TreeMap<Letra, Boolean> letras_validas, float tempo, int numRodadas) {
        if (telaConfiguracao != null) {
            telaConfiguracao.setTemas(temas);
            telaConfiguracao.setLetras_validas(letras_validas);
            telaConfiguracao.setTempoMaximo(tempo);
            telaConfiguracao.setNumRodadas(numRodadas);
            telaConfiguracao.atualizaConfiguracoes();
        }
    }

    public void confirmaConfiguracao(TreeSet<Tema> temas,
            TreeMap<Letra, Boolean> letras_validas, float tempo, int numRodadas) {
        try {
            server.confirmaConfiguracao(temas, letras_validas, tempo, numRodadas, cliente.getUser());

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (TemasInsuficientesException e) {
            telaConfiguracao.exibeMensagemErro(e.getMessage());
        } catch (LetrasInsuficientesException e) {
            telaConfiguracao.exibeMensagemErro(e.getMessage());
        } catch (JogadorNaoProntoException e) {
            telaConfiguracao.exibeMensagemErro(e.getMessage());
        } catch (JogadorNaoConcordaException e) {
            telaConfiguracao.exibeMensagemErro(e.getMessage());
        }
    }

    public void solicitaConfirmacaoConfiguracao() {
        if (telaConfiguracao != null) {
            telaConfiguracao.solicitaConfirmacaoConfiguracao();
        }
    }

    public void exibeMensagemInicioJogo() {
        if (telaConfiguracao != null) {
            telaConfiguracao.exibeMensagemInicioJogo();
        }
    }

    public void aprovaConfiguracao() {
        try {
            server.aprovaConfiguracao(cliente.getUser());
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void cancelaAprovaConfiguracao() {
        try {
            server.cancelaAprovacaoConfiguracao(cliente.getUser());
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Inicia uma rodada nova e a configura como a rodada atual.
     */
    public void inicia_rodada() {
        try {
            server.inicia_rodada();
        } catch (RemoteException e) {
            // TODO (Thyago, 2010-06-19) Criar tratamento de erros.
        }
    }

    /**
     * Obtem a rodada atual no servidor.
     *
     * @return Rodada atual no servidor ou null caso haja alugm erro.
     */
    public Rodada get_rodada_atual() {
        try {
            return server.get_rodada_atual();
        } catch (RemoteException e) {
            // TODO (Thyago, 2010-06-13) Criar tratamento de erros.
            return null;
        }
    }

    public Integer get_num_rodada_atual() {
        try {
            return server.get_num_rodada_atual();
        } catch (RemoteException e) {
            // TODO (Thyago, 2010-06-13) Criar tratamento de erros.
            return new Integer(0);
        }
    }

    /**
     * Pede ao servidor para parar o jogo.
     *
     * @return Retorna true se o jogador tiver sido o primeiro a pedir para
     *         parar e false caso contrario.
     */
    public boolean pede_stop() {
        try {
            return server.stop();
        } catch (RemoteException e) {
            // TODO (Thyago, 2010-06-23) Criar tratamento de erros.
            return false;
        }

    }

    public void stop() {
        // TODO (Thyago, 2010-06-25) Implementar a mudanca de tela para mostrar
        // ao cliente que o jogo foi parado.
        telaJogo.stop();
    }

    public TreeMap<Tema, Resultado> get_respostas() {
        return telaJogo.get_respostas();
    }

    public void inicia_votacao(TreeMap<Tema, List<Resultado>> respostas) {
        telaJogo.setVisible(false);
        telaVotacao = new TelaVotacao(this, respostas);
        telaVotacao.setVisible(true);
    }

    public void confirmaRespostas(TreeMap<Tema, List<Resultado>> respostas) {
        try {
            server.vota(cliente.getUser(), respostas);
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void fimRodada() {
        try {
            TelaResultadoFinal res = new TelaResultadoFinal(server.getJogo().get_usuarios());
            res.setVisible(true);
            telaVotacao.setVisible(false);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
