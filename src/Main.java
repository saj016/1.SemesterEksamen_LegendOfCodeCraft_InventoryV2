import enums.Rarity;
import enums.WeaponMaterial;
import items.Item;
import items.Sword;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Sword(Rarity.COMMON, WeaponMaterial.WOOD);

        System.out.println("Forventet output: Wood Sword");
        System.out.println(item1.getName());
    }
}