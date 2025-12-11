import enums.Rarity;
import enums.WeaponMaterial;
import inventory.Inventory;
import items.Item;
import items.Sword;

public class InventoryManager {
    private Inventory inventory;

    public InventoryManager(){
        this.inventory = new Inventory();
    }

    public String printSlotOverview() {
        return this.inventory.printSlotOverview();
    }

    public void addItem(Item item) {
        int stackIndex = this.inventory.slotWhereItemCanAddToStack(item);

        if (stackIndex != -1) {
            this.inventory.addItemToStack(item, stackIndex);
        } else if (this.inventory.hasAvailableSlot() != -1) {
            int index = this.inventory.hasAvailableSlot();
            this.inventory.addItemToEmptySlot(item, index);
        }
        // TODO - exception "din inventory er fuld" (eller lignende)
    }

    /*
    removeItem()
    - print hele inventory (printSlotOverview)
    - prompt for slot, de vil fjerne fra
    - fjern 1 fra slot
     */

    /*
    seachForItem(int input)

    case 1  seachForWearbale()
    case 2 seachForConsumable()
    -

    - return: liste af det, der er fundet

    - Itemtype, material (wearable, weapon, consumable), rarity

    TODO - spørg om hvad der menes med at "søge".
     Skal man finde alle af det, man søger efter, eller bare bekræfte, at man har X

     */

    /*
    boolean dataSort(Items[])
    - bubblesort
    return boolean if sort successfull
     */
}