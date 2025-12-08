package inventory;

import items.Arrow;
import items.HealthPotion;
import items.Item;

public class InventorySlot {
    /*private Item item;
    private int quantity;

    public InventorySlot() {

    }

    public boolean isEmpty(){
        if (quantity == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canStackWith(Item item) {
        //Downcasting
        if (item instanceof Arrow && this.item instanceof Arrow) {
            Arrow itemArrow = (Arrow)item;
            Arrow thisItemArrow = (Arrow)item;
            if (itemArrow.getMaterial() == thisItemArrow.getMaterial()) {
                return true;
            } else {
                return false;
            }
        } else if (item instanceof HealthPotion && this.item instanceof HealthPotion) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isStackFull(Item item){
        //Downcasting consumables
        if (item instanceof Arrow){
            Arrow myArrow = (Arrow)item;
            if (myArrow.getMaxStack() == quantity){
                return true;
            } else {
                return false;
            }
        } else if (item instanceof HealthPotion){
            HealthPotion myHealthPotion = (HealthPotion)item;
            if (myHealthPotion.getMaxStack() == quantity){
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }*/
}
