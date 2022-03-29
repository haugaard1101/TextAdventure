package textAdventure;

import java.util.ArrayList;
import java.util.Locale;

public class Player {

    private ArrayList<Item> inventory = new ArrayList<>();
    UserInterface ui = new UserInterface();

    private int health = 100;
    private Weapon equippedWeapon;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Room moveNorth(Room currentRoom) {
        currentRoom = currentRoom.getNorth();
        return currentRoom;
    }

    public Room moveSouth(Room currentRoom) {
        currentRoom = currentRoom.getSouth();
        return currentRoom;
    }

    public Room moveWest(Room currentRoom) {
        currentRoom = currentRoom.getWest();
        return currentRoom;
    }

    public Room moveEast(Room currentRoom) {
        currentRoom = currentRoom.getEast();
        return currentRoom;
    }

    public void dropItem(Room currentRoom) {
        String choice = ui.playerInput();
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getItemName().equals(choice)) {
                currentRoom.addItem(inventory.get(i));
                if (inventory.get(i).equals(equippedWeapon)) {
                    equippedWeapon = null;
                }
                inventory.remove(i);
            }
        }
        System.out.println("This room now contains: " + currentRoom.getItem());
    }

    public void takeItem(Room currentRoom) {
        if (currentRoom.getItem().size() == 0) {
            System.out.println("There is nothing to take");
        } else {
            System.out.println("Which item do you wanna pick up?");
            String choice = ui.playerInput().toLowerCase(Locale.ROOT);
            for (int i = 0; i < currentRoom.getItem().size(); i++) {
                if (currentRoom.getItem().get(i).getItemName().equals(choice)) {
                    inventory.add(currentRoom.getItem().get(i));
                }
            }
            System.out.println("Your bag now contains: " + inventory);
            currentRoom.getItem().removeAll(inventory);
        }
    }

    public void eat() {
        String choice = ui.playerInput();
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getItemName().equals(choice) && inventory.get(i) instanceof Food) {
                setHealth(getHealth() + ((Food) inventory.get(i)).getFoodHealth());
                System.out.println("You eat " + inventory.get(i) + " and heal for " + ((Food) inventory.get(i)).getFoodHealth() + " points");
                inventory.remove(i);
                if (getHealth() > 100) {
                    setHealth(100);
                }
            } else
                System.out.println("Why would you even think about eating that?");
        }
    }

    public void equip() {
        String choice = ui.playerInput();
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getItemName().equals(choice) && inventory.get(i) instanceof Weapon) {
                equippedWeapon = ((Weapon) inventory.get(i));

            } else
                System.out.println("And how would you equip that exactly?");
        }
    }

    public void attack() {
        if (equippedWeapon != null && equippedWeapon instanceof RangedWeapon) {
            if (((RangedWeapon) equippedWeapon).getAmmo() <= 0) {
                System.out.println("You are out of ammo");
            } else
                System.out.println("You deal " + equippedWeapon.getDamage() + " damage");
            int currentAmmo = ((RangedWeapon) equippedWeapon).getAmmo();
            ((RangedWeapon) equippedWeapon).setAmmo(currentAmmo-1);
            System.out.println(currentAmmo);
        } else if (equippedWeapon != null) {
            System.out.println("You deal " + equippedWeapon.getDamage() + " damage");
        } else
            System.out.println("You dont have a weapon");

    }
}