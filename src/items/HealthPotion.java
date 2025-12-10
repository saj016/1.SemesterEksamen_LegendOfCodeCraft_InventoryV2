package items;

public class HealthPotion extends Consumable {
    //static attributes: are run as soon as the class is created as it's the same for all instances of this class
    private static final String name = "Health Potion";
    private static final double weight = 0.2;
    private static final int maxStack = 5;

    public HealthPotion() {
        super(name, maxStack, weight);
    }
}
