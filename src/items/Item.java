package items;

import enums.Rarity;

public abstract class Item {
    private String name;
    private double weight;
    //private Rarity rarity;

    public Item(String name) {
        this.name = name;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract boolean isStackable();
    //når den er public, kan den godt tilgås gennem Item, men er den brugbar?

    protected abstract double calculateWeight();
}
