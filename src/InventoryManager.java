import enums.Rarity;
import enums.WeaponMaterial;
import exceptions.ExceedingMaxSlotCapacityException;
import exceptions.InventoryWeightLimitReachedException;
import exceptions.NoEmptySlotsAvailableException;
import inventory.Inventory;
import inventory.InventorySlot;
import items.Consumable;
import items.Item;
import items.SerializationClass;
import items.Sword;

import java.io.IOException;
import java.util.Arrays;

public class InventoryManager {
    private Inventory inventory;

    public InventoryManager() {
        this.inventory = new Inventory();
    }

    //TODO - deserialize
    public void deserializeInventory(String fileName) throws IOException, ClassNotFoundException {
        SerializationClass serializationClass = new SerializationClass();
        Inventory tempInventory = serializationClass.deserializeInventory(fileName);
        if (tempInventory != null) {
            this.inventory = tempInventory;
        }
    }
    //TODO - serialize
    public void serializeInventory(String fileName) throws IOException {
        SerializationClass serializationClass = new SerializationClass();
        serializationClass.serializeInventory(fileName, this.inventory);
    }

    /*
    public String serialize() throws IOException {
        return inventory.serialize();
    }*/

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

    public String searchForItem(String searchParameter) {
        InventorySlot[] items = this.inventory.getItems();
        int amountInInventory = 0;
        String startMessage = ("You are searching for: " + searchParameter) + " and the system found "; //TODO evt lav en bedre promt
        String list = "";
        for (int i = 0; i < items.length; i++) {
            if (items[i].getItem() != null) {
                if (items[i].getItem().getName().contains(searchParameter)) {
                    amountInInventory += 1;
                    if (items[i].getItem() instanceof Consumable) {
                        list += ("Slot " + (i+1) + ": " + items[i].getItem().getName() + " (" + items[i].getQuantity() + ")\n");
                    } else {
                        list += ("Slot " + (i+1) + ": " + items[i].getItem().getName() + "\n");
                    }
                }
            }
        }
        return startMessage + amountInInventory + "\n" + list;
    }


    void dataSort() {
        InventorySlot[] items = this.inventory.getItems();
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < items.length -1; i++) { //-1 because you have to stop at the second to last item, to be able to compare with next
                //If item[i] and item[i+1] both contain an Item
                if (items[i].getItem() != null && items[i+1].getItem() != null) {
                    String itemName1 = items[i].getItem().getName();// the current item
                    String itemName2 = items[i + 1].getItem().getName(); // the item we compare with
                    if (itemName1.compareTo(itemName2) > 0) { //swap - the compareTo method sorts strings alphabetically by sending -1 if item2 is closer to A 0 if item2 os teh same as item1 and 1 if item2 s closer to z
                        swapped = true;
                        //swapping item1 and item2
                        InventorySlot item1 = items[i];
                        InventorySlot item2 = items[i + 1];
                        items[i] = item2;
                        items[i + 1] = item1;
                    }
                //If item[i] contains an Item and item[i+1] doesn't:
                } else if (items[i].getItem() != null && items[i+ 1].getItem() == null){
                    if (swapped) {
                        swapped = true;
                    } else {
                        swapped = false;
                    }
                //If item[i] doesn't contain an Item and item[i+1] does contain an Item:
                } else if (items[i].getItem() == null && items[i + 1].getItem() != null){
                    swapped = true;
                    //swapping item1 and item2
                    InventorySlot item1 = items[i];
                    InventorySlot item2 = items[i + 1];
                    items[i] = item2;
                    items[i + 1] = item1;
                //If item[i] and item[i+1] both don't contain an Item:
                } else {
                    if (swapped) {
                        swapped = true;
                    } else {
                        swapped = false;
                    }
                }
            }
        }
    }

    /* TODO
    Sortering efter item typer:
    Nedenstående antager rækkefølge
    1. Weapon
    2. Wearable
    3. Consumable
    Herunder sorteres de alfabetisk efter subklasse-type og derefter alfabetisk efter navn


    start med en if (i1 == null && i2 != null) swap

    antager at rækkefølge er: våben, wearable, consumable:
    hvis (i1 instof våben && (v2 instof wearable || i2 instof consumable)) {
        no swap
    }
    hvis (i1 instof wearable && v2 instof consumable) {
        no swap
    }
    hvis (i1 instof consumable && (v2 instof våben || i2 instof wearbale)) {
        swap
    }
    hvis (i1 instof wearable && v2 instof våben) {
        swap
    }

    hvis (i1 instof våben && i2 instof våben) { //Skal gentages for wearables
        if (i1.getClasName.compareTo(i2.getClassName) > 0) {
            swap
        } else if (i1.getClassName.compareTo(i2.getClassName) == 0) { //kan man bare bruge getclassname==getclassname?
            if (i1.getName.compareTo(i2.getName) > 0) {
                swap
            } else {
                no swap
            }
        } else {
            no swap
        }
    }

    hvis (i1 instof consumable && i2 instof consumable) {
        if (i1.getClasName.compareTo(i2.getClassName) > 0) {
            swap
        } else if (i1.getClassName.compareTo(i2.getClassName) == 0) { //kan man bare bruge getclassname==getclassname?
            if (i1.getName.compareTo(i2.getName) > 0) { //vil teknisk set ikke blive brugt til HealthPotion, men nok længere kode, hvis der skal kigges på det først
                swap
            } else {
                no swap
            }
        } else {
            no swap
        }
    }
     */


    /* (TODO)
    sortering efter rarity

    start med en if (i1 == null && i2 != null) swap

    if (i1 instof consumable && i2 instof consumable) {
        if (i1.getName.compareTo(i2.getName) > 0) {
            swap
        } else {
            no swap
        }
    }

    if (i1 instof consumable && i2 !instof consumable) {
        no swap
    }

    if (i1 !instof consumable && i2 instof consumable) {
        swap
    }


     */


    public void addSlots(int amount) throws ExceedingMaxSlotCapacityException {
        this.inventory.addSlots(amount);
    }


    public void resetInventoryData() {
        Inventory tempInventory = new Inventory();
        this.inventory = tempInventory;
    }
    //TODO - "resetInventoryData()" eller "factoryResetInventory"?
    public void factoryResetInventory() {
        inventory.factoryResetInventory();
    }


}