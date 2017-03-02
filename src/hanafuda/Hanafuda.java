package hanafuda;

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Hanafuda {

    private static String language;
    private static TreeSet<Player> playerList = new TreeSet<>(new PlayerComparator());
    private static Player current;
    //although searching can be slower, I want it in descending score order
    
    public static void main(String[] args) throws FileNotFoundException {
        Card.createDeck();
        Combination.initializeCombos();
        File settings = new File("Settings.txt");
        Hanafuda.getSettings(settings);
        File gameDataCheck = new File("GameData.txt");
        checkGameData(gameDataCheck);
        AppScreen as = new AppScreen();
        as.setVisible(true);
        Hanafuda.saveData(settings);
    }
    
    public static void getSettings(File settings) throws FileNotFoundException {
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
    
    public static void saveData(File settings) throws FileNotFoundException{
        PrintStream ps = new PrintStream(settings);
        ps.println(encrypt(language));
        ps.println(encrypt(current.getName()));
        for (Player p: playerList) {
            ps.println(encrypt(p.toString()));
        }
    }
    
    public static void checkGameData(File gameDataCheck) throws FileNotFoundException{
        PrintStream ps = new PrintStream(gameDataCheck);
        ps.println(language);
        ps.println(current.getName());
        for (Player p: playerList) {
            ps.println(p.toString());
        }
    }// make sure to take this out before you submit project...
    
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
