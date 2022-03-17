package textAdventure;

import java.util.Scanner;

public class UserInterface {

    final Scanner in = new Scanner(System.in);
    final Map adventureMap = new Map();
    private String input;
    private boolean keepPlaying = true;
    private Room currentRoom = adventureMap.getStartRoom();

// skal være her
    void welcomeMessage() {
        System.out.println("""
                You wake up and winter has come early. You need to find firewood to keep you and your family warm.
                Hurry and find the lumberyard in the forrest before it's too late!""");
    }
// skal i Player
    void movement() {
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

    // skal være her
    void playerOptions() {
        while (keepPlaying) {
            System.out.println(currentRoom.getRoomName());
            System.out.println(currentRoom.getDescription());
            System.out.print("\nWhich direction would you like to go?(North, South, East or West): ");
            input = in.nextLine();
            System.out.println();

            if (input.equalsIgnoreCase("help")) {
                System.out.println("You can move in the following directions: North, South, East and West");
            } else if (input.equalsIgnoreCase("look")) {
                System.out.println(currentRoom.getDescription());
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing");
                keepPlaying = false;
            } else movement();
        }
    }
}
