package items;

import enums.*;

public class ChestPlate extends Wearable {
    //static attributes: are run as soon as the class is created as it's the same for all instances of this class
    private static final String name = "Chest Plate";
    private static final BodyPart bodyPart = BodyPart.CHEST;
    private static final int baseDefence = 10;
    private static final double baseWeight = 1.8;

    public ChestPlate(Rarity rarity, WearableMaterial material) {
        super(name, rarity, material, bodyPart, baseDefence, baseWeight);
    }

}
