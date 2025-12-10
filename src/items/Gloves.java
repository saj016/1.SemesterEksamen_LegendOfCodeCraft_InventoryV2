package items;

import enums.*;

public class Gloves extends Wearable {
    //static attributes: are run as soon as the class is created as it's the same for all instances of this class
    private static final String name = "Gloves";
    private static final BodyPart bodyPart = BodyPart.HANDS;
    private static final int baseDefence = 3;
    private static final double baseWeight = 0.5;

    public Gloves(Rarity rarity, WearableMaterial material) {
        super(name, rarity, material, bodyPart, baseDefence, baseWeight);
    }
}
