package items;

import enums.BodyPart;
import enums.Rarity;
import enums.WearableMaterial;

public class Boots extends Wearable {
    //static attributes: are run as soon as the class is created as it's the same for all instances of this class
    private static final String name = "Boots";
    private static final BodyPart bodyPart = BodyPart.FEET;
    private static final int baseDefence = 5;
    private static final double baseWeight = 1.5;

    public Boots(Rarity rarity, WearableMaterial material) {
        super(name, rarity, material, bodyPart, baseDefence, baseWeight);
    }

}
