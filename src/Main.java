import enums.ConsumableMaterial;
import enums.Rarity;
import enums.WeaponMaterial;
import enums.WearableMaterial;
import exceptions.InventoryWeightLimitReachedException;
import exceptions.NoEmptySlotsAvailableException;
import inventory.Inventory;
import items.*;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static InventoryManager inventoryManager = new InventoryManager();
    //InventoryManager creates an inventory and manages only this one inventory

    static ItemFactory itemFactory = new ItemFactory();

    public static void main(String[] args) {



        //tilføj 3 wood arrows
        for (int i = 0; i < 4; i++) {
            inventoryManager.addItem(itemFactory.createWoodArrow());
        }

        //TODO - skal der være en metode til at lave en tilfældig inventory, man kan starte med?
        //loop to create an amount of random items and add to inventory
        for (int i = 0; i < ; 16i++) {
            try {
                inventoryManager.addItem(itemFactory.createRandomItem());
                //TODO - skal det være
                // "Qualify static 'createRandomItem()' call with reference to class 'ItemFactory'"
                // eller oprettes som et itemFactory objekt og bruges (hvis sidste anbefaler IntelliJ ovenstående)
            } catch (InventoryWeightLimitReachedException e) {
                System.out.println("Cannot add item as inventory weight limit will be exceeded.");
            } catch (NoEmptySlotsAvailableException e) {
                System.out.println("Cannot add item as there are no empty slots available.");
            }
        }

        System.out.println(inventoryManager.printSlotOverview());

        System.out.println("=== Welcome to the Legend of CodeCraft Inventory! ===");


        /*
        Hovedmenu:
        1: Add random item to inventory
            inventoryManager.addItem(ItemFactory.createRandomItem());
        2: Remove item from inventory TODO
        3: Print inventory overview
            System.out.println(inventoryManager.printSlotOverview());
        4: Search for items
            (itemSearchMenu())
        5: Sort inventory TODO
        6: Add inventory slots TODO
        7: Advanced features TODO
            herunder:
            1: Export data
            2: Reset data / delete data (husk en "er du sikker på..." før sletning)
            3: Restore data
         */
        //Search for items menu



        //itemSearchMenu();
        System.out.println("-----Amalie test----");
        inventoryManager.searchForItem("Arrow");
        inventoryManager.searchForItem("Common");
        inventoryManager.searchForItem("Gloves");
        inventoryManager.searchForItem("Iron");
    }

    public static void addRandomItemToInventory() {
        try {
            inventoryManager.addItem(ItemFactory.createRandomItem());
        } catch (InventoryWeightLimitReachedException e){
            System.out.println("Cannot add item as inventory weight limit will be exceeded.");
        } catch (NoEmptySlotsAvailableException e) {
            System.out.println("Cannot add item as there are no empty slots available.");
        }
    }

    public static void removeItemFromInventory() {
        inventoryManager.printSlotOverview();
        System.out.print("\nFrom which slot number do you wish to remove an item: ");
        String userInput = input.nextLine();
        try {
            int userInputInt = Integer.parseInt(userInput);
            //TODO - InventoryManager.removeItemFromInventory(userInputInt)
        } catch (NumberFormatException e) {
            System.out.println("A valid number was not entered");
        }
    }

    public static void itemSearchMenu(){
        //Search for items using parameters
        System.out.println("Which parameter will you use for your search?\n" +
                "1: Type\n" +
                "2: Material\n" +
                "3: Rarity");
        String userInput = input.nextLine();
        try {
            int userChoice = Integer.parseInt(userInput);

            if (userChoice == 1){ //Searching for Type
                System.out.println("Which parameter will you use for your search?\n" +
                        "1: Consumable\n" +
                        "2: Weapon\n" +
                        "3: Wearable");
                userInput = input.nextLine();
                userChoice = Integer.parseInt(userInput);
                if (userChoice == 1){ //Searching for Consumables
                    System.out.println("Which type will you search for?\n " +
                            "1: Health Potion\n" +
                            "2: Arrow\n" +
                            "3: Pellet");
                    userInput = input.nextLine();
                    userChoice = Integer.parseInt(userInput);
                    if (userChoice > 0 && userChoice < 4) {
                        //if 1 send health
                        // if 2 send.... osv
                        //TODO - kald metode til at håndtere søgning efter consumable
                        System.out.println("Søger efter consumable X");
                    } else {
                        System.out.println("Please only choose numbers 1 through 3");
                    }
                } else if (userChoice == 2){ //Searching for Weapons
                    System.out.println("Which type will you search for?\n" +
                            "1: Bow\n" +
                            "2: Sword\n" +
                            "3: Slingshot\n" +
                            "4: Shield");
                    userInput = input.nextLine();
                    userChoice = Integer.parseInt(userInput);
                    if (userChoice > 0 && userChoice < 5) {
                        //if 1 send Bow
                        // if 2 send.... osv
                        //TODO - kald metode til at håndtere søgning efter Weapon
                        System.out.println("Søger efter Weapon X");
                    } else {
                        System.out.println("Please only choose numbers 1 through 3");
                    }
                } else if (userChoice == 3){ //Searching for Wearables
                    System.out.println("Which type will you search for?\n" +
                            "1: Boots\n" +
                            "2: ChestPlate\n" +
                            "3: Gloves\n" +
                            "4: Helmet\n" +
                            "5: Leggings");
                    userInput = input.nextLine();
                    userChoice = Integer.parseInt(userInput);
                    if (userChoice > 0 && userChoice < 6) {
                        //if 1 send boots
                        // if 2 send.... osv
                        //TODO - kald metode til at håndtere søgning efter Wearable
                        System.out.println("Søger efter Wearable X");
                    } else {
                        System.out.println("Please only choose numbers 1 through 3");
                    }
                } else {
                    System.out.println("Please only choose numbers 1 through 3");
                }
            } else if (userChoice == 2){ //Searching for Material
                System.out.println("Which parameter will you use for your search?\n" +
                        "1: ChainMail\n" +
                        "2: Flint\n" +
                        "3: Iron\n" +
                        "4: Leather\n" +
                        "5: Steel\n" +
                        "6: Stone\n" +
                        "7: Wood");
                userInput = input.nextLine();
                userChoice = Integer.parseInt(userInput);
                if (userChoice > 0 && userChoice < 8) {
                    //TODO - kald metode til at håndtere søgning efter materiale
                    System.out.println("Søger efter materiale");
                } else {
                    System.out.println("Please only choose numbers 1 through 7");
                }
            } else if (userChoice == 3) { //Searching for Rarity
                System.out.println("Which parameter will you use for your search?\n" +
                        "1: Common\n" +
                        "2: Uncommon\n" +
                        "3: Rare\n" +
                        "4: Legendary");
                userInput = input.nextLine();
                userChoice = Integer.parseInt(userInput);
                if (userChoice > 0 && userChoice < 5) {
                    //TODO - kald metode til at håndtere søgning efter rarity
                    System.out.println("Søger efter rarity");
                } else {
                    System.out.println("Please only choose numbers 1 through 7");
                }
            } else {
                System.out.println("Please only choose options 1, 2 or 3");
            }

        } catch (NumberFormatException e){
            System.out.println("Please only type a whole number");
            //"You have not inputted a valid number"
        }
    }

    public static void removeItem(){

    }
}