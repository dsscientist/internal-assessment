/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanafuda;

/**
 *
 * @author shirdav18
 */
public class HomeScreen extends javax.swing.JPanel {

    /**
     * Creates new form HomeScreen
     */
    public HomeScreen() {
        initComponents();
        Title.setLocation(WIDTH, HEIGHT);
        jLabel1.setText(Hanafuda.getPlayer().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HTPButton = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        ChangePlayerButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        HTPButton.setBackground(new java.awt.Color(255, 255, 255));
        HTPButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        HTPButton.setText("How to Play");
        HTPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HTPButtonActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 72)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 0, 0));
        Title.setText("HANAFUDA");

        ChangePlayerButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        ChangePlayerButton.setText("Play");

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(Title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(ChangePlayerButton)
                        .addGap(40, 40, 40)
                        .addComponent(HTPButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1)
                        .addGap(100, 100, 100)
                        .addComponent(jButton1)))
                .addContainerGap(338, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HTPButton)
                    .addComponent(ChangePlayerButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(137, 137, 137))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HTPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HTPButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HTPButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangePlayerButton;
    private javax.swing.JButton HTPButton;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
