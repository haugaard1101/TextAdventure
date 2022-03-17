package textAdventure;

public class GameEngine {
    private Room currentRoom;
    private boolean keepPlaying = true;
    final Player player = new Player();

    public void go() {
        final UserInterface ui = new UserInterface();
        final Map map = new Map();
        currentRoom = map.getStartRoom();

        ui.welcomeMessage();
        while (keepPlaying) {
            System.out.println(currentRoom.getRoomName());
            System.out.println(currentRoom.getDescription());
            String input = ui.playerInput();
            playerOptions(input);
        }
    }

    public void playerOptions(String input) {
        if (input.equalsIgnoreCase("help")) {
            System.out.println("You can move in the following directions: North, South, East and West");
        } else if (input.equalsIgnoreCase("look")) {
            System.out.println(currentRoom.getDescription());
        } else if (input.equalsIgnoreCase("exit")) {
            System.out.println("Thanks for playing");
            keepPlaying = false;
        }else movement(input);
    }

    public void movement (String input) {
        if (input.equalsIgnoreCase("north")) {
            System.out.println("You chose to travel North");
            if (currentRoom.getNorth() == null) {
                System.out.println("You cannot go that way");
            } else
                player.moveNorth();

        } else if (input.equalsIgnoreCase("south")) {
            System.out.println("You chose to travel South");
            if (currentRoom.getSouth() == null) {
                System.out.println("You cannot go that way");
            } else
                player.moveSouth();

        } else if (input.equalsIgnoreCase("west")) {
            System.out.println("You chose to travel West");
            if (currentRoom.getWest() == null) {
                System.out.println("You cannot go that way");
            } else
                player.moveWest();

        } else if (input.equalsIgnoreCase("east")) {
            System.out.println("You chose to travel East");
            if (currentRoom.getEast() == null) {
                System.out.println("You cannot go that way");
            } else
                player.moveEast();
        } else
            System.out.println("What you want is impossible");
    }
}