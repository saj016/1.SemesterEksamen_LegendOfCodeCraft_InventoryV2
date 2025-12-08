package items;

import enums.*;

public class Leggins extends Item {
    private final BodyPart bodyPart = BodyPart.LEGS;
    private WearableMaterial material;
    private int defence = 6;
    private double baseWeight = 1.2;

    public Leggins(String name, Rarity rarity, WearableMaterial material) {
        super(name, rarity);
        this.material = material;
        super.setWeight(calculateWeight());
        this.defence = calculateDefence();
    }

    private int calculateDefence() {
        int addedDefence = 0;
        //Calculate added defence from rarity
        if (super.getRarity() == Rarity.COMMON) {
            addedDefence += 0;
        } else if (super.getRarity() == Rarity.UNCOMMON) {
            addedDefence += 1;
        } else if (super.getRarity() == Rarity.RARE) {
            addedDefence += 2;
        } else if (super.getRarity() == Rarity.LEGENDARY) {
            addedDefence += 3;
        } else {
            addedDefence += 0;
            // TODO - tjek "else"
        }

        //Calculate added defence from material
        if (this.material == WearableMaterial.LEATHER) {
            addedDefence += 0;
        } else if (this.material == WearableMaterial.IRON) {
            addedDefence += 1;
        } else if (this.material == WearableMaterial.STEEL) {
            addedDefence += 2;
        } else if (this.material == WearableMaterial.CHAIN_MAIL) {
            addedDefence += 3;
        } else {
            addedDefence += 0;
            // TODO - tjek "else"
        }

        return this.defence + addedDefence;
    }

    @Override
    protected double calculateWeight() {
        double result;
        if (this.material == WearableMaterial.LEATHER) {
            result = baseWeight + 0;
        } else if (this.material == WearableMaterial.IRON) {
            result = baseWeight + 1;
        } else if (this.material == WearableMaterial.STEEL) {
            result = baseWeight + 2;
        } else if (this.material == WearableMaterial.CHAIN_MAIL) {
            result = baseWeight + 1.7;
        } else {
            result = baseWeight;
            // TODO - tjek "else"
        }
        return result;
    }

    public boolean isStackable(){
        return false;
    }
}
