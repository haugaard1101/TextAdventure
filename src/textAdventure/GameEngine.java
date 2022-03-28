package textAdventure;

public class GameEngine {
    private Room currentRoom;
    private boolean keepPlaying = true;
    final Player player = new Player();
    final UserInterface ui = new UserInterface();

    public void go() {
        final Map map = new Map();
        currentRoom = map.getStartRoom();

        ui.welcomeMessage();
        System.out.println(currentRoom.getDescription());
        while (keepPlaying) {
            System.out.println(currentRoom.getRoomName());
            ui.whereToGo();
            String input = ui.playerInput();
            playerOptions(input);
        }
    }

    public void playerOptions(String input) {
        if (input.equalsIgnoreCase("help")) {
            System.out.println("You can move in the following directions: North, South, East and West");
        } else if (input.equalsIgnoreCase("look")) {
            System.out.println(currentRoom.getDescription());
            System.out.println(currentRoom.getItem().toString().replace('[', ' ').replace(']', ' '));
        } else if (input.equalsIgnoreCase("exit")) {
            System.out.println("Thanks for playing");
            keepPlaying = false;
        } else if (input.equalsIgnoreCase("health")) {
            System.out.println("Your current health is at " + player.getHealth());
        } else movement(input);
    }

    public void movement(String input) {
        if (input.equalsIgnoreCase("north")) {
            System.out.println("You chose to travel North");
            if (currentRoom.getNorth() == null) {
                System.out.println("You cannot go that way");
            } else
                currentRoom = player.moveNorth(currentRoom);

        } else if (input.equalsIgnoreCase("south")) {
            System.out.println("You chose to travel South");
            if (currentRoom.getSouth() == null) {
                System.out.println("You cannot go that way");
            } else
                currentRoom = player.moveSouth(currentRoom);

        } else if (input.equalsIgnoreCase("west")) {
            System.out.println("You chose to travel West");
            if (currentRoom.getWest() == null) {
                System.out.println("You cannot go that way");
            } else
                currentRoom = player.moveWest(currentRoom);

        } else if (input.equalsIgnoreCase("east")) {
            System.out.println("You chose to travel East");
            if (currentRoom.getEast() == null) {
                System.out.println("You cannot go that way");
            } else
                currentRoom = player.moveEast(currentRoom);
        } else itemsInteractions(input);
    }

    public void itemsInteractions(String input) {
        if (input.equalsIgnoreCase("take")) {
            player.takeItem(currentRoom);
        } else if (input.equalsIgnoreCase("drop")) {
            System.out.println("Which item do you want to drop?");
            player.dropItem(currentRoom);
        } else if (input.equalsIgnoreCase("eat")) {
            System.out.println("Which item would you like to consume?");
            
        }else
            System.out.println("What you want is impossible");

    }
}


//public void findItem(){}

