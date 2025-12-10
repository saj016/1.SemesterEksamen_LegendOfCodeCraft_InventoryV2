package items;

import enums.Rarity;
import enums.WeaponHand;
import enums.WeaponMaterial;

public class Bow extends Weapon {
    //static attributes: are run as soon as the class is created as it's the same for all instances of this class
    private static final String name = "Bow";
    private static final WeaponHand hand = WeaponHand.TWO_HAND;
    private static final int baseDamage = 7;
    private static final int baseDefence = 1;
    private static final double baseWeight = 2.5;

    public Bow(Rarity rarity, WeaponMaterial material) {
        super(name, rarity, material, hand, baseDamage, baseDefence, baseWeight);
    }
}
