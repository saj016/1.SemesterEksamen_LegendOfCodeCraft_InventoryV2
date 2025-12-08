package items;

import enums.*;

public class Helmet extends Wearable {

    public Helmet(Rarity rarity, WearableMaterial material) {
        super("Helmet", rarity, material, BodyPart.HEAD, 8, 0.8);
    }

}
