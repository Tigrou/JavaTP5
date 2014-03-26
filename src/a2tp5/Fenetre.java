/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a2tp5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Tigrou
 */
public class Fenetre extends javax.swing.JFrame implements ActionListener {

    String pieceChoisie, nbPlacesChoisies, nameF;
    boolean appuiBouton = false;

    public Fenetre() {
        initComponents();
        jPanel1.setVisible(true);
        nameTheatreCBB.setEnabled(false);
        nameTheatreCBB.removeAllItems();
        nbrPlaceCBB.setEnabled(false);
        nbrPlaceCBB.removeAllItems();
        okBTN.setEnabled(false);
        nameTheatreCBB.addItem("Choisir la pièce");
        for (int i = 1; i <= 5; i++) {
            nbrPlaceCBB.addItem(i);
        }
    }

    public void afficherPieces(String nomPiece) {
        nameTheatreCBB.addItem(nomPiece);
        okBTN.setVisible(true);
    }

    public void appuyerBouton() {
        okBTN.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(okBTN.getActionCommand())) {
            appuiBouton = true;
            pieceChoisie = nameTheatreCBB.getSelectedItem().toString();
            nbPlacesChoisies = nbrPlaceCBB.getSelectedItem().toString();
            nameF = nameTXTF.getText();
        }
    }

    public void setTextgetjLabel(int reponseServ) {
        if (reponseServ == -1) {
            jLabel1.setText("Mll ou M " + nameTXTF.getText());
            jLabel2.setText("Vous avez réservé " + nbPlacesChoisies + " place(s)");
            jLabel3.setText("pour la pièce de théatre " + pieceChoisie);
        } else {
            jLabel1.setText("Il n'y a plus de place !");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameJLB = new javax.swing.JLabel();
        nameTXTF = new javax.swing.JTextField();
        nameTheatreJLB = new javax.swing.JLabel();
        nbrPlacceJLB = new javax.swing.JLabel();
        valideJLB = new javax.swing.JLabel();
        okBTN = new javax.swing.JButton();
        nameTheatreCBB = new javax.swing.JComboBox();
        nbrPlaceCBB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));

        nameJLB.setText("Nom et prénom");

        nameTXTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTXTFKeyPressed(evt);
            }
        });

        nameTheatreJLB.setText("Nom de la pièce");

        nbrPlacceJLB.setText("Nombre de places");
        nbrPlacceJLB.setToolTipText("");

        valideJLB.setText("Valider la réservation");

        okBTN.setText("OK");
        okBTN.setToolTipText("");
        okBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBTNActionPerformed(evt);
            }
        });

        nameTheatreCBB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nameTheatreCBB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nameTheatreCBBMouseReleased(evt);
            }
        });

        nbrPlaceCBB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nbrPlaceCBB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nbrPlaceCBBMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameTXTF, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(nameTheatreJLB)
                            .addComponent(nameJLB)
                            .addComponent(nbrPlacceJLB)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(valideJLB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(okBTN))
                            .addComponent(nameTheatreCBB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nbrPlaceCBB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameJLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTXTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(nameTheatreJLB)
                .addGap(18, 18, 18)
                .addComponent(nameTheatreCBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbrPlacceJLB)
                .addGap(18, 18, 18)
                .addComponent(nbrPlaceCBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valideJLB)
                    .addComponent(okBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTXTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTXTFKeyPressed
        nameTheatreCBB.setEnabled(true);
    }//GEN-LAST:event_nameTXTFKeyPressed

    private void nameTheatreCBBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTheatreCBBMouseReleased
        nbrPlaceCBB.setEnabled(true);
    }//GEN-LAST:event_nameTheatreCBBMouseReleased

    private void nbrPlaceCBBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nbrPlaceCBBMouseClicked
        okBTN.setEnabled(true);
    }//GEN-LAST:event_nbrPlaceCBBMouseClicked

    private void okBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBTNActionPerformed
    }//GEN-LAST:event_okBTNActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetre().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameJLB;
    private javax.swing.JTextField nameTXTF;
    private javax.swing.JComboBox nameTheatreCBB;
    private javax.swing.JLabel nameTheatreJLB;
    private javax.swing.JLabel nbrPlacceJLB;
    private javax.swing.JComboBox nbrPlaceCBB;
    private javax.swing.JButton okBTN;
    private javax.swing.JLabel valideJLB;
    // End of variables declaration//GEN-END:variables
}
