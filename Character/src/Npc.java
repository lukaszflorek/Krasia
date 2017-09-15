import java.util.ArrayList;
import java.util.Scanner;

public class Npc {
    private int level = 1;
    private boolean isMortal = true;
    private int armor = 1;
    private int vitality = level * armor *100;
    private int strength = level *10;
    private int bagCapacity = 0;
    private String occupation;
    private static String image = "default_img";
    private String name = "Anonymous";


    public Npc(Scanner file) {
        setName(file.nextLine());
        setOccupation(file.nextLine());
        setLevel(file.nextInt());
        setVitality(file.nextInt());
        setStrength(file.nextInt());
        setBagCapacity(file.nextInt());
        ArrayList<BagItem> bagItems = new ArrayList<>();
        bagItems.add(0, new BagItem("book",1, 0));

    }
    public Npc(String name, int level){
        this.name = name;
        this.level = level;
    }

    public void npcList(Scanner file) {
        ArrayList<Npc> heroes = new ArrayList<>();
        heroes.add(new Npc(file));
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isMortal() {
        return isMortal;
    }

    public void setMortal(boolean mortal) {
        this.isMortal = mortal;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getBagCapacity() {
        return bagCapacity;
    }

    public void setBagCapacity(int bagCapacity) {
        this.bagCapacity = bagCapacity;
    }
}
