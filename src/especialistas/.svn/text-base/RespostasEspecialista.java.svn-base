package especialistas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import adedanha.Resultado;
import adedanha.Tema;

public class RespostasEspecialista {
	private HashMap<String,TreeMap<Tema, Resultado>> respostas;

	public HashMap<String, TreeMap<Tema, Resultado>> getRespostas() {
		return respostas;
	}

	public void setRespostas(HashMap<String, TreeMap<Tema, Resultado>> respostas) {
		this.respostas = respostas;
	}
	
	public RespostasEspecialista(){
		respostas  = new HashMap<String, TreeMap<Tema,Resultado>>();
	}
	
	public TreeMap<Tema, List<Resultado>> getRespostasUnificadas(){
		TreeMap<Tema, List<Resultado>> respostasUnificadas = new TreeMap<Tema, List<Resultado>>();
		for(String user: respostas.keySet()){
			TreeMap<Tema, Resultado> respostasUsuario = respostas.get(user);
			if(respostasUsuario != null){
				for(Tema t : respostasUsuario.keySet()){
					List<Resultado> resultados = respostasUnificadas.get(t);
					if(resultados  == null){
						resultados = new ArrayList<Resultado>();
						
						respostasUnificadas.put(t,resultados);
						if(respostasUsuario.get(t) != null && !respostasUsuario.get(t).get_resposta().trim().equals("")){
							resultados.add(respostasUsuario.get(t));
						}
					}else{
						if(respostasUsuario.get(t) != null && !respostasUsuario.get(t).get_resposta().trim().equals("")&& !resultados.contains(respostasUsuario.get(t))){
							resultados.add(respostasUsuario.get(t));
						}
					}
				}
			}
		}
		for(Tema t: respostasUnificadas.keySet()){
			System.out.println("Tema: "+ t.get_nome());
			List<Resultado> res = respostasUnificadas.get(t);
			Collections.sort(res);
			for(int i =0; i < res.size(); i++){
				System.out.println("Resultado: "+ res.get(i).get_resposta());
			}
		}
		return respostasUnificadas;
	}
}
