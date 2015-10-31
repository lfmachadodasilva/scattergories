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
package gui;

import adedanha.Letra;
import adedanha.Tema;
import controller.Controller;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author luizfelipe
 */
public class TelaConfiguracao extends javax.swing.JFrame {

    /**
     * Controlador do jogo.
     */
    private Controller controller;
    /**
     * Lista de usuarios para serem exibidos no chat.
     */
    private Vector<String> usuarios;
    /**
     * Lista de temas a serem usados no jogo e apresentados na lista de
     * categorias.
     */
    private TreeSet<Tema> temas;
    /**
     * Map de letras validas e invalidas. O valor true significa que ela sera valida, o false que nao sera.
     */
    private TreeMap<Letra, Boolean> letras_validas;
    /**
     * Inteiro do tempo de cada rodada. Default 1. 
     */
    private float tempoMaximo = 1;
    /**
     *Inteiro para o numero de rodadas escolhidas. Default 1.
     */
    private int numRodadas = 1;
    /**
     * Flag que mostra se o usuario esta pronto pra comecar um novo jogo ou nao.
     */
    private boolean pronto;


    /** Creates new form TelaConfiguracao */
    public TelaConfiguracao(Controller c) {
        controller = c;
        controller.setTelaConfiguracao(this);

        initComponents();

        usuarios = new Vector<String>(controller.get_user_list());
        lst_chat.setListData(usuarios);

        temas = new TreeSet<Tema>();
        atualizaListaCategorias();

        letras_validas = new TreeMap<Letra, Boolean>();
        for (Letra l : Letra.values()) {
            letras_validas.put(l, false);
        }
        atualizaLetrasValidas();

        l_rodadas.setText(String.valueOf(this.numRodadas));
        l_tempo.setText(String.valueOf(this.tempoMaximo));

        desabilitaTela();
    }

    private void atualizaListaCategorias() {
        Vector<String> nomes_temas = new Vector<String>();

        for (Tema t : temas) {
            nomes_temas.add(t.get_nome());
        }

        lst_categorias.setListData(nomes_temas);
    }

