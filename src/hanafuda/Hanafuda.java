package hanafuda;

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Hanafuda {

    public static String language;
    public static TreeSet<Player> playerList = new TreeSet<>(new PlayerComparator());
    private static Player current;
    public static final File SETTINGS = new File("Settings.txt");
    //although searching can be slower, I want it in descending score order
    
    public static void main(String[] args) throws FileNotFoundException {
        Hanafuda.getSettings(SETTINGS);
        Card.createDeck();
        Test t = new Test();
        t.setVisible(true);
        AppScreen as = new AppScreen();
        as.setVisible(true);
        Combination.initializeCombos();
    }
    
    public static void getSettings(File settings) throws FileNotFoundException {//read from file
        Scanner scanLine = new Scanner(settings);
        language = decrypt(scanLine.nextLine());
        String pName = decrypt(scanLine.nextLine());// make sure to change dummy data so that it has name
        while (scanLine.hasNextLine()) {
            String l = decrypt(scanLine.nextLine());
            Scanner scanTok = new Scanner(l);
            String name = scanTok.next() + " " + scanTok.next();
            int gamesWon = scanTok.nextInt();
            int highScore = scanTok.nextInt();
            playerList.add(new Player(name, gamesWon, highScore));
        }
        setPlayer(pName);
    }
    
    public static void saveData(File settings) throws FileNotFoundException{//write to file
        PrintStream ps = new PrintStream(settings);
        ps.println(encrypt(language));
        ps.println(encrypt(current.getName()));
        for (Player p: playerList) {
            ps.println(encrypt(p.toString()));
        }
        System.out.println("Game Data Saved.");
    }
    
    public static boolean setPlayer(String name) {
        Iterator itr = playerList.iterator();
        while (itr.hasNext()) {
            Player temp = (Player) itr.next();
            if (temp.getName().equalsIgnoreCase(name)) {
                current = temp;
                System.out.println("Current player set as " + current.getName());
                return true;
            }
        }
        return false;   
    }
    
    public static String encrypt(String word) {//doesnt have to wrap around
        String encrypted = "";
        for (int i = 0; i < word.length(); i++) {
            encrypted += (char) (word.charAt(i) - 7);
        }
        return encrypted;
    }
    
    public static String decrypt(String encrypted) {
        String unknown = "";
        for (int i = 0; i < encrypted.length(); i++) {
            unknown += (char) (encrypted.charAt(i) + 7);
        }
        return unknown;
    }
       
    public static Player getPlayer() {
        return current;
    }
}
