package textAdventure;

import java.util.ArrayList;

public class Player {

    private ArrayList<Item> inventory = new ArrayList<>();

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

    public void dropItem() {
        inventory.remove(i);
    }

    public void takeItem() {

        inventory.add(i);
    }

}