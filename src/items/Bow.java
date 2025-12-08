package items;

import enums.Rarity;
import enums.WeaponHand;
import enums.WeaponMaterial;
import enums.WearableMaterial;

public class Bow extends Item {
    private final WeaponHand hand = WeaponHand.TWO_HAND;
    private WeaponMaterial material;
    private int defence = 1;
    private int damage = 7;
    private final double baseWeight = 2.5;


    public Bow(String name, Rarity rarity, WeaponMaterial material) {
        super(name, rarity);
        this.material = material;
        this.defence = calculateDefence();
        super.setWeight(calculateWeight());
    }

    private int calculateDefence(){
        int defence = 0;
        //Calculate added defence from rarity
        if (super.getRarity() == Rarity.COMMON) {
            defence += 0;
        } else if (super.getRarity() == Rarity.UNCOMMON) {
            defence += 1;
        } else if (super.getRarity() == Rarity.RARE) {
            defence += 2;
        } else if (super.getRarity() == Rarity.LEGENDARY) {
            defence += 3;
        } else {
            defence += 0;
            // TODO - tjek "else"
        }

        //Calculate added defence from material
        if (this.material == WeaponMaterial.WOOD) {
            defence += 0;
        } else if (this.material == WeaponMaterial.STONE) {
            defence += 1;
        } else if (this.material == WeaponMaterial.IRON) {
            defence += 2;
        } else if (this.material == WeaponMaterial.STEEL) {
            defence += 3;
        } else {
            defence += 0;
            // TODO - tjek "else"
        }

        return defence;
    }

    //@Override
    protected double calculateWeight() {
        double result;
        if (this.material == WeaponMaterial.WOOD) {
            result = baseWeight + 0;
        } else if (this.material == WeaponMaterial.STONE) {
            result = baseWeight + 1;
        } else if (this.material == WeaponMaterial.IRON) {
            result = baseWeight + 2;
        } else if (this.material == WeaponMaterial.STEEL) {
            result = baseWeight + 3;
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
