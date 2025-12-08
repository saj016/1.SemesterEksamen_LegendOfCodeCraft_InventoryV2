package items;

import enums.Rarity;
import enums.WeaponHand;
import enums.WeaponMaterial;

public class Shield extends Weapon {

    public Shield(String name, Rarity rarity, WeaponMaterial material) {
        super("Shield", rarity, material, WeaponHand.ONE_HAND, 5,10, 5);
    }
    //TODO
    /*private final WeaponHand hand = WeaponHand.OFF_HAND;
    private WeaponMaterial material;
    private int defence = 10;
    private int damage = 5;
    private double baseWeight = 5;

    public Shield(String name, Rarity rarity, WeaponMaterial material) {
        super(name, rarity);
        this.material = material;
        super.setWeight(calculateWeight());
        this.damage = calculateDamage();
        this.defence = calculateDefence();

    }

    private int calculateDamage() {
        int result;
        int rarityScore;
        //Sets the score of rarity
        if (super.getRarity() == Rarity.COMMON) {
            rarityScore = 0;
        } else if (super.getRarity() == Rarity.UNCOMMON) {
            rarityScore = 1;
        } else if (super.getRarity() == Rarity.RARE) {
            rarityScore = 2;
        } else if (super.getRarity() == Rarity.LEGENDARY) {
            rarityScore = 3;
        } else {
            rarityScore = 0; //TODO tjek else
        }
        //calculates damage by combining the scores of rarity and material and base damage
        if (this.material == WeaponMaterial.WOOD) {
            result = this.damage + rarityScore; //WOOD gives 0 extra damage
        } else if (this.material == WeaponMaterial.STONE) {
            result = this.damage + rarityScore + 1;
        } else if (this.material == WeaponMaterial.IRON) {
            result = this.damage + rarityScore + 2;
        } else if (this.material == WeaponMaterial.STEEL) {
            result = this.damage + rarityScore + 3;
        } else {
            result = this.damage + rarityScore; //TODO tjek else
        }
        return result;
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
        if (this.material == WeaponMaterial.WOOD) {
            addedDefence += 0;
        } else if (this.material == WeaponMaterial.STONE) {
            addedDefence += 1;
        } else if (this.material == WeaponMaterial.IRON) {
            addedDefence += 2;
        } else if (this.material == WeaponMaterial.STEEL) {
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
        if (this.material == WeaponMaterial.WOOD) {
            result = baseWeight + 0;
        } else if (this.material == WeaponMaterial.STONE) {
            result = baseWeight + 1;
        } else if (this.material == WeaponMaterial.IRON) {
            result = baseWeight - 1;
        } else if (this.material == WeaponMaterial.STEEL) {
            result = baseWeight - 0.5;
        } else {
            result = baseWeight;
            // TODO - tjek "else"
        }
        return result;
    }
    public boolean isStackable(){
        return false;
    }*/
}
