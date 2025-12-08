package items;
import enums.Rarity;
import enums.WeaponMaterial;

public class Arrow extends Consumable {

    public Arrow() {
        super();
    }

    /*private WeaponMaterial material;
    final private int maxStack = 30;
    private int damage = 1;
    final private double baseWeight = 0.1;

    public Arrow(String name, WeaponMaterial material){
        super(name, Rarity.COMMON); //Arrows are always of COMMON rarity
        this.material = material;
        this.damage = calculateDamage();
        super.setWeight(calculateWeight());
    }

    public WeaponMaterial getMaterial() {
        return material;
    }

    public int getMaxStack(){
        return maxStack;
    }

    private int calculateDamage(){
        int result;
        int rarityScore = 0; //rarity er altid common
        //calculates damage by combining the scores of rarity and material and base damage
        if (this.material == WeaponMaterial.WOOD){
            result = this.damage + rarityScore; //WOOD gives 0 extra damage
        } else if (this.material == WeaponMaterial.STONE){
            result = damage + rarityScore + 1;
        } else if (this.material == WeaponMaterial.IRON){
            result = this.damage + rarityScore + 2;
        } else if (this.material == WeaponMaterial.STEEL){
            result = this.damage + rarityScore + 3;
        } else {
            result = this.damage + rarityScore; //TODO tjek else
        }

        return result;
    }

    public double calculateWeight() {
        double result;
        if (this.material == WeaponMaterial.WOOD) {
            result = baseWeight + 0;
        } else if (this.material == WeaponMaterial.STONE) {
            result = baseWeight + 0.1;
        } else if (this.material == WeaponMaterial.IRON) {
            result = baseWeight + 0.2;
        } else if (this.material == WeaponMaterial.STEEL) {
            result = baseWeight + 0.3;
        } else {
            result = baseWeight;
            // TODO - tjek "else"
        }
        return result;
    }
    public boolean isStackable(){
        return true;
    }*/
}
