import enums.Rarity;
import enums.WeaponMaterial;
import exceptions.InventoryWeightLimitReachedException;
import exceptions.NoEmptySlotsAvailableException;
import inventory.Inventory;
import inventory.InventorySlot;
import items.Item;
import items.Sword;

import java.util.Arrays;

public class InventoryManager {
    private Inventory inventory;

    public InventoryManager(){
        this.inventory = new Inventory();
    }

    public String printSlotOverview() {
        return this.inventory.printSlotOverview();
    }

    public void addItem(Item item) throws InventoryWeightLimitReachedException {
        this.inventory.checkIfItemWillExceedWeightLimit(item);
        int stackIndex = this.inventory.slotWhereItemCanAddToStack(item);

        if (stackIndex != -1) {
            this.inventory.addItemToStack(item, stackIndex);
        } else if (this.inventory.hasAvailableSlot() != -1) {
            int index = this.inventory.hasAvailableSlot();
            this.inventory.addItemToEmptySlot(item, index);
        } else {
            throw new NoEmptySlotsAvailableException("Cannot find an empty slot in which to add " + item);
        }
    }

    public void removeItemFromSlot(int slot) {
       int index = slot - 1;
       inventory.removeItemFromSlot(index);
    }
    /*
    Idé: removeItemFromSlot(int slot) [husk at index er slot -1]
    og hav printSlotOverview delen i main menuen

    removeItem()
    - print hele inventory (printSlotOverview)
    - prompt for slot, de vil fjerne fra
    - fjern 1 fra slot
    HUSK: fjern vægt fra inventory af det fjernede item
     */

    //TODO searchItem
    /*
    searchForItem(int input)
    - return: liste af det, der er fundet

    - Itemtype, material (wearable, weapon, consumable), rarity

    TODO - find alle af det, man søger efter
     */

    public void searchForItem(String searchParameter){
       InventorySlot[] items = this.inventory.getItems();
        if(Arrays.asList(items).contains(searchParameter)){
            System.out.println("WORKS!! - SLET MIGGG!!!!");
        } else
            System.out.println("NOT WORKING -- DELETE DELETE ");
    }

    /*
    boolean dataSort(Items[])
    - bubblesort
    return boolean if sort successful
     */
}