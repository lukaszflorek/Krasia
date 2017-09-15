class BagItem {
    private String itemName;
    private int weight;
    private int power;


    BagItem(String itemName, int weight, int power) {
        this.itemName = itemName;
        this.weight = weight;
        this.power = power;
    }

    public String getItemName() {
        return itemName;
    }

    public int getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }
}

class Armor extends BagItem {
    Armor(String itemName, int weight, int power) {
        super(itemName, weight, power);
    }
    void attachArmor() {

    }

}

