package items;

import enums.*;

public class Leggings extends Wearable {
    //static attributes: are run as soon as the class is created as it's the same for all instances of this class
    private static final String name = "Leggings";
    private static final BodyPart bodyPart = BodyPart.LEGS;
    private static final int baseDefence = 6;
    private static final double baseWeight = 1.2;

    public Leggings(Rarity rarity, WearableMaterial material) {
        super(name, rarity, material, bodyPart, baseDefence, baseWeight);
    }

}
