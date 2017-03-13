/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanafuda;

import java.awt.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class AppScreen extends javax.swing.JFrame {
    
    public static final int X_DIMEN = 960;
    public static final int Y_DIMEN = 540;
    private static final javax.swing.JPanel[] SCREENS = new javax.swing.JPanel[5];
    private static final JLayeredPane HOME = new JLayeredPane();
    private static final JLayeredPane GAME = new JLayeredPane();
    //0: HomeScreenBgrd
    //1: HomeScreen
    //2: HTPScreen
    //3: GameBgrd
    //4: GameScreen
    
    public AppScreen() throws FileNotFoundException {
        initComponents();
        initializeScreens();
        initializePanes();
        this.setSize(975, 580);
        this.add(HOME);
        HOME.setSize(X_DIMEN, Y_DIMEN);
        this.add(GAME);
        GAME.setSize(X_DIMEN, Y_DIMEN);
        showScreen("home");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AppScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AppScreen().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AppScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void initializeScreens() throws FileNotFoundException {
        SCREENS[0] = new HomeScreenBgrd(this);
        SCREENS[1] = new HomeScreen(this);
        SCREENS[2] = new HTPScreen(this);
        SCREENS[3] = new GameBgrd(this);
        SCREENS[4] = new GameScreen(this);
        for (int i = 0; i < SCREENS.length; i++) {
            SCREENS[i].setLocation(0, 0);
            SCREENS[i].setSize(X_DIMEN, Y_DIMEN);
            SCREENS[i].setVisible(false);
            SCREENS[i].setOpaque(false);
        }
    }
    
    public void initializePanes() {
        HOME.add(SCREENS[0], 1);
        HOME.add(SCREENS[1], 2);
        HOME.add(SCREENS[2], 2);
        GAME.add(SCREENS[3],1);
        GAME.add(SCREENS[4], 2);
    }
    
    public void showScreen(String screenName) {
        //0: HomeScreenBgrd
        //1: HomeScreen
        //2: HTPScreen
        //3: GameBgrd
        //4: GameScreen
        switch(screenName) {
            case "home":
                GAME.setVisible(false);
                HOME.setVisible(true);
                SCREENS[0].setVisible(true);
                SCREENS[1].setVisible(true);
                HOME.moveToFront(SCREENS[0]);
                HOME.moveToFront(SCREENS[1]);
                break;
            case "htp":
                GAME.setVisible(false);
                HOME.setVisible(true);
                SCREENS[2].setVisible(true);
                HOME.moveToFront(SCREENS[2]);
                break;
            case "game":
                break;
            case "highScore":
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
