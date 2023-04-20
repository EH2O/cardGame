import com.sun.org.apache.xpath.internal.objects.XString;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Kael extends basicCard {
    String Backstory = "Once upon a time, in a medieval world where magic was still prevalent, there was a young orphan boy named Kael. Kael lived on the streets and had to resort to thievery in order to survive. However, Kael was not just any ordinary thief. He possessed a unique ability to manipulate rocks using magic.\n" +
            "\n" +
            "Kael discovered his ability when he was caught stealing by a group of guards. In a moment of desperation, Kael picked up a small rock and hurled it towards the guards. To his surprise, the rock soared through the air with incredible speed and accuracy, hitting the guards squarely in the chest and knocking them to the ground.\n" +
            "\n" +
            "After that incident, Kael practiced his rock magic in secret, honing his skills and becoming increasingly skilled at using his abilities to aid him in his thievery. He could create walls of stone to block his pursuers, hurl boulders at guards to distract them, and even create small earthquakes to shake loose valuable items from their resting places.\n" +
            "\n" +
            "Despite his incredible abilities, Kael was always careful to avoid using his magic too much, lest he draw too much attention to himself. He lived a life of secrecy and isolation, always on the move and constantly on the lookout for his next target.\n" +
            "\n" +
            "As Kael grew older and more skilled, his reputation as a master thief began to spread throughout the land. His rock magic became the stuff of legend, and tales of his daring heists and narrow escapes circulated far and wide.\n" +
            "\n" +
            "Eventually, Kael's luck ran out. He was caught by a group of guards while attempting to steal from the treasury of a powerful nobleman. In a desperate attempt to escape, Kael unleashed a massive wave of rock magic, tearing down the walls of the treasury and sending the guards flying in all directions.\n" +
            "\n" +
            "Though Kael managed to escape, he knew that he had drawn too much attention to himself. He left the city that night, never to return again. From that day forward, Kael lived a life of solitude and anonymity, always on the move and never staying in one place for too long, always looking over his shoulder and watching for any signs of danger." + "(Written by Chatgpt)";

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getSpeed() {
        return speed;
    }
    int def = 50;
    int hp = 80;
    int mana = 100;
    int speed = 120;
    String type = "Ro";
    String choice;

    ArrayList<String[]> Attacks = new ArrayList<String[]>();
    String[] Name = {"Boulder throw"};
    String[] Dmg = {"40RoS"};
    public String attack (String CH) {
        if (Integer.parseInt(String.valueOf(CH.charAt(0))) == 1){
            choice = "40RoS:Boulder Throw";
        }
        return "x";
    }




}
