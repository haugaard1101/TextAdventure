package textAdventure;

public class GameEngine {
Room currentRoom;

  public void go() {
    final UserInterface ui = new UserInterface();
    final Map map = new Map();
    currentRoom = map.getStartRoom();
   // final Player player;
    //player = new Player(map.getStartRoom());


    ui.welcomeMessage();
    while ()
    String input = ui.playerOptions();
    movement(input);

  }
    void movement(String input) {
      //HELE DET STYKKE SKAL VÆRE I PLAYER............................
      if (input.equalsIgnoreCase("north")) {
        System.out.println("You chose to travel North");
        if (currentRoom.getNorth() == null) {
          System.out.println("You cannot go that way");
        } else
          currentRoom = currentRoom.getNorth();

      } else if (input.equalsIgnoreCase("south")) {
        System.out.println("You chose to travel South");
        if (currentRoom.getSouth() == null) {
          System.out.println("You cannot go that way");
        } else
          currentRoom = currentRoom.getSouth();

      } else if (input.equalsIgnoreCase("west")) {
        System.out.println("You chose to travel West");
        if (currentRoom.getWest() == null) {
          System.out.println("You cannot go that way");
        } else
          currentRoom = currentRoom.getWest();

      } else if (input.equalsIgnoreCase("east")) {
        System.out.println("You chose to travel East");
        if (currentRoom.getEast() == null) {
          System.out.println("You cannot go that way");
        } else
          currentRoom = currentRoom.getEast();
      } else
        System.out.println("What you want is impossible");
    }
  }