    private int atualizaLetrasValidas() {

        int validas = 0;
        if (letras_validas.get(Letra.A) == true) {
            b_a.setForeground(Color.RED);
            ++validas;
        } else {
            b_a.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.B) == true) {
            b_b.setForeground(Color.RED);
            ++validas;
        } else {
            b_b.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.C) == true) {
            b_c.setForeground(Color.RED);
            ++validas;
        } else {
            b_c.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.D) == true) {
            b_d.setForeground(Color.RED);
            ++validas;
        } else {
            b_d.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.E) == true) {
            b_e.setForeground(Color.RED);
            ++validas;
        } else {
            b_e.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.F) == true) {
            b_f.setForeground(Color.RED);
            ++validas;
        } else {
            b_f.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.G) == true) {
            b_g.setForeground(Color.RED);
            ++validas;
        } else {
            b_g.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.H) == true) {
            b_h.setForeground(Color.RED);
            ++validas;
        } else {
            b_h.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.I) == true) {
            b_i.setForeground(Color.RED);
            ++validas;
        } else {
            b_i.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.J) == true) {
            ++validas;
            b_j.setForeground(Color.RED);
        } else {
            b_j.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.K) == true) {
            b_k.setForeground(Color.RED);
            ++validas;
        } else {
            b_k.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.L) == true) {
            b_l.setForeground(Color.RED);
            ++validas;
        } else {
            b_l.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.M) == true) {
            b_m.setForeground(Color.RED);
            ++validas;
        } else {
            b_m.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.N) == true) {
            b_n.setForeground(Color.RED);
            ++validas;
        } else {
            b_n.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.O) == true) {
            b_o.setForeground(Color.RED);
            ++validas;
        } else {
            b_o.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.P) == true) {
            b_p.setForeground(Color.RED);
            ++validas;
        } else {
            b_p.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.Q) == true) {
            b_q.setForeground(Color.RED);
            ++validas;
        } else {
            b_q.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.R) == true) {
            b_r.setForeground(Color.RED);
            ++validas;
        } else {
            b_r.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.S) == true) {
            b_s.setForeground(Color.RED);
            ++validas;
        } else {
            b_s.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.T) == true) {
            b_t.setForeground(Color.RED);
            ++validas;
        } else {
            b_t.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.U) == true) {
            b_u.setForeground(Color.RED);
            ++validas;
        } else {
            b_u.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.V) == true) {
            b_v.setForeground(Color.RED);
            ++validas;
        } else {
            b_v.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.W) == true) {
            b_w.setForeground(Color.RED);
            ++validas;
        } else {
            b_w.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.X) == true) {
            b_x.setForeground(Color.RED);
            ++validas;
        } else {
            b_x.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.Y) == true) {
            b_y.setForeground(Color.RED);
            ++validas;
        } else {
            b_y.setForeground(Color.BLACK);
        }

        if (letras_validas.get(Letra.Z) == true) {
            b_z.setForeground(Color.RED);
            ++validas;
        } else {
            b_z.setForeground(Color.BLACK);
        }
        return validas;
    }

    public void atualizaListaJogadores() {
        usuarios = new Vector<String>(controller.get_user_list());
        if (lst_chat.getGraphics() != null) {
            lst_chat.setListData(usuarios);
            lst_chat.update(lst_chat.getGraphics());
        }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fr_chat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_chat = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_chat = new javax.swing.JTextArea();
        tf_chat = new javax.swing.JTextField();
        b_chat = new javax.swing.JButton();
        b_IniciarJogo = new javax.swing.JButton();
        b_confVoltar = new javax.swing.JButton();
        fr_conf = new javax.swing.JPanel();
        fr_rodadas = new javax.swing.JPanel();
        l_rodadas = new javax.swing.JLabel();
        b_rodada_menos = new javax.swing.JButton();
        b_rodada_mais = new javax.swing.JButton();
        fr_categorias = new javax.swing.JPanel();
        b_remover = new javax.swing.JButton();
        b_limpar = new javax.swing.JButton();
        tf_categoria = new javax.swing.JTextField();
        b_sugestao = new javax.swing.JButton();
        b_adicionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_categorias = new javax.swing.JList();
        fr_letras = new javax.swing.JPanel();
        b_a = new javax.swing.JButton();
        b_c = new javax.swing.JButton();
        b_b = new javax.swing.JButton();
        b_d = new javax.swing.JButton();
        b_f = new javax.swing.JButton();
        b_e = new javax.swing.JButton();
        b_g = new javax.swing.JButton();
        b_h = new javax.swing.JButton();
        b_i = new javax.swing.JButton();
        b_j = new javax.swing.JButton();
        b_k = new javax.swing.JButton();
        b_l = new javax.swing.JButton();
        b_m = new javax.swing.JButton();
        b_n = new javax.swing.JButton();
        b_o = new javax.swing.JButton();
        b_p = new javax.swing.JButton();
        b_q = new javax.swing.JButton();
        b_r = new javax.swing.JButton();
        b_s = new javax.swing.JButton();
        b_t = new javax.swing.JButton();
        b_x = new javax.swing.JButton();
        b_u = new javax.swing.JButton();
        b_v = new javax.swing.JButton();
        b_w = new javax.swing.JButton();
        b_y = new javax.swing.JButton();
        b_z = new javax.swing.JButton();
        fr_tempo = new javax.swing.JPanel();
        l_tempo = new javax.swing.JLabel();
        b_tempo_menos = new javax.swing.JButton();
        b_tempo_mais = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adedanha - Configuracao");
        setName("telaConfiguracao"); // NOI18N
        setResizable(false);

        fr_chat.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Chat "));

        jScrollPane1.setViewportView(lst_chat);

        ta_chat.setColumns(20);
        ta_chat.setEditable(false);
        ta_chat.setRows(5);
        jScrollPane3.setViewportView(ta_chat);

        b_chat.setText("Enviar");

        javax.swing.GroupLayout fr_chatLayout = new javax.swing.GroupLayout(fr_chat);
        fr_chat.setLayout(fr_chatLayout);
        fr_chatLayout.setHorizontalGroup(
            fr_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fr_chatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fr_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_chat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fr_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addContainerGap())
        );
        fr_chatLayout.setVerticalGroup(
            fr_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fr_chatLayout.createSequentialGroup()
                .addGroup(fr_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fr_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_chat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_chat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        b_IniciarJogo.setText("Iniciar Jogo");
        b_IniciarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_IniciarJogoActionPerformed(evt);
            }
        });

        b_confVoltar.setText("Voltar");
        b_confVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_voltarAction(evt);
            }
        });

        fr_conf.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuracao"));

        fr_rodadas.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade de rodadas"));

        l_rodadas.setText("jLabel2");

        b_rodada_menos.setText("-");
        b_rodada_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_rodada_menosActionPerformed(evt);
            }
        });

        b_rodada_mais.setText("+");
        b_rodada_mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_rodada_maisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fr_rodadasLayout = new javax.swing.GroupLayout(fr_rodadas);
        fr_rodadas.setLayout(fr_rodadasLayout);
        fr_rodadasLayout.setHorizontalGroup(
            fr_rodadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fr_rodadasLayout.createSequentialGroup()
                .addComponent(l_rodadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_rodada_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_rodada_mais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        fr_rodadasLayout.setVerticalGroup(
            fr_rodadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fr_rodadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(l_rodadas)
                .addComponent(b_rodada_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(b_rodada_mais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fr_categorias.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Categorias ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        fr_categorias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fr_categorias.setName("categorias"); // NOI18N

        b_remover.setText("Remover");
        b_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_removerActionPerformed(evt);
            }
        });

        b_limpar.setText("Limpar");
        b_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limparActionPerformed(evt);
            }
        });

        b_sugestao.setText("Sugestao");
        b_sugestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sugestaoActionPerformed(evt);
            }
        });

        b_adicionar.setText("Adicionar");
        b_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_adicionarActionPerformed(evt);
            }
        });

        lst_categorias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lst_categorias);

        javax.swing.GroupLayout fr_categoriasLayout = new javax.swing.GroupLayout(fr_categorias);
        fr_categorias.setLayout(fr_categoriasLayout);
        fr_categoriasLayout.setHorizontalGroup(
            fr_categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fr_categoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fr_categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_categoria)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fr_categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_remover, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(b_limpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(b_adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(b_sugestao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addContainerGap())
        );
        fr_categoriasLayout.setVerticalGroup(
            fr_categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fr_categoriasLayout.createSequentialGroup()
                .addGroup(fr_categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fr_categoriasLayout.createSequentialGroup()
                        .addComponent(b_remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_sugestao))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fr_categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_adicionar))
                .addContainerGap())
        );

        fr_letras.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Letras "));

        b_a.setText("A");
        b_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_c.setText("C");
        b_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_b.setText("B");
        b_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_d.setText("D");
        b_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_f.setText("F");
        b_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_e.setText("E");
        b_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_g.setText("G");
        b_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_h.setText("H");
        b_h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_i.setText("I");
        b_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_j.setText("J");
        b_j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_k.setText("K");
        b_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_l.setText("L");
        b_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_m.setText("M");
        b_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_n.setText("N");
        b_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_o.setText("O");
        b_o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_p.setText("P");
        b_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_q.setText("Q");
        b_q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_r.setText("R");
        b_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_s.setText("S");
        b_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_t.setText("T");
        b_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_x.setText("X");
        b_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_u.setText("U");
        b_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_v.setText("V");
        b_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_w.setText("W");
        b_w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_y.setText("Y");
        b_y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        b_z.setText("Z");
        b_z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLetra_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fr_letrasLayout = new javax.swing.GroupLayout(fr_letras);
        fr_letras.setLayout(fr_letrasLayout);
        fr_letrasLayout.setHorizontalGroup(
            fr_letrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fr_letrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fr_letrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fr_letrasLayout.createSequentialGroup()
                        .addComponent(b_a, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_b, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_c, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_d, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_e, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_f, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_g, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fr_letrasLayout.createSequentialGroup()
                        .addComponent(b_h, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_i, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_j, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_k, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_l, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_m, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_n, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fr_letrasLayout.createSequentialGroup()
                        .addGroup(fr_letrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fr_letrasLayout.createSequentialGroup()
                                .addComponent(b_v, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_w, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_x, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                            .addGroup(fr_letrasLayout.createSequentialGroup()
                                .addComponent(b_o, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addGap(6, 6, 6)
                                .addComponent(b_p, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_q, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fr_letrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b_y, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_r, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fr_letrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fr_letrasLayout.createSequentialGroup()
                                .addComponent(b_s, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_t, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_u, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b_z, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        fr_letrasLayout.setVerticalGroup(
            fr_letrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fr_letrasLayout.createSequentialGroup()
                .addGroup(fr_letrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_b)
                    .addComponent(b_a)
                    .addComponent(b_c)
                    .addComponent(b_d)
                    .addComponent(b_e)
                    .addComponent(b_f)
                    .addComponent(b_g))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fr_letrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_h)
                    .addComponent(b_i)
                    .addComponent(b_k)
                    .addComponent(b_j)
                    .addComponent(b_l)
                    .addComponent(b_m)
                    .addComponent(b_n))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fr_letrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_o)
                    .addComponent(b_p)
                    .addComponent(b_q)
                    .addComponent(b_r)
                    .addComponent(b_s)
                    .addComponent(b_t)
                    .addComponent(b_u))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fr_letrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_v)
                    .addComponent(b_w)
                    .addComponent(b_x)
                    .addComponent(b_y)
                    .addComponent(b_z))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fr_tempo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tempo limite (min)"));

        l_tempo.setText("jLabel1");

        b_tempo_menos.setText("-");
        b_tempo_menos.setPreferredSize(new java.awt.Dimension(24, 28));
        b_tempo_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tempo_menosActionPerformed(evt);
            }
        });

        b_tempo_mais.setText("+");
        b_tempo_mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tempo_maisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fr_tempoLayout = new javax.swing.GroupLayout(fr_tempo);
        fr_tempo.setLayout(fr_tempoLayout);
        fr_tempoLayout.setHorizontalGroup(
            fr_tempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fr_tempoLayout.createSequentialGroup()
                .addComponent(l_tempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_tempo_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_tempo_mais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        fr_tempoLayout.setVerticalGroup(
            fr_tempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fr_tempoLayout.createSequentialGroup()
                .addGroup(fr_tempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_tempo)
                    .addComponent(b_tempo_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_tempo_mais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout fr_confLayout = new javax.swing.GroupLayout(fr_conf);
        fr_conf.setLayout(fr_confLayout);
        fr_confLayout.setHorizontalGroup(
            fr_confLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fr_confLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fr_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fr_confLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fr_letras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fr_confLayout.createSequentialGroup()
                        .addComponent(fr_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fr_rodadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fr_confLayout.setVerticalGroup(
            fr_confLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fr_confLayout.createSequentialGroup()
                .addGroup(fr_confLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fr_confLayout.createSequentialGroup()
                        .addComponent(fr_letras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fr_confLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fr_rodadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fr_tempo, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))
                    .addComponent(fr_categorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        fr_categorias.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fr_conf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_confVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                        .addComponent(b_IniciarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fr_chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fr_conf, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fr_chat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_confVoltar)
                    .addComponent(b_IniciarJogo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName(null);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-695)/2, (screenSize.height-532)/2, 695, 532);
    }// </editor-fold>//GEN-END:initComponents

    private void b_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_removerActionPerformed
        if (controller.getCliente().getUser().isUsuarioServidor()) {
            String selected = (String) lst_categorias.getSelectedValue();

            for (Tema t : temas) {
                if (t.get_nome().equals(selected)) {
                    temas.remove(t);
                    break;
                }
            }

            atualizaListaCategorias();
            controller.enviaAtualizacaoConfiguracao(temas, letras_validas, tempoMaximo, numRodadas);
        }
    }//GEN-LAST:event_b_removerActionPerformed

    
    private void botaoLetra_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLetra_ActionPerformed
        if (controller.getCliente().getUser().isUsuarioServidor()) {
            JButton botao = (JButton) evt.getSource();

            if (letras_validas.get(Letra.valueOf(botao.getText())).booleanValue() == true) {
                letras_validas.put(Letra.valueOf(botao.getText()), new Boolean(false));
            } else {
                letras_validas.put(Letra.valueOf(botao.getText()), new Boolean(true));
            }

            controller.enviaAtualizacaoConfiguracao(temas, letras_validas, tempoMaximo, numRodadas);

            int validas = atualizaLetrasValidas();
            if (validas < Integer.parseInt(l_rodadas.getText()) && validas > 0) {
                l_rodadas.setText(String.valueOf(validas));
            }
        }
    }//GEN-LAST:event_botaoLetra_ActionPerformed

    private void b_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_adicionarActionPerformed
        if (controller.getCliente().getUser().isUsuarioServidor()) {
            if (tf_categoria.getText().isEmpty()) {
                //TODO (Thyago, 2010-06-13) Informar erro ao usuario.
                return;
            }

            // Como temas eh um Set, ele nao adiciona valor repetido, entao nao eh necessario testar.
            temas.add(new Tema(tf_categoria.getText()));
            tf_categoria.setText("");

            controller.enviaAtualizacaoConfiguracao(temas, letras_validas, tempoMaximo, numRodadas);

            atualizaListaCategorias();
        }
    }//GEN-LAST:event_b_adicionarActionPerformed

    private void b_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limparActionPerformed
        if (controller.getCliente().getUser().isUsuarioServidor())  {
            temas.clear();
            atualizaListaCategorias();
            controller.enviaAtualizacaoConfiguracao(temas, letras_validas, tempoMaximo, numRodadas);
        }
    }//GEN-LAST:event_b_limparActionPerformed

    private void b_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_chatActionPerformed
        String newText = "\n"
                + controller.getCliente().getUser().get_username()
                + " : "
                + tf_chat.getText();

        tf_chat.setText("");
        controller.enviaMensagem(newText);
    }//GEN-LAST:event_b_chatActionPerformed

    private void b_IniciarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_IniciarJogoActionPerformed

        controller.confirmaConfiguracao(temas, letras_validas, tempoMaximo, numRodadas);
    }//GEN-LAST:event_b_IniciarJogoActionPerformed

    private void b_sugestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sugestaoActionPerformed
        if(controller.getCliente().getUser().isUsuarioServidor()) 
            new TelaSugestaoCategoria(this, temas);
    }//GEN-LAST:event_b_sugestaoActionPerformed

    private void b_voltarAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_voltarAction
        controller.remove_usuario();
        controller.setTelaConfiguracao(null);
        this.setVisible(false);
        new TelaInicial().setVisible(true);
    }//GEN-LAST:event_b_voltarAction

    private void b_rodada_maisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_rodada_maisActionPerformed
        if(controller.getCliente().getUser().isUsuarioServidor()) {
            if(this.numRodadas != 5){
                this.numRodadas += 1;
                l_rodadas.setText(String.valueOf(this.numRodadas));
            }
            controller.enviaAtualizacaoConfiguracao(temas, letras_validas, tempoMaximo, numRodadas);
        }
    }//GEN-LAST:event_b_rodada_maisActionPerformed

    private void b_tempo_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tempo_menosActionPerformed
        if(controller.getCliente().getUser().isUsuarioServidor()) {
            if(this.tempoMaximo != 1.0){
                this.tempoMaximo -= 0.5;
                l_tempo.setText(String.valueOf(this.tempoMaximo));
            }
            controller.enviaAtualizacaoConfiguracao(temas, letras_validas, tempoMaximo, numRodadas);
        }
    }//GEN-LAST:event_b_tempo_menosActionPerformed

    private void b_tempo_maisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tempo_maisActionPerformed
        if (controller.getCliente().getUser().isUsuarioServidor()) {
            if(this.tempoMaximo != 5.0) {
                this.tempoMaximo += 0.5;
                l_tempo.setText(String.valueOf(this.tempoMaximo));
            }
            controller.enviaAtualizacaoConfiguracao(temas, letras_validas, tempoMaximo, numRodadas);
        }
    }//GEN-LAST:event_b_tempo_maisActionPerformed

    private void b_rodada_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_rodada_menosActionPerformed
         if(controller.getCliente().getUser().isUsuarioServidor()) {
            if(this.numRodadas != 1){
                this.numRodadas -= 1;
                l_rodadas.setText(String.valueOf(this.numRodadas));
            }
            controller.enviaAtualizacaoConfiguracao(temas, letras_validas, tempoMaximo, numRodadas);
        }
    }//GEN-LAST:event_b_rodada_menosActionPerformed

    public void setListaCategorias(Vector<String> v) {
        for (int i = 0; i < v.size(); ++i) {
            temas.add(new Tema(v.get(i)));
            tf_categoria.setText("");
        }

        controller.enviaAtualizacaoConfiguracao(temas, letras_validas, tempoMaximo, numRodadas);
        atualizaListaCategorias();
    }

    public void terminaJogo() {
        this.setVisible(false);
        new TelaInicial().setVisible(true);
    }

    public void desabilitaTela() {
        System.out.println("Desabilita tela: " + !controller.getCliente().getUser().isUsuarioServidor());
        if (!controller.getCliente().getUser().isUsuarioServidor()) {
            b_IniciarJogo.setEnabled(false);  
            tf_categoria.setEditable(false);
        } 
    }

    public void setMensagem(String texto) {
        if (ta_chat.getText() != null && ta_chat.getText().length() > 0) {
            ta_chat.append(texto);
        } else {
            ta_chat.setText(texto);
        }
    }

    public void atualizaConfiguracoes() {
        atualizaLetrasValidas();
        atualizaListaCategorias();
        l_rodadas.setText(String.valueOf(this.numRodadas));
        l_tempo.setText(String.valueOf(this.tempoMaximo));
    }

    public void solicitaConfirmacaoConfiguracao() {
        Runnable run = new Runnable() {

            public void run() {
                if(JOptionPane.showConfirmDialog(TelaConfiguracao.this,
                        "Foi solicitado confirmar a aprovacao da configuracao do novo jogo",
                        "Configuracao de novo jogo", JOptionPane.YES_NO_OPTION)
                        == JOptionPane.YES_OPTION) {
                    controller.aprovaConfiguracao();
                }
                else {
                    controller.cancelaAprovaConfiguracao();
                }
            }
        };

        SwingUtilities.invokeLater(run);

    }

    public void exibeMensagemInicioJogo() {
        Runnable run = new Runnable() {

            public void run() {
                JOptionPane.showMessageDialog(TelaConfiguracao.this, "Novo Jogo vai comecar", "Novo jogo", JOptionPane.INFORMATION_MESSAGE);
            }
        };

        SwingUtilities.invokeLater(run);

    }

    public void exibeMensagemErro(String texto) {
        JOptionPane.showMessageDialog(this, texto, "Configuracao de novo jogo", JOptionPane.ERROR_MESSAGE);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_IniciarJogo;
    private javax.swing.JButton b_a;
    private javax.swing.JButton b_adicionar;
    private javax.swing.JButton b_b;
    private javax.swing.JButton b_c;
    private javax.swing.JButton b_chat;
    private javax.swing.JButton b_confVoltar;
    private javax.swing.JButton b_d;
    private javax.swing.JButton b_e;
    private javax.swing.JButton b_f;
    private javax.swing.JButton b_g;
    private javax.swing.JButton b_h;
    private javax.swing.JButton b_i;
    private javax.swing.JButton b_j;
    private javax.swing.JButton b_k;
    private javax.swing.JButton b_l;
    private javax.swing.JButton b_limpar;
    private javax.swing.JButton b_m;
    private javax.swing.JButton b_n;
    private javax.swing.JButton b_o;
    private javax.swing.JButton b_p;
    private javax.swing.JButton b_q;
    private javax.swing.JButton b_r;
    private javax.swing.JButton b_remover;
    private javax.swing.JButton b_rodada_mais;
    private javax.swing.JButton b_rodada_menos;
    private javax.swing.JButton b_s;
    private javax.swing.JButton b_sugestao;
    private javax.swing.JButton b_t;
    private javax.swing.JButton b_tempo_mais;
    private javax.swing.JButton b_tempo_menos;
    private javax.swing.JButton b_u;
    private javax.swing.JButton b_v;
    private javax.swing.JButton b_w;
    private javax.swing.JButton b_x;
    private javax.swing.JButton b_y;
    private javax.swing.JButton b_z;
    private javax.swing.JPanel fr_categorias;
    private javax.swing.JPanel fr_chat;
    private javax.swing.JPanel fr_conf;
    private javax.swing.JPanel fr_letras;
    private javax.swing.JPanel fr_rodadas;
    private javax.swing.JPanel fr_tempo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel l_rodadas;
    private javax.swing.JLabel l_tempo;
    private javax.swing.JList lst_categorias;
    private javax.swing.JList lst_chat;
    private javax.swing.JTextArea ta_chat;
    private javax.swing.JTextField tf_categoria;
    private javax.swing.JTextField tf_chat;
    // End of variables declaration//GEN-END:variables

    public TreeSet<Tema> getTemas() {
        return temas;
    }

    public void setTemas(TreeSet<Tema> temas) {
        this.temas = temas;
    }

    public TreeMap<Letra, Boolean> getLetras_validas() {
        return letras_validas;
    }

    public void setLetras_validas(TreeMap<Letra, Boolean> letras_validas) {
        this.letras_validas = letras_validas;
    }

    public float getTempoMaximo() {
        return tempoMaximo;
    }

    public void setTempoMaximo(float tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
    }

    public int getNumRodadas() {
        return numRodadas;
    }

    public void setNumRodadas(int numRodadas) {
        this.numRodadas = numRodadas;
    }

    public boolean get_pronto() {
        return pronto;
    }
}
