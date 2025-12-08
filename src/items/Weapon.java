package items;

import enums.Rarity;
import enums.WeaponHand;
import enums.WeaponMaterial;

public abstract class Weapon extends Item{
    private WeaponHand hand;
    private WeaponMaterial material;
    private int defence;
    private int damage;
    private double baseWeight;
    private Rarity rarity;

    public Weapon(String name, Rarity rarity, WeaponMaterial material, WeaponHand hand){
        super(name);
        this.rarity = rarity;
        this.material = material;
        this.hand = 
        super.setWeight(calculateWeight());
    }

    public Rarity getRarity() {
        return this.rarity;
    }

    private int calculateDamage() {
        int result;
        int rarityScore;
        //Sets the score of rarity
        if (this.getRarity() == Rarity.COMMON) {
            rarityScore = 0;
        } else if (this.getRarity() == Rarity.UNCOMMON) {
            rarityScore = 1;
        } else if (this.getRarity() == Rarity.RARE) {
            rarityScore = 2;
        } else if (this.getRarity() == Rarity.LEGENDARY) {
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
        if (this.getRarity() == Rarity.COMMON) {
            addedDefence += 0;
        } else if (this.getRarity() == Rarity.UNCOMMON) {
            addedDefence += 1;
        } else if (this.getRarity() == Rarity.RARE) {
            addedDefence += 2;
        } else if (this.getRarity() == Rarity.LEGENDARY) {
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
}

