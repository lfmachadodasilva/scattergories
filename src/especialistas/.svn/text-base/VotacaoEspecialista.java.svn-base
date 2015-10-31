package especialistas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import tratamento_erro.ErroDeProgramacao;

import comunicacao.Server;

import adedanha.Resultado;
import adedanha.Tema;
import adedanha.Usuario;
import java.rmi.RemoteException;

public class VotacaoEspecialista {
	private TreeMap<String,TreeMap<Tema, List<Resultado>>> respostas;

	public TreeMap<String, TreeMap<Tema, List<Resultado>>> getRespostas() {
		return respostas;
	}

	public void setRespostas(
			TreeMap<String, TreeMap<Tema, List<Resultado>>> respostas) {
		this.respostas = respostas;
	}
	public VotacaoEspecialista(){
		respostas = new TreeMap<String,TreeMap<Tema, List<Resultado>>>();
	}
	
	public boolean verificaConfirmacoes(Server server){
            try {
		TreeMap<String,Usuario> usuarios = server.getJogo().getUsuarioTree();
		if(usuarios != null && usuarios.size() > 0){
			boolean res = true;
			Iterator it = usuarios.keySet().iterator();
			while(it.hasNext()){
					String key = (String)it.next();
					if(respostas.get(key) == null)
					{
						res = false;
					}
					
				
			}
			return res;
		}
            }catch(RemoteException e) {
                e.printStackTrace();
            }
		return false;
	}
	
	public void calculaPontuacao(Server server){
        //Mantem copia padrao das respostas que foram validadas.
        //Configuracao do array: [0]->10 pontos; [1]->5 pontos; [2]->0 pontos


        TreeMap<Tema, TreeMap<Resultado, int[]>> resultado = new TreeMap<Tema, TreeMap<Resultado, int[]>>();

        String user = respostas.keySet().iterator().next();
        TreeMap<Tema, List<Resultado>> respostasUser = respostas.get(user);
        for (Tema t : respostasUser.keySet()) {
            List<Resultado> resPrimeiro = respostasUser.get(t);
            TreeMap<Resultado, int[]> mapaResultado = new TreeMap<Resultado, int[]>();
            for (Resultado r : resPrimeiro) {
                int[] votos = new int[3];
                for (int v = 0; v < 3; v++) {
                    votos[v] = 0;
                }
                mapaResultado.put(r, votos);

            }
            resultado.put(t, mapaResultado);
        }


        //Agora computa respostas dadas por todos os usu�rios

        for (String user_it : respostas.keySet()) {
            respostasUser = respostas.get(user_it);
            for (Tema t_it : respostasUser.keySet()) {
                List<Resultado> res = respostasUser.get(t_it);
                for (Resultado r_it : res) {
                    int[] votos = resultado.get(t_it).get(r_it);
                    if (r_it.get_pontuacao() == 10) {
                        votos[0]++;
                    } else if (r_it.get_pontuacao() == 5) {
                        votos[1]++;
                    } else {
                        votos[2]++;
                    }
                }
            }
        }

        //Agora verifica a maior pontua��o
        for (Tema t_val : resultado.keySet()) {
            TreeMap<Resultado, int[]> mapVal = resultado.get(t_val);
            for (Resultado r_val : mapVal.keySet()) {
                int[] votos = mapVal.get(r_val);
                if ((votos[0] > votos[1]) && (votos[0] > votos[2])) {
                    r_val.set_pontuacao(10);
                } else if ((votos[1] > votos[0]) && (votos[1] > votos[2])) {
                    r_val.set_pontuacao(5);
                } else {
                    r_val.set_pontuacao(0);
                }
            }
        }

        //Recupera lista de usu�rios e respostas do usu�rio e vai colocando a pontua��o correta
        List<Usuario> usuariosJogo;
        try {
            usuariosJogo = server.getJogo().get_usuarios();
            HashMap<String, TreeMap<Tema, Resultado>> respostasUsuarios = server.getRespEspecialista().getRespostas();
            for (Usuario u : usuariosJogo) {
                TreeMap<Tema, Resultado> mapaRespsUsuario = respostasUsuarios.get(u.get_username());
                int pontuacaoAtual = 0;
                for (Tema t_usu : mapaRespsUsuario.keySet()) {
                    Resultado resUsuario = mapaRespsUsuario.get(t_usu);
                    if (resUsuario.get_resposta() == null || resUsuario.get_resposta().trim().equals("")) {
                        resUsuario.set_pontuacao(0);
                    } else {
                        Set<Resultado> setRes = resultado.get(t_usu).keySet();
                        Iterator<Resultado> itRes = setRes.iterator();
                        while (itRes.hasNext()) {
                            Resultado resIt = itRes.next();
                            if (resIt.equals(resUsuario)) {
                                resUsuario.set_pontuacao(resIt.get_pontuacao());
                                pontuacaoAtual += resIt.get_pontuacao();
                            }
                        }
                    }
                }

                u.setPontuacaoAtual(pontuacaoAtual);
                u.setPontuacaoTotal(u.getPontuacaoTotal() + pontuacaoAtual);
            }
        } catch  (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
