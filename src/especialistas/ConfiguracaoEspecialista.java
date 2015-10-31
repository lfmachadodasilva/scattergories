package especialistas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import comunicacao.Server;

import adedanha.Usuario;

public class ConfiguracaoEspecialista {

	private HashMap<String,Boolean> confirmacoes;

	public HashMap<String, Boolean> getConfirmacoes() {
		return confirmacoes;
	}

        public void setConfirmacao(String user, boolean confirmacao) {
            confirmacoes.put(user, confirmacao);
        }

	public void setConfirmacoes(HashMap<String, Boolean> confirmacoes) {
		this.confirmacoes = confirmacoes;
	}
	
	public ConfiguracaoEspecialista(){
		confirmacoes = new HashMap<String, Boolean>();
	}

	public boolean verificaConfirmacoes(Server server){
//		TreeMap<String,Usuario> usuarios = server.getJogo().getUsuarioTree();
//		if(usuarios != null && usuarios.size() > 0){
//			System.out.println("Jogos size:" + usuarios.size());
//			boolean res = true;
//			Iterator it = usuarios.keySet().iterator();
//			while(it.hasNext()){
//					String key = (String)it.next();
//					Boolean resposta = confirmacoes.get(key);
//					System.out.println("Respostas confirmadas: "+ key + " \\"+ resposta);
//					if(resposta == null || !resposta.booleanValue()){
//						res= false;
//					}
//
//			}
//			return res;
//		}
//		return false;

            for(Boolean conf: confirmacoes.values()) {
                if(conf == false)
                    return false;
            }

            return true;
	}
}
