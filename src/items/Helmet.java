package items;

import enums.*;

public class Helmet extends Wearable {
    //static attributes: are run as soon as the class is created as it's the same for all instances of this class
    private static final String name = "Helmet";
    private static final BodyPart bodyPart = BodyPart.HEAD;
    private static final int baseDefence = 8;
    private static final double baseWeight = 0.8;

    public Helmet(Rarity rarity, WearableMaterial material) {
        super(name, rarity, material, bodyPart, baseDefence, baseWeight);
    }

}
