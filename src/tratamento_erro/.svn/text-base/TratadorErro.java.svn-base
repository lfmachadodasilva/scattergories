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

package tratamento_erro;

/**
 *
 * @author thyago
 */
public class TratadorErro {
    /**
     * Instancia da classe. Essa classe eh implementada segundo o padrao singleton.
     */
    static TratadorErro instancia;

    /**
     * Construtor. Privado pois so deve existir uma instancia da classe e ela
     * deve ser criada somente no metodo get_instancia.
     */
    private TratadorErro() {
    }

    /**
     * Metodo estatico responsavel por retornar a unica instancia da classe e
     * cria-la caso nao exista.
     *
     * @return Instancia da classe.
     */
    public static TratadorErro get_instancia() {
        if(instancia == null)
            instancia = new TratadorErro();

        return instancia;
    }

    public void exibir_erro(String mensagem) {
        //TODO (Thyago, 2010-04-24) Implementar janela para exibicao do erro.
    }
}
