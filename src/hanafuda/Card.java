/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanafuda;

import java.net.URL;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Card extends javax.swing.JPanel {

    private int month;
    private int day; //usage for getting specific image
    private int value;
    private String type;
    public ArrayList<String> combos = new ArrayList<>();
    private static Card[][] cardList;
    private static Stack<Card> drawStack = new Stack<>();//tech. any collection would do
    private static final int WIDTH = 51;
    private static final int HEIGHT = 84;
    private static int mouseX;
    private static int mouseY;
    private static AppScreen parent;
    
    public Card(AppScreen jf) {
        initComponents();
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(300, 300);
        parent = jf;
        cardPic.setVisible(true);
    }
    
    public static void createDeck(AppScreen jf) {
        Card[][] deck = new Card[12][4]; //fastest way to initialize all cards
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++){
                deck[i][j] = new Card(jf);
                deck[i][j].month = i + 1;
                deck[i][j].day = j;
                deck[i][j].setValue(j);
                deck[i][j].cardPic.setIcon(new ImageIcon(i + "." + j + ".png"));
                System.out.println("");
            }
        }
        deck[0][0].toBright();
        deck[2][0].toBright();
        deck[7][0].toBright();
        deck[10][0].toBright();
        deck[10][0].combos.remove(3);
        deck[10][0].combos.remove(1);
        deck[11][0].toBright();
        deck[0][1].value = 10;
        deck[0][1].toRedStrip();
        deck[1][1].toRedStrip();
        deck[2][1].toRedStrip();
        deck[3][1].toBlankStrip();
        deck[4][1].toBlankStrip();
        deck[5][1].toBlueStrip();
        deck[6][1].toBlankStrip();
        deck[7][1].setValue(0);
        deck[7][1].toAnimal();
        deck[8][1].toBlueStrip();
        deck[9][1].toBlueStrip();
        deck[10][1].setValue(0);
        deck[10][1].toAnimal();
        deck[11][1].setValue(0);
        deck[11][1].toAnimal();
        deck[10][2].setValue(1);
        deck[10][2].combos.remove(2);
        deck[10][2].combos.remove(1);
        deck[10][2].combos.remove(0);
        deck[8][0].combos.add("\u4e00\u676f\u3067\u82b1\u898b");
        deck[8][0].combos.add("\u4e00\u676f\u3067\u6708\u898b");
        deck[2][0].combos.add("\u4e00\u676f\u3067\u82b1\u898b");
        deck[7][0].combos.add("\u4e00\u676f\u3067\u6708\u898b");
        deck[5][0].combos.add("\u732a\u9e7f\u8776");
        deck[6][0].combos.add("\u732a\u9e7f\u8776");
        deck[9][0].combos.add("\u732a\u9e7f\u8776");
        cardList = deck;
        shuffleDeck();
    }
    
    private void setValue(int n) {
        switch(n) {
            case 3:
                value = 0;
                type = "trash";
                combos.add("\u30ab\u30b9");
                break;
            case 2:
                value = 0;
                type = "trash";
                combos.add("\u30ab\u30b9");
                break;
            case 1:
                value = 5;
                type = "ribbon";
                combos.add("\u8d64\u77ed");
                combos.add("\u9752\u77ed");
                combos.add("\u77ed");
                break;
            case 0:
                value = 10;
                type = "animal";
                combos.add("\u30bf\u30cd");
                break;
        }
    }
    
    private void toBright() {//helper method to reduce redundancy
        value = 20;
        type = "bright";
        combos.add("\u4e94\u5149");
        combos.add("\u56db\u5149");
        combos.add("\u96e8\u56db\u5149");
        combos.add("\u4e09\u5149");
        combos.remove("\u30bf\u30cd");
    }
    
    public static void shuffleDeck() {
        for (Card[] e: cardList) {
            for (Card f: e) {
                drawStack.push(f);
            }
        }
        Collections.shuffle(drawStack);
    }
    
    public void toBlueStrip() {
        this.combos.remove(0);
    }
    
    public void toRedStrip() {
        this.combos.remove(1);
    }
    
    public void toBlankStrip() {
        this.combos.remove(1);
        this.combos.remove(0);
    }
    
    public void toAnimal() {
        this.combos.remove(2);
        this.combos.remove(1);
        this.combos.remove(0);
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return type + " card worth " + value + " points";
    }
    
    public static boolean isEmpty() {
        return drawStack.empty();
    }
    
    public static Card drawCard() {
        return drawStack.pop();
    }
    
    public JLabel getPic() {
        return cardPic;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardPic = new javax.swing.JLabel();

        cardPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hanafuda/1.0.png"))); // NOI18N
        cardPic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cardPicMousePressed(evt);
            }
        });
        cardPic.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cardPicMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cardPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardPicMousePressed
        
    }//GEN-LAST:event_cardPicMousePressed

    private void cardPicMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardPicMouseDragged
        boolean inXBound = 960 > evt.getXOnScreen() && evt.getXOnScreen() > 0;
        boolean inYBound = 540 > evt.getYOnScreen() && evt.getYOnScreen() > 0;
        if (inXBound && inYBound) {
            this.getParent().setLocation(evt.getXOnScreen() - 32, evt.getYOnScreen() - 70);
        }
    }//GEN-LAST:event_cardPicMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardPic;
    // End of variables declaration//GEN-END:variables
}
