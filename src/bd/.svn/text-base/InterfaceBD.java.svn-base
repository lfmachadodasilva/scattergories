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

package bd;

import adedanha.Tema;
import adedanha.Historico;

/**
 * Interface com os metodos necessarios para o uso do Banco de Dados pelas
 * classes de negocio.
 *
 * @author thyago
 */
public interface InterfaceBD {
    public InterfaceBD get_instance(); // Singleton

    public boolean existe_tema(Tema t);
    public void add_tema(Tema t);
    public Tema get_tema(String nome);
    public void update_tema(Tema t);
    public void remove_tema(Tema t);

    public boolean existe_historico(Historico h);
    public Historico add_historico(Historico h);
    public Historico get_historico(String username);
    public void update_historico(Historico h);
    public void remove_historico(Historico h);
}
