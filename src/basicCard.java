import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.ArrayList;
import java.util.Arrays;

public class basicCard {
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
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void addArrayNaDm(String[] attakcs) {
        Attacks.add(attakcs);
    }

    public ArrayList<String[]> getAttacks() {
        return Attacks;
    }



    public void setBackStory(String backStory) {
        BackStory = backStory;
    }
    public void setCardType(String cardType) {
        CardType = cardType;
    }
    int def;
    int hp;
    int mana;
    int speed;


    ArrayList<String> Weak = new ArrayList<>();

    ArrayList<String[]> Attacks = new ArrayList<String[]>();
    String BackStory;
    String CardType;
    String Temp;
    public String AtNa(){
        Temp = "";
        for (int i = 0; i < Attacks.get(0).length; i++) {
            Temp += i+1 + ": "+Attacks.get(0)[i] + " ";

        }
        return Temp;
    }
    public void Hit(String At){
        Temp = "";
        if (At.substring(4, 6).equals(Weak.get(0)) || At.substring(4, 6).equals(Weak.get(1))){
            setHp(getHp() - Integer.parseInt(At.substring(0,2))*2);
        }else {
            setHp(getHp() - Integer.parseInt(At.substring(0,2)));
        }

    }
    public void AddWeak(String[] Wea){
        Weak.addAll(Arrays.asList(Wea));
    }

    public String choosenAt(int j){
        Temp = "";
        if (j-1 > Attacks.size()){
            Temp = "Choose a valid option by only typing the one number";
        }else {
            Temp = Attacks.get(1)[j-1];
        }
        return Temp;
    }


}
