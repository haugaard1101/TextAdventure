package textAdventure;

public class Player {
  Map map = new Map();

  // private Room currentRoom = map.getStartRoom();

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

}