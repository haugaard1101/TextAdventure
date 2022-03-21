package textAdventure;

import java.util.ArrayList;

public class Room {

    private Room north;
    private Room south;
    private Room west;
    private Room east;
    private String description;
    private String roomName;
    private ArrayList<Item> item = new ArrayList<>(6);

    public ArrayList<Item> getItem() {
        return item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void addItem(Item item){
        this.item.add(item);
    }
}

