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

import java.util.Calendar;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author thyago
 */
public class Rodada  implements Serializable{
    /**
     * Lista de temas escolhidos para essa rodada.
     */
    Vector<Tema> temas_escolhidos;

    /**
     * Letra da Rodada.
     */
    Letra letra;

    /**
     * Construtor. Inicia a lista de temas vazia.
     */
    public Rodada() {
        temas_escolhidos = new Vector<Tema>();
    }

    /**
     * Construtor. Recebe a lista de temas a serem usados na Rodada.
     *
     * @param temas Lista de temas a serem usados na Rodada.
     */
    public Rodada(Vector<Tema> temas) {
        temas_escolhidos.addAll(temas);
    }

    /**
     * Retorna a letra sorteada. Caso sorteia_letra nao tenha sido chamado
     * anteriormente, retorna null.
     *
     * @return Letra sorteada ou null.
     */
    public Letra get_letra() {
        return letra;
    }

    /**
     * Adiciona os temas a serem usados na Rodada.
     *
     * @param temas Lista de temas a serem usados na Rodada.
     */
    public void set_temas(Vector<Tema> temas) {
        temas_escolhidos.addAll(temas);
    }

    /**
     * Sorteia a letra a ser utilizada na Rodada e a retorna.
     *
     * @param validas Conjunto de letras validas para serem sorteadas.
     * @return Letra sorteada.
     */
    public Letra sorteia_letra(TreeMap<Letra, Boolean> validas) {
        Vector<Letra> vector_validas = new Vector<Letra>();
        Set<Entry<Letra, Boolean>> set_validas = validas.entrySet();

        for(Entry<Letra, Boolean> l: set_validas) {
            if(l.getValue() == true)
                vector_validas.add(l.getKey());
        }

        if(vector_validas.size() == 0)
            return null;

        Letra l = get_letra_aleatoria(vector_validas);
        letra = l;

        return l;
    }

    /**
     * Sorteia uma letra aleatoriamente e a retorna.
     *
     * @return Letra aleatoria.
     */
    private Letra get_letra_aleatoria(Vector<Letra> letras) {
        Letra l;

        Random r = new Random();
        r.setSeed(Calendar.getInstance().getTimeInMillis());
        // Seleciona uma letra aleatoria.
        int indice = r.nextInt(letras.size());

        // Seleciono a letra do indice sorteado
        l = letras.elementAt(indice);

        return l;
    }

    /**
     * Obtem os temas escolhidos para esta rodada.
     *
     * @return Lista de temas escolhidos na rodada atual.
     */
    public Vector<Tema> get_temas() {
        return temas_escolhidos;
    }
}
