package textAdventure;

import java.util.ArrayList;
import java.util.Locale;

public class Player {

    private ArrayList<Item> inventory = new ArrayList<>();
    UserInterface ui = new UserInterface();

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
}