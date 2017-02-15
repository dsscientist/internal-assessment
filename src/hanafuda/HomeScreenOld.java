/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanafuda;

import javax.swing.*;

public class HomeScreenOld extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreen
     */
    public HomeScreenOld() {
        initComponents();
        this.setGlassPane(btnHTP);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrdImage = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        btnHTP = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgrdImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hanafuda/HomeScreenBackground.jpg"))); // NOI18N
        bgrdImage.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                bgrdImageComponentAdded(evt);
            }
        });

        title.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 72)); // NOI18N
        title.setForeground(new java.awt.Color(255, 0, 0));
        title.setText("          HANAFUDA");
        title.setToolTipText("");

        btnHTP.setText("How to Play");
        btnHTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHTPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bgrdImage)
            .addComponent(btnHTP)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgrdImage)
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(btnHTP))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(title))
        );

        bgrdImage.getAccessibleContext().setAccessibleParent(bgrdImage);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHTPActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnHTPActionPerformed

    private void bgrdImageComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_bgrdImageComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_bgrdImageComponentAdded



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgrdImage;
    private javax.swing.JToggleButton btnHTP;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}