package items;

import enums.Rarity;
import enums.WeaponHand;
import enums.WeaponMaterial;

public class Sword extends Weapon {
    //WeaponHand.ONE_HAND;
    //defence = 5;
    //damage = 15;
    //baseWeight = 3;

    public Sword(String name, Rarity rarity, WeaponMaterial material) {
        super(name, rarity, material, WeaponHand.ONE_HAND);
        super.setWeight(calculateWeight());
        this.damage = calculateDamage();
        this.defence = calculateDefence();

    }




    @Override
    public double calculateWeight() {
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
