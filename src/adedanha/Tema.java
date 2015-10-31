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

import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import sun.misc.Compare;

/**
 *
 * @author thyago
 */
public class Tema implements Comparable<Tema>, Serializable {
    /**
     * Nome do tema.
     */
    private String nome;

    /**
     * Lista de palavras validas para esse tema. A lista deve ser preenchida
     * com informacoes armazenadas anteriormente atraves do metodo
     * set_palavras_validas.
     */
    private TreeSet<String> palavras_validas;

    /**
     * Flag para demonstrar se foi adicionada alguma palavra nova a lista de
     * palavras validas (significando que precisa ser gravada novamente).
     */
    private boolean palavras_validas_modificadas;

    /**
     * Construtor. Cria a lista de palavras validas vazia.
     *
     * @param nome Nome do tema.
     */
    public Tema(String nome) {
        this.nome = nome;
        palavras_validas_modificadas = false;

        palavras_validas = new TreeSet<String>();
    }

    /**
     * Construtor. Recebe uma lista de palavras validas para ele.
     *
     * @param nome Nome do tema.
     * @param palavras Lista de palavras validas para esse tema.
     */
    public Tema(String nome, Collection<String> palavras) {
        this.nome = nome;
        palavras_validas_modificadas = false;

        palavras_validas = new TreeSet<String>();
        for(String s: palavras)
            palavras_validas.add(s);
    }

    /**
     * Compara dois temas pelo nome.
     *
     * @param t Outro Tema a ser comparado.
     * @return 0 se forem iguais, -1 se o Tema recebido for maior e 1 se for menor.
     */
    public int compareTo(Tema t) {
        return t.get_nome().compareTo(this.nome);
    }

    /**
     * Obter o nome do tema.
     *
     * @return String com o nome do Tema.
     */
    public final String get_nome() {
        return nome;
    }

    /**
     * Setar a lista de palavras validas do Tema.
     * 
     * @param palavras Lista de palavras validas.
     */
    public void set_palavras_validas(Collection<String> palavras) {
        for(String s: palavras)
            palavras_validas.add(s);
    }

    /**
     * Verifica se a palavra recebida eh valida no Tema.
     *
     * @param palavra Palavra a ser verificada.
     * @return true se a palavra for valida e false se nao for.
     */
    public boolean palavra_eh_valida(String palavra) {
        return palavras_validas.contains(palavra);
    }

    /**
     * Verifica se foi adicionada alguma palavra nova aa lista de palavras
     * validas do Tema.
     *
     * @return true se houver palavras novas e false do contrario.
     */
    public boolean palavras_validas_modificadas() {
        return palavras_validas_modificadas;
    }

    /**
     * Inclui uma palavra valida no Tema.
     *
     * @param palavra Palavra a ser incluida na lista de palavras validas do
     * Tema.
     */
    public void inclui_palavra_valida(String palavra) {
        palavras_validas.add(palavra);
        palavras_validas_modificadas = true;
    }
}
