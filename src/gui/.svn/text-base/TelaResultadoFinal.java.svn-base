/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaResultadoFinal.java
 *
 * Created on May 25, 2010, 2:34:24 PM
 */
package gui;

import adedanha.Usuario;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author luizfelipe
 */
public class TelaResultadoFinal extends javax.swing.JFrame {

    /** Creates new form TelaResultadoFinal */
    public TelaResultadoFinal(List<Usuario> usuariosJogo) {
        initComponents();
        initComponentsResultadoFinal(usuariosJogo);
    }

    public void initComponentsResultadoFinal(List<Usuario> usuariosJogo) {
        fr_resul.setLayout(new GridLayout(5, 2));
        JLabel label = new JLabel("Jogador");
        label.setSize(270, 15);
        label.setFont(new java.awt.Font("DejaVu Sans", 1, 9));
        fr_resul.add(label);
        label = new JLabel("Pontuacao Total");
        label.setSize(270, 15);
        label.setFont(new java.awt.Font("DejaVu Sans", 1, 9));
        fr_resul.add(label);

        for (Usuario u : usuariosJogo) {
            label = new JLabel(u.get_username());
            label.setSize(270, 15);
            fr_resul.add(label);
            label = new JLabel(String.valueOf(u.getPontuacaoTotal()));
            label.setSize(270, 15);
            fr_resul.add(label);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fr_resul = new javax.swing.JPanel();
        fr_chat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_chat = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_chat = new javax.swing.JTextArea();
        tf_chat = new javax.swing.JTextField();
        b_chat = new javax.swing.JButton();
        b_terminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Resultado Final");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado Final "));
        jPanel1.setPreferredSize(new java.awt.Dimension(652, 229));

        javax.swing.GroupLayout fr_resulLayout = new javax.swing.GroupLayout(fr_resul);
        fr_resul.setLayout(fr_resulLayout);
        fr_resulLayout.setHorizontalGroup(
            fr_resulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        fr_resulLayout.setVerticalGroup(
            fr_resulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fr_resul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fr_resul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fr_chat.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Chat "));
        fr_chat.setPreferredSize(new java.awt.Dimension(649, 174));

        jScrollPane1.setViewportView(lst_chat);

        ta_chat.setColumns(20);
        ta_chat.setEditable(false);
        ta_chat.setRows(5);
        jScrollPane3.setViewportView(ta_chat);

        tf_chat.setText("Mensagem...");
        tf_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_chatActionPerformed(evt);
            }
        });

        b_chat.setText("Enviar");

        javax.swing.GroupLayout fr_chatLayout = new javax.swing.GroupLayout(fr_chat);
        fr_chat.setLayout(fr_chatLayout);
        fr_chatLayout.setHorizontalGroup(
            fr_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fr_chatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fr_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_chat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
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

        b_terminar.setText("Terminar");
        b_terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_terminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fr_chat, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .addComponent(b_terminar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(b_terminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fr_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(220, Short.MAX_VALUE)))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-685)/2, (screenSize.height-500)/2, 685, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_chatActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tf_chatActionPerformed

    private void b_terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_terminarActionPerformed
        JOptionPane.showConfirmDialog(this,
                        "O jogo acabou.",
                        "Fim de jogo", JOptionPane.OK_OPTION);
        System.exit(0);
    }//GEN-LAST:event_b_terminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_chat;
    private javax.swing.JButton b_terminar;
    private javax.swing.JPanel fr_chat;
    private javax.swing.JPanel fr_resul;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList lst_chat;
    private javax.swing.JTextArea ta_chat;
    private javax.swing.JTextField tf_chat;
    // End of variables declaration//GEN-END:variables
}
