package textAdventure;

public class Player {
  Map map = new Map();
  private Room currentRoom = map.getStartRoom();

  public void moveNorth() {
    currentRoom = currentRoom.getNorth();
  }

  public void moveSouth() {
    currentRoom = currentRoom.getSouth();
  }

  public void moveWest() {
    currentRoom = currentRoom.getWest();
  }

  public void moveEast() {
    currentRoom = currentRoom.getEast();
  }

}