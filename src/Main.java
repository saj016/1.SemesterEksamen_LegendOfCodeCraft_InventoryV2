import enums.ConsumableMaterial;
import enums.Rarity;
import enums.WeaponMaterial;
import enums.WearableMaterial;
import inventory.Inventory;
import items.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        InventoryManager inventoryManager = new InventoryManager();
        //InventoryManager creates an inventory and manages only this one inventory

        ItemFactory itemFactory = new ItemFactory();

        //TODO - skal der være en metode til at lave en tilfældig inventory, man kan starte med?
        //loop to create an amount of random items and add to inventory
        for (int i = 0; i < 22; i++) {
            inventoryManager.addItem(ItemFactory.createRandomItem());
        }

        System.out.println(inventoryManager.printSlotOverview());

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
                    if (userChoice > 0 && userChoice < 4) {
                        //if 1 send Bow
                        // if 2 send.... osv
                        //TODO - kald metode til at håndtere søgning efter Weapon
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
                    if (userChoice > 0 && userChoice < 4) {
                        //if 1 send boots
                        // if 2 send.... osv
                        //TODO - kald metode til at håndtere søgning efter Wearable
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
                        "6: Stone{\n" +
                        "7: Wood");
                userInput = input.nextLine();
                userChoice = Integer.parseInt(userInput);
                if (userChoice > 0 && userChoice < 8) {
                    //TODO - kald metode til at håndtere søgning efter materiale
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

        /*if (userChoice == 1){
            System.out.println("Which parameter will you use for your search?\n" +
                    "1: Weapon\n" +
                    "2: Wearable\n" +
                    "3: Consumable");
        }*/

        /*
        1: Type
        2: Materiale
        3: Rarity

        ---1---
        1: Våben
        2: Wearable
        3: Consumable

        ---1.1----
        1: Sværd
        2: Skjold
        3: Bue
        4: Slangebøsse

        ---2---
        1: Wood
        2: Iron
        osv.
         */

        /*---3---
        1: Common
        2: Uncommon
        osv.
*/

    }
}