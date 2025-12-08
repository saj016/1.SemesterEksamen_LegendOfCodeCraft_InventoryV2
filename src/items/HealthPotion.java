package items;

import enums.Rarity;
import enums.WeaponHand;
import enums.WeaponMaterial;

public class HealthPotion extends Item {
    private final int maxStack = 5;
    private final double baseWeight = 0.2; //baseWeight is set here, for consistency compared to the other Items.

    public HealthPotion(String name) {
        super(name, Rarity.COMMON);
        super.setWeight(calculateWeight());
    }

    public int getMaxStack(){
        return maxStack;
    }

    @Override
    public double calculateWeight() {
        return this.baseWeight;
    }

    @Override
    protected boolean isStackable(){
        return true;
    }
}
