/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanafuda;

import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class HTPScreen extends javax.swing.JPanel {

    private static AppScreen parent;
    
    public HTPScreen(AppScreen jf) throws FileNotFoundException {
        initComponents();
        this.setSize(960, 540);
        htpText.setOpaque(false);
        htpText.setVisible(true);
        setHTPText();
        htpText.setEditable(false);
        parent = jf;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollyPane = new javax.swing.JScrollPane();
        htpText = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(950, 540));

        scrollyPane.setOpaque(false);

        htpText.setBackground(new java.awt.Color(155, 255, 193));
        htpText.setColumns(20);
        htpText.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        htpText.setRows(5);
        htpText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                htpTextKeyTyped(evt);
            }
        });
        scrollyPane.setViewportView(htpText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollyPane, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollyPane, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void htpTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_htpTextKeyTyped
        parent.showScreen("home");
    }//GEN-LAST:event_htpTextKeyTyped

    public void setHTPText() throws FileNotFoundException {
        File instruct = new File("HowToPlay" + Hanafuda.language + ".txt");
        Scanner line = new Scanner(instruct, "UTF-8");
        while (line.hasNextLine()) {
            htpText.append(line.nextLine() + "\n");
        }
        System.out.println(htpText.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea htpText;
    private javax.swing.JScrollPane scrollyPane;
    // End of variables declaration//GEN-END:variables
}
