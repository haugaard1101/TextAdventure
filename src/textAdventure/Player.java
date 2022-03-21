package textAdventure;

import java.util.ArrayList;

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
        String which = ui.playerInput();
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getItemName().equals(which)) {
                currentRoom.addItem(inventory.get(i));
                inventory.remove(i);
            }
        }
    }

    public void takeItem(Room currentRoom) {
        if (currentRoom.getItem() == null) {
            System.out.println("There is nothing of interest");
        } else
            for (Item i : currentRoom.getItem()) {
                inventory.add(i);
            }
    }

}